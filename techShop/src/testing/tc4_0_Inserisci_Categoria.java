package testing;

import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.io.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.sql.Connection;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.junit.After;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.Mockito;

import control.InsertCategoria;
import control.LoginVenditore;
import manageraccouting.Utente;
import manageraccouting.Venditore;
import model.CategoriaDAO;
import model.VenditoreDAO;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.mockito.Mock;

class tc4_0_Inserisci_Categoria {
	
	InsertCategoria myServlet;
	
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
		myServlet = new InsertCategoria();
	}
	
	@AfterEach
	public void tearDown() throws SQLException {
		CategoriaDAO cat = new CategoriaDAO();
		cat.deleteCategory("TECH","iPad");
	}
	
	
	@Test
	void tc_4_0_1() throws IOException, ServletException{
		StringWriter output=new StringWriter();
		PrintWriter out=new PrintWriter(output);
		
		
		when(request.getSession()).thenReturn(session);
		when(session.getAttribute("urlLogoCategoria")).thenReturn("images/negozi/TECH/162.jpg");
		
		when(request.getParameter("nomeNegozio")).thenReturn("TECH");
		when(request.getParameter("nomeCategoria")).thenReturn("iPad");
		when(request.getParameter("descCategoria")).thenReturn("");
		
		
		when(response.getWriter()).thenReturn(out);
		
		myServlet.doPost(request, response);
		System.out.println(output.toString());
		assertEquals("descrizione formato errato", output.toString());

	}
	
	

	@Test
	void tc_4_0_2() throws IOException, ServletException{
		StringWriter output=new StringWriter();
		PrintWriter out=new PrintWriter(output);
		
		
		when(request.getSession()).thenReturn(session);
		when(session.getAttribute("urlLogoCategoria")).thenReturn("images/negozi/TECH/162.jpg");
		
		when(request.getParameter("nomeNegozio")).thenReturn("TECH");
		when(request.getParameter("nomeCategoria")).thenReturn("iPad");
		when(request.getParameter("descCategoria")).thenReturn("#descrizione");
		
		
		when(response.getWriter()).thenReturn(out);
		
		myServlet.doPost(request, response);
		System.out.println(output.toString());
		assertEquals("descrizione formato errato", output.toString());

	}
	
	
	
	
    /*test inserisci categoria senza errori*/
	@Test
	void tc_4_0_3() throws IOException, ServletException{
		StringWriter output=new StringWriter();
		PrintWriter out=new PrintWriter(output);
		
		
		when(request.getSession()).thenReturn(session);
		when(session.getAttribute("urlLogoCategoria")).thenReturn("images/negozi/TECH/162.jpg");
		
		when(request.getParameter("nomeNegozio")).thenReturn("TECH");
		when(request.getParameter("nomeCategoria")).thenReturn("iPad");
		when(request.getParameter("descCategoria")).thenReturn("descrizione");
		
		
		when(response.getWriter()).thenReturn(out);
		
		myServlet.doPost(request, response);
		System.out.println(output.toString());
		

	}
	
	
	
	
	
	
	
	
	

}
