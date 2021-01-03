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

import control.LoginVenditore;
import manageraccouting.Utente;
import manageraccouting.Venditore;
import model.VenditoreDAO;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.mockito.Mock;


/**
 * Test Case 1_0_Login_Venditore 
 * @author monte
 *
 */
class tc1_0_Login_Venditore {

	LoginVenditore myServlet;
	VenditoreDAO model=new VenditoreDAO();
	
	@Mock
	HttpServletRequest request;
	
	@Mock
	HttpServletResponse response;
	
	@Mock
	HttpSession session;
	
	@Mock
	Utente u;

	
	@BeforeEach
	public void setUp() throws SQLException{
		request = mock(HttpServletRequest.class);
		response = mock(HttpServletResponse.class);
		session = mock(HttpSession.class);
		myServlet = new LoginVenditore();
		Venditore vend= new Venditore("Monte97","Saprisapri@97","Vincenzo","Montesano","vincenzomontesano@gmail.com","M","3482914912","Via santa domenica","Sapri","84073");
		model.addVenditore(vend);
	}
	

	@AfterEach
	public void tearDown() throws SQLException {
		model.deleteVenditore("Monte97");
	}
	
	
	@Test
	public void tc_1_0_1() throws IOException, ServletException {
		StringWriter output=new StringWriter();
		PrintWriter out=new PrintWriter(output);
		
		when(request.getSession()).thenReturn(session);
		when(session.getAttribute("messaggioerrore")).thenReturn("Errore utente non trovato");
		when(session.getAttribute("redirecterror")).thenReturn("./index.jsp");
		
		when(request.getParameter("username")).thenReturn("aaaaa");
		when(request.getParameter("password")).thenReturn("Password0#");
		
		when(response.getWriter()).thenReturn(out);
		
		myServlet.doPost(request, response);
		System.out.println(output.toString());
		assertEquals("Errore utente non trovato", output.toString());
		
	}
	
	@Test
	public void tc_1_0_2() throws IOException, ServletException {
		StringWriter output=new StringWriter();
		PrintWriter out=new PrintWriter(output);
		
		when(request.getSession()).thenReturn(session);
		when(session.getAttribute("messaggioerrore")).thenReturn("Errore utente non trovato");
		when(session.getAttribute("redirecterror")).thenReturn("./index.jsp");
		
		when(request.getParameter("username")).thenReturn("Vincenzo");
		when(request.getParameter("password")).thenReturn("aaaaa");
		
		when(response.getWriter()).thenReturn(out);
		
		myServlet.doPost(request, response);
		System.out.println(output.toString());
		assertEquals("Errore utente non trovato", output.toString());
		
	}
	
	@Test
	public void tc_1_0_3() throws IOException, ServletException {
		StringWriter output=new StringWriter();
		PrintWriter out=new PrintWriter(output);
		
		when(request.getParameter("username")).thenReturn("Monte97");
		when(request.getParameter("password")).thenReturn("Saprisapri@97");
	
		
		when(request.getSession()).thenReturn(session);
		when(session.getAttribute("venditore-loggato")).thenReturn("n");
		when(session.getAttribute("username")).thenReturn("");
		when(session.getAttribute("utente")).thenReturn(null);
		when(session.getAttribute("username-venditore")).thenReturn("Vincenzo");
		when(session.getAttribute("negozioBean")).thenReturn(null);
		when(session.getAttribute("negozioNome")).thenReturn(null);
		
		
		when(response.getWriter()).thenReturn(out);
		
		myServlet.doPost(request, response);
		System.out.println(output.toString());
		assertEquals("OK", output.toString());
		
	}
	
}
