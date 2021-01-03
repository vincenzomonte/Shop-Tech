package testing;

import static org.junit.jupiter.api.Assertions.*;

import java.sql.Connection;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.junit.After;
import org.junit.Before;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import manageraccouting.Venditore;
import managernegozio.Negozio;
import model.NegozioDAO;
import model.VenditoreDAO;

/**
 * Test di unita NegozioDAO
 * @author angelo
 *
 */
class NegozioDAOTest {
	private static NegozioDAO model=new NegozioDAO();
	private static Connection connection;
	
	
	
	@BeforeAll
	 static public void setUp() throws Exception {
		 VenditoreDAO modelVenditore=new VenditoreDAO();
		 modelVenditore.addVenditore(new Venditore("Monte97","Saprisapri@97","Vincenzo","Montesano","vincenzomontesano@gmail.com","M","3482914912","Via santa domenica","Sapri","84073"));
	}


	@Test
	void testGetNegozio() throws Exception {
		try {
		Negozio negozio = new Negozio("TECH","Monte97","left","Blue","12345678909","2020-11-12","NUOVI SMARTPHONE","santa","76765","76765","images/favicon.ico");
		model.addNegozio(negozio);
		
		Negozio test = model.getNegozio(negozio.getUsernameVenditore());
		
		assertEquals(negozio.getUsernameVenditore(),test.getUsernameVenditore());
		
		}finally{
			model.deleteShop("TECH");
		}
		
		
	}
	
	
	@Test
	void testAddNegozio() throws Exception {
		try {
			Negozio negozio = new Negozio("TECH","Monte97","left","Blue","12345678909","2020-11-12","NUOVI SMARTPHONE","santa","76765","76765","images/favicon.ico");
			model.addNegozio(negozio);
			assertEquals(negozio.getNomeNegozio(), model.getNegozio("Monte97").getNomeNegozio());
		}finally {
			model.deleteShop("TECH");
		}
	}
	
	@Test
	void testUpdateLogoNegozio() throws Exception {
		try {
			Negozio negozio = new Negozio("TECH","Monte97","left","Blue","12345678909","2020-11-12","NUOVI SMARTPHONE","santa","76765","76765","images/favicon.ico");
			boolean result = model.updateLogoNegozio(negozio.getNomeNegozio(), negozio.getLogo());
			assertTrue(result);
		}finally {
			model.deleteShop("TECH");
		}
	}
	
	
	

	@Test
	void getNegozioByName() throws Exception {
		try {
			Negozio negozio = new Negozio("TECH","Monte97","left","Blue","12345678909","2020-11-12","NUOVI SMARTPHONE","santa","76765","76765","images/favicon.ico");
			model.addNegozio(negozio);
			Negozio test = model.getNegozioByName(negozio.getNomeNegozio());
			assertEquals(negozio.getNomeNegozio(),test.getNomeNegozio());
		}finally {
			model.deleteShop("TECH");
		}
		
	}
	
	
	
	
	
	
	
	
	
	@AfterAll
	static public void remove() throws Exception  {
		 VenditoreDAO modelVenditore=new VenditoreDAO();
		 modelVenditore.deleteVenditore("Monte97");
		 
	}
	

}
