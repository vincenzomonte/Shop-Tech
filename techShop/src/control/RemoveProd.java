package control;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.Collection;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import eccezione.ParametroNonCorrettoException;
import managernegozio.Prodotto;

/**
 * Servlet rimuove prodotto
 * @author cetra
 *
 */
@WebServlet("/RemoveProd")
public class RemoveProd extends HttpServlet {
	private static final long serialVersionUID = 1L;
	static Prodotto modProd = new Prodotto();
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RemoveProd() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter out=response.getWriter();
		
		String address="./venditore/index-venditore-prodotti.jsp";
		int id =Integer.parseInt(request.getParameter("ID"));
		Collection<Prodotto> prodotti = null;
		String usernameVenditore = (String) request.getSession().getAttribute("username-venditore");
		String nomeCategoria = (String) request.getSession().getAttribute("categoria");
		
		try {
			/*Prodotto p;
			if((p=modProd.getProductById(id))==null)
				out.print("Errore id non presente");*/
			modProd.deleteProduct(id);
			prodotti = modProd.getAllProductBySellerCategory(usernameVenditore, nomeCategoria);
			request.getSession().setAttribute("prodotti", prodotti);
			response.sendRedirect(address);	
			out.print("OK");
		}catch(SQLException e) {
			e.printStackTrace();
			
		} catch (ParametroNonCorrettoException e) {
			System.out.println("Error:" + e.getMessage());
			request.getSession().setAttribute("messaggioerrore", e.getMessage());
			request.getSession().setAttribute("redirecterror", "./ViewProdotto");
			response.sendRedirect("./error-page.jsp");
			
		}
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}