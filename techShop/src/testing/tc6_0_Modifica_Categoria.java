package testing;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.sql.SQLException;
import java.util.Collection;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;

import control.RemoveCat;
import control.UpdateCategoria;
import manageraccouting.Utente;
import manageraccouting.Venditore;
import managernegozio.Categoria;
import managernegozio.Negozio;
import model.CategoriaDAO;
import model.NegozioDAO;
import model.VenditoreDAO;

/**
 * Test Case 6_0_Modifica_Categoria
 * @author angelo
 *
 */
class tc6_0_Modifica_Categoria {

UpdateCategoria myServlet;
	
	@Mock
	HttpServletRequest request;
	
	@Mock
	HttpServletResponse response;
	
	@Mock
	HttpSession session;


	
	@BeforeEach
	public void setUp() throws SQLException{
		request = mock(HttpServletRequest.class);
		response = mock(HttpServletResponse.class);
		session = mock(HttpSession.class);
		myServlet = new UpdateCategoria();
		vend= new Venditore("Monte97","Saprisapri@97","Vincenzo","Montesano","vincenzomontesano@gmail.com","M","3482914912","Via santa domenica","Sapri","84073");
		model.addVenditore(vend);
		neg=new Negozio("TECH","Monte97","left","Blue","12345678909","2020-11-12","NUOVI SMARTPHONE","santa","76765","76765","images/favicon.ico");
		modeln.addNegozio(neg);
		cat=new Categoria("TECH","iPad","path/negozi/TECH/iPad.jfjf","iPad Air Potente,Attraente,Sorprendente");
		modelc.addCategoria(cat);
		
		
	}
	

	@AfterEach
	public void tearDown() throws SQLException {
		model.deleteVenditore("Monte97");
	}
	
	
	@Test
	public void tc_6_0_1() throws IOException, ServletException, SQLException {
		StringWriter output=new StringWriter();
		PrintWriter out=new PrintWriter(output);
		
		Collection<Categoria>categorie;
		categorie=modelc.getAllCategoryBySeller(vend.getNome());
		
		when(request.getSession()).thenReturn(session);
		when(session.getAttribute("urlLogoCategoria")).thenReturn(cat.getPath());
		when(session.getAttribute("nomeCategoriaImage")).thenReturn(cat.getNomeCategoria());
		
		when(request.getParameter("nomeNegozio")).thenReturn(neg.getNomeNegozio());
		//when(request.getParameter("username-venditore")).thenReturn(vend.getUsername());
		when(request.getParameter("nomeCategoria")).thenReturn(cat.getNomeCategoria());
		when(request.getParameter("descCategoria")).thenReturn("");
		
		
		when(response.getWriter()).thenReturn(out);
		
		myServlet.doPost(request, response);
		System.out.println(output.toString());
		assertEquals("Errore descrizione formato errato", output.toString());
		
	}
	
	@Test
	public void tc_6_0_2() throws IOException, ServletException, SQLException {
		StringWriter output=new StringWriter();
		PrintWriter out=new PrintWriter(output);
		
		Collection<Categoria>categorie;
		categorie=modelc.getAllCategoryBySeller(vend.getNome());
		
		when(request.getSession()).thenReturn(session);
		when(session.getAttribute("urlLogoCategoria")).thenReturn(cat.getPath());
		when(session.getAttribute("nomeCategoriaImage")).thenReturn(cat.getNomeCategoria());
		
		when(request.getParameter("nomeNegozio")).thenReturn(neg.getNomeNegozio());
		//when(request.getParameter("username-venditore")).thenReturn(vend.getUsername());
		when(request.getParameter("nomeCategoria")).thenReturn(cat.getNomeCategoria());
		when(request.getParameter("descCategoria")).thenReturn("#descrizione");
		
		
		when(response.getWriter()).thenReturn(out);
		
		myServlet.doPost(request, response);
		System.out.println(output.toString());
		assertEquals("Errore descrizione formato errato", output.toString());
		
	}
	
	@Test
	public void tc_6_0_3() throws IOException, ServletException, SQLException {
		StringWriter output=new StringWriter();
		PrintWriter out=new PrintWriter(output);
		
		Collection<Categoria>categorie;
		categorie=modelc.getAllCategoryBySeller(vend.getNome());
		
		when(request.getSession()).thenReturn(session);
		when(session.getAttribute("urlLogoCategoria")).thenReturn(cat.getPath());
		when(session.getAttribute("nomeCategoriaImage")).thenReturn(cat.getNomeCategoria());
		
		when(request.getParameter("nomeNegozio")).thenReturn(neg.getNomeNegozio());
		//when(request.getParameter("username-venditore")).thenReturn(vend.getUsername());
		when(request.getParameter("nomeCategoria")).thenReturn(cat.getNomeCategoria());
		when(request.getParameter("descCategoria")).thenReturn("la categoria comprende");
		
		
		when(response.getWriter()).thenReturn(out);
		
		myServlet.doPost(request, response);
		System.out.println(output.toString());
		assertEquals("OK", output.toString());
		
	}
	
	
	VenditoreDAO model=new VenditoreDAO();
	NegozioDAO modeln=new NegozioDAO();
	CategoriaDAO modelc=new CategoriaDAO();
	Negozio neg;
	Venditore vend;
	Categoria cat;
	
}
