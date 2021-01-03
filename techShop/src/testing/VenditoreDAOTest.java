package testing;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.*;

import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

import javax.naming.Context;
import javax.naming.InitialContext;

import java.sql.Connection;

import org.junit.After;
import org.junit.Before;
import org.junit.jupiter.api.Test;

import junit.framework.TestCase;
import manageraccouting.Venditore;
import model.VenditoreDAO;

/**
 * Test di unita 9_0_VenditoreDAO
 * @author monte
 *
 */
class VenditoreDAOTest extends TestCase{

		
		private static VenditoreDAO model=new VenditoreDAO();
		
		
		
		@Test
		 void testCheckLoginSeller() throws Exception{
			try {
			Venditore vend= new Venditore("Monte97","Saprisapri@97","Vincenzo","Montesano","vincenzomontesano@gmail.com","M	","3482914912","Via santa domenica","Sapri","84073");
			
			Venditore ret=(Venditore) model.checkLoginSeller(vend.getUsername(),vend.getPassword());
			
			}finally {
			model.deleteVenditore("Monte97");
			
			}
		}
		
		@Test
		void testAddVenditore() throws Exception{
			try {
				Venditore vend= new Venditore("Monte97","Saprisapri@97","Vincenzo","Montesano","vincenzomontesano@gmail.com","M	","3482914912","Via santa domenica","Sapri","84073");
				model.addVenditore(vend);
				assertEquals("Monte97", model.checkLoginSeller("Monte97", "Saprisapri@97").getUsername());
			}finally {
				model.deleteVenditore("Monte97");
			}
		}
		
		
		
	}

