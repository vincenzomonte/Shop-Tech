package model;

import java.io.Serializable;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;

import managerordine.ArrayRiferimento;
import managerordine.Fattura;
import managerordine.Riferimento;
/**
 * Permette di operare sulla table riferimento per operazioni CRUD
 * @author schettini
 *
 */
public class RiferimentoDAO implements Serializable {
	
	private static DataSource ds;
	private static final String TABLE_RIFERIMENTO="riferimento";
	
	
	
	
	/**
	 * Restituisce la lista di riferimento di un determinato negozio
	 * <pre> Il negozio deve essere presente nel db</pre>
	 * @param nomeNegozio
	 * @return ArrayRiferimento lista che contiene tutte le fatture del determinato negozio passato come input
	 * @throws SQLException
	 */
	public synchronized ArrayRiferimento getArrayRiferimento(String nomeNegozio) throws SQLException{
		Connection connection = null;
		PreparedStatement preparedStatement = null;

		ArrayRiferimento riferimenti = null;
		
		String viewOrdineCliente = " SELECT * from riferimento,fattura  WHERE numeroFattura=numero_Fattura AND Nome_Negozio = ?  ORDER BY dataOrdine DESC";
		
		try {
			//connection = ds.getConnection();
			connection = DriverManagerConnectionPool.getDbConnection();
		
			preparedStatement = connection.prepareStatement(viewOrdineCliente);
			preparedStatement.setString(1,nomeNegozio);
			
			ResultSet rs =  preparedStatement.executeQuery();
			
			riferimenti=new ArrayRiferimento();
			int i=0;
			while(rs.next()) {
				i++;
				Riferimento riferimento=new Riferimento();
				riferimento.setId_prodotto(rs.getInt("ID_Prodotto"));
				riferimento.setNumero_Fattura(rs.getInt("numero_Fattura"));
				riferimento.setNome_Negozio(rs.getString("Nome_Negozio"));
				riferimento.setNome_Categoria(rs.getString("Nome_Categoria"));
				riferimento.setNote(rs.getString("nota"));
				riferimento.setQtaOrdinata(rs.getInt("QtaOrdinata"));
				riferimento.setSconto(rs.getInt("sconto"));
				riferimento.setPrezzoUnitario(rs.getFloat("prezzoUnitario"));
				riferimento.setIva(rs.getInt("IVA"));
				
				Fattura fattura=new Fattura();
				fattura.setNumFattura (rs.getInt("numeroFattura"));
				fattura.setUsername_Cliente(rs.getString("username_Cliente"));
				fattura.setDataOrdine(rs.getString("dataOrdine"));
				fattura.setCapDestinazione(rs.getString("capDestinazione"));
				fattura.setCittaDestinazione(rs.getString("citt�Destinazione"));
				fattura.setViaDestinazione(rs.getString("viaDestinazione"));
				
				riferimento.setFatturaRiferimento(fattura);
				riferimenti.add(riferimento);
			}
			if (i==0)
				return null;
		} 
			finally {
			try {
				if (preparedStatement != null)
					preparedStatement.close();
			} finally {
				if (connection != null)
					//connection.close();
					DriverManagerConnectionPool.releaseConnection(connection);
				
			}
		}
		
		return riferimenti;	
	}
	
	
}