package testing;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;

import control.InsertCategoria;
import control.InsertProduct;
import manageraccouting.Venditore;
import managernegozio.Categoria;
import managernegozio.Negozio;
import model.CategoriaDAO;
import model.NegozioDAO;
import model.VenditoreDAO;

public class tc5_0_InserisciProdotto {
	InsertProduct myServlet;
	
	Venditore vend;
	VenditoreDAO modelv=new VenditoreDAO();
	Negozio neg;
	NegozioDAO modeln=new NegozioDAO();
	CategoriaDAO modelc=new CategoriaDAO();
	Categoria cat;
	
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
		myServlet = new InsertProduct();
		
		vend= new Venditore("Monte97","Saprisapri@97","Vincenzo","Montesano","vincenzomontesano@gmail.com","M","3482914912","Via santa domenica","Sapri","84073");
		modelv.addVenditore(vend);
		neg=new Negozio("TECH","Monte97","left","Blue","12345678909","2020-11-12","NUOVI SMARTPHONE","santa","76765","76765","images/favicon.ico");
		modeln.addNegozio(neg);
		cat=new Categoria( "TECH",  "iPad", "path/negozi/TECH/iPad.jfjf",  "iPad Air Potente,Attraente,Sorprendente");
		modelc.addCategoria(cat);
	}
	
	@Test
	public void tc_5_0_1() throws IOException, ServletException {
		StringWriter output=new StringWriter();
		PrintWriter out=new PrintWriter(output);
		
		when(request.getSession()).thenReturn(session);
		when(session.getAttribute("urlLogoProdotto")).thenReturn("images/favicon.ico");
		
		when(request.getParameter("nomeNegozio")).thenReturn(neg.getNomeNegozio());
		when(request.getParameter("nomeCategoria")).thenReturn(cat.getNomeCategoria());
		when(request.getParameter("nomeProdotto")).thenReturn("");
		when(request.getParameter("descProdotto")).thenReturn("telefono");
		when(request.getParameter("ivaProdotto")).thenReturn("22");
		when(request.getParameter("prezzoProdotto")).thenReturn("500.99");
		when(request.getParameter("qtaProdotto")).thenReturn("100");
		when(request.getParameter("scontoProdotto")).thenReturn("20");
		
		
		when(response.getWriter()).thenReturn(out);
		
		myServlet.doPost(request, response);
		System.out.println(output.toString());
		assertEquals("nome prodotto non rispetta formato", output.toString());
	}
	
	
	
	@Test
	public void tc_5_0_2() throws IOException, ServletException {
		StringWriter output=new StringWriter();
		PrintWriter out=new PrintWriter(output);
		
		when(request.getSession()).thenReturn(session);
		when(session.getAttribute("urlLogoProdotto")).thenReturn("images/favicon.ico");
		
		when(request.getParameter("nomeNegozio")).thenReturn(neg.getNomeNegozio());
		when(request.getParameter("nomeCategoria")).thenReturn(cat.getNomeCategoria());
		when(request.getParameter("nomeProdotto")).thenReturn("Apple 100% Originale");
		when(request.getParameter("descProdotto")).thenReturn("telefono");
		when(request.getParameter("ivaProdotto")).thenReturn("22");
		when(request.getParameter("prezzoProdotto")).thenReturn("500.99");
		when(request.getParameter("qtaProdotto")).thenReturn("100");
		when(request.getParameter("scontoProdotto")).thenReturn("20");
		
		
		when(response.getWriter()).thenReturn(out);
		
		myServlet.doPost(request, response);
		System.out.println(output.toString());
		assertEquals("nome prodotto non rispetta formato", output.toString());
	}
	
	@Test
	public void tc_5_0_3() throws IOException, ServletException {
		StringWriter output=new StringWriter();
		PrintWriter out=new PrintWriter(output);
		
		when(request.getSession()).thenReturn(session);
		when(session.getAttribute("urlLogoProdotto")).thenReturn("images/favicon.ico");
		
		when(request.getParameter("nomeNegozio")).thenReturn(neg.getNomeNegozio());
		when(request.getParameter("nomeCategoria")).thenReturn(cat.getNomeCategoria());
		when(request.getParameter("nomeProdotto")).thenReturn("telefono");
		when(request.getParameter("descProdotto")).thenReturn("");
		when(request.getParameter("ivaProdotto")).thenReturn("22");
		when(request.getParameter("prezzoProdotto")).thenReturn("500.99");
		when(request.getParameter("qtaProdotto")).thenReturn("100");
		when(request.getParameter("scontoProdotto")).thenReturn("20");
		
		
		when(response.getWriter()).thenReturn(out);
		
		myServlet.doPost(request, response);
		System.out.println(output.toString());
		assertEquals("descrizione non rispetta formato", output.toString());
	}
	
	@Test
	public void tc_5_0_4() throws IOException, ServletException {
		StringWriter output=new StringWriter();
		PrintWriter out=new PrintWriter(output);
		
		when(request.getSession()).thenReturn(session);
		when(session.getAttribute("urlLogoProdotto")).thenReturn("images/favicon.ico");
		
		when(request.getParameter("nomeNegozio")).thenReturn(neg.getNomeNegozio());
		when(request.getParameter("nomeCategoria")).thenReturn(cat.getNomeCategoria());
		when(request.getParameter("nomeProdotto")).thenReturn("Apple");
		when(request.getParameter("descProdotto")).thenReturn("#telefono");
		when(request.getParameter("ivaProdotto")).thenReturn("22");
		when(request.getParameter("prezzoProdotto")).thenReturn("500.99");
		when(request.getParameter("qtaProdotto")).thenReturn("100");
		when(request.getParameter("scontoProdotto")).thenReturn("20");
		
		
		when(response.getWriter()).thenReturn(out);
		
		myServlet.doPost(request, response);
		System.out.println(output.toString());
		assertEquals("descrizione non rispetta formato", output.toString());
	}
	
	
	@Test
	public void tc_5_0_5() throws IOException, ServletException {
		StringWriter output=new StringWriter();
		PrintWriter out=new PrintWriter(output);
		
		when(request.getSession()).thenReturn(session);
		when(session.getAttribute("urlLogoProdotto")).thenReturn("images/favicon.ico");
		
		when(request.getParameter("nomeNegozio")).thenReturn(neg.getNomeNegozio());
		when(request.getParameter("nomeCategoria")).thenReturn(cat.getNomeCategoria());
		when(request.getParameter("nomeProdotto")).thenReturn("Apple");
		when(request.getParameter("descProdotto")).thenReturn("telefono");
		when(request.getParameter("ivaProdotto")).thenReturn("22");
		when(request.getParameter("prezzoProdotto")).thenReturn("24");
		when(request.getParameter("qtaProdotto")).thenReturn("100");
		when(request.getParameter("scontoProdotto")).thenReturn("20");
		
		
		when(response.getWriter()).thenReturn(out);
		
		myServlet.doPost(request, response);
		System.out.println(output.toString());
		assertEquals("prezzo non rispetta formato", output.toString());
	}
	
	
	@Test
	public void tc_5_0_6() throws IOException, ServletException {
		StringWriter output=new StringWriter();
		PrintWriter out=new PrintWriter(output);
		
		when(request.getSession()).thenReturn(session);
		when(session.getAttribute("urlLogoProdotto")).thenReturn("images/favicon.ico");
		
		when(request.getParameter("nomeNegozio")).thenReturn(neg.getNomeNegozio());
		when(request.getParameter("nomeCategoria")).thenReturn(cat.getNomeCategoria());
		when(request.getParameter("nomeProdotto")).thenReturn("Apple");
		when(request.getParameter("descProdotto")).thenReturn("telefono");
		when(request.getParameter("ivaProdotto")).thenReturn("22");
		when(request.getParameter("prezzoProdotto")).thenReturn("");
		when(request.getParameter("qtaProdotto")).thenReturn("100");
		when(request.getParameter("scontoProdotto")).thenReturn("20");
		
		
		when(response.getWriter()).thenReturn(out);
		
		myServlet.doPost(request, response);
		System.out.println(output.toString());
		assertEquals("prezzo non rispetta formato", output.toString());
	}
	
	
	
	@Test
	public void tc_5_0_7() throws IOException, ServletException {
		StringWriter output=new StringWriter();
		PrintWriter out=new PrintWriter(output);
		
		when(request.getSession()).thenReturn(session);
		when(session.getAttribute("urlLogoProdotto")).thenReturn("images/favicon.ico");
		
		when(request.getParameter("nomeNegozio")).thenReturn(neg.getNomeNegozio());
		when(request.getParameter("nomeCategoria")).thenReturn(cat.getNomeCategoria());
		when(request.getParameter("nomeProdotto")).thenReturn("Apple");
		when(request.getParameter("descProdotto")).thenReturn("telefono");
		when(request.getParameter("ivaProdotto")).thenReturn("");
		when(request.getParameter("prezzoProdotto")).thenReturn("500.99");
		when(request.getParameter("qtaProdotto")).thenReturn("100");
		when(request.getParameter("scontoProdotto")).thenReturn("20");
		
		
		when(response.getWriter()).thenReturn(out);
		
		myServlet.doPost(request, response);
		System.out.println(output.toString());
		assertEquals("iva non rispetta formato", output.toString());
	}
	
	
	@Test
	public void tc_5_0_8() throws IOException, ServletException {
		StringWriter output=new StringWriter();
		PrintWriter out=new PrintWriter(output);
		
		when(request.getSession()).thenReturn(session);
		when(session.getAttribute("urlLogoProdotto")).thenReturn("images/favicon.ico");
		
		when(request.getParameter("nomeNegozio")).thenReturn(neg.getNomeNegozio());
		when(request.getParameter("nomeCategoria")).thenReturn(cat.getNomeCategoria());
		when(request.getParameter("nomeProdotto")).thenReturn("Apple");
		when(request.getParameter("descProdotto")).thenReturn("telefono");
		when(request.getParameter("ivaProdotto")).thenReturn("223");
		when(request.getParameter("prezzoProdotto")).thenReturn("500.99");
		when(request.getParameter("qtaProdotto")).thenReturn("100");
		when(request.getParameter("scontoProdotto")).thenReturn("20");
		
		
		when(response.getWriter()).thenReturn(out);
		
		myServlet.doPost(request, response);
		System.out.println(output.toString());
		assertEquals("iva non rispetta formato", output.toString());
	}
	
	@Test
	public void tc_5_0_9() throws IOException, ServletException {
		StringWriter output=new StringWriter();
		PrintWriter out=new PrintWriter(output);
		
		when(request.getSession()).thenReturn(session);
		when(session.getAttribute("urlLogoProdotto")).thenReturn("images/favicon.ico");
		
		when(request.getParameter("nomeNegozio")).thenReturn(neg.getNomeNegozio());
		when(request.getParameter("nomeCategoria")).thenReturn(cat.getNomeCategoria());
		when(request.getParameter("nomeProdotto")).thenReturn("Apple");
		when(request.getParameter("descProdotto")).thenReturn("telefono");
		when(request.getParameter("ivaProdotto")).thenReturn("22");
		when(request.getParameter("prezzoProdotto")).thenReturn("500.99");
		when(request.getParameter("qtaProdotto")).thenReturn("");
		when(request.getParameter("scontoProdotto")).thenReturn("20");
		
		
		when(response.getWriter()).thenReturn(out);
		
		myServlet.doPost(request, response);
		System.out.println(output.toString());
		assertEquals("quantita non rispetta formato", output.toString());
	}
	
	
	@Test
	public void tc_5_0_10() throws IOException, ServletException {
		StringWriter output=new StringWriter();
		PrintWriter out=new PrintWriter(output);
		
		when(request.getSession()).thenReturn(session);
		when(session.getAttribute("urlLogoProdotto")).thenReturn("images/favicon.ico");
		
		when(request.getParameter("nomeNegozio")).thenReturn(neg.getNomeNegozio());
		when(request.getParameter("nomeCategoria")).thenReturn(cat.getNomeCategoria());
		when(request.getParameter("nomeProdotto")).thenReturn("Apple");
		when(request.getParameter("descProdotto")).thenReturn("telefono");
		when(request.getParameter("ivaProdotto")).thenReturn("22");
		when(request.getParameter("prezzoProdotto")).thenReturn("500.99");
		when(request.getParameter("qtaProdotto")).thenReturn("000");
		when(request.getParameter("scontoProdotto")).thenReturn("20");
		
		
		when(response.getWriter()).thenReturn(out);
		
		myServlet.doPost(request, response);
		System.out.println(output.toString());
		assertEquals("quantita non rispetta formatook", output.toString());
	}
	
	@Test
	public void tc_5_0_11() throws IOException, ServletException {
		StringWriter output=new StringWriter();
		PrintWriter out=new PrintWriter(output);
		
		when(request.getSession()).thenReturn(session);
		when(session.getAttribute("urlLogoProdotto")).thenReturn("images/favicon.ico");
		
		when(request.getParameter("nomeNegozio")).thenReturn(neg.getNomeNegozio());
		when(request.getParameter("nomeCategoria")).thenReturn(cat.getNomeCategoria());
		when(request.getParameter("nomeProdotto")).thenReturn("Apple");
		when(request.getParameter("descProdotto")).thenReturn("telefono");
		when(request.getParameter("ivaProdotto")).thenReturn("22");
		when(request.getParameter("prezzoProdotto")).thenReturn("500.99");
		when(request.getParameter("qtaProdotto")).thenReturn("10");
		when(request.getParameter("scontoProdotto")).thenReturn("200");
		
		
		when(response.getWriter()).thenReturn(out);
		
		myServlet.doPost(request, response);
		System.out.println(output.toString());
		assertEquals("sconto non rispetta formato", output.toString());
	}
	
	@Test
	public void tc_5_0_12() throws IOException, ServletException {
		StringWriter output=new StringWriter();
		PrintWriter out=new PrintWriter(output);
		
		when(request.getSession()).thenReturn(session);
		when(session.getAttribute("urlLogoProdotto")).thenReturn("images/favicon.ico");
		
		when(request.getParameter("nomeNegozio")).thenReturn(neg.getNomeNegozio());
		when(request.getParameter("nomeCategoria")).thenReturn(cat.getNomeCategoria());
		when(request.getParameter("nomeProdotto")).thenReturn("Apple");
		when(request.getParameter("descProdotto")).thenReturn("telefono");
		when(request.getParameter("ivaProdotto")).thenReturn("22");
		when(request.getParameter("prezzoProdotto")).thenReturn("500.99");
		when(request.getParameter("qtaProdotto")).thenReturn("10");
		when(request.getParameter("scontoProdotto")).thenReturn("");
		
		
		when(response.getWriter()).thenReturn(out);
		
		myServlet.doPost(request, response);
		System.out.println(output.toString());
		assertEquals("sconto non rispetta formato", output.toString());
	}
	
	
	@Test
	public void tc_5_0_13() throws IOException, ServletException {
		StringWriter output=new StringWriter();
		PrintWriter out=new PrintWriter(output);
		
		when(request.getSession()).thenReturn(session);
		when(session.getAttribute("urlLogoProdotto")).thenReturn("images/favicon.ico");
		
		when(request.getParameter("nomeNegozio")).thenReturn(neg.getNomeNegozio());
		when(request.getParameter("nomeCategoria")).thenReturn(cat.getNomeCategoria());
		when(request.getParameter("nomeProdotto")).thenReturn("Apple");
		when(request.getParameter("descProdotto")).thenReturn("telefono");
		when(request.getParameter("ivaProdotto")).thenReturn("22");
		when(request.getParameter("prezzoProdotto")).thenReturn("500.99");
		when(request.getParameter("qtaProdotto")).thenReturn("10");
		when(request.getParameter("scontoProdotto")).thenReturn("23");
		
		
		when(response.getWriter()).thenReturn(out);
		
		myServlet.doPost(request, response);
		System.out.println(output.toString());
		assertEquals("ok", output.toString());
	}
	
	
	
	
	
	
	
	
	@AfterEach
	public void tearDown() throws SQLException {
		modelv.deleteVenditore("Vincenzo");
		modeln.deleteShop("AppleShop");
		modelc.deleteCategory("AppleShop", "Telfoni");
	}
	
	
	

}
