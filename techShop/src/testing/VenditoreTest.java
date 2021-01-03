package testing;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import manageraccouting.Venditore;
import model.VenditoreDAO;

/**
 * Test di unita Venditore
 * @author monte
 *
 */
class VenditoreTest {
	static VenditoreDAO model= new VenditoreDAO();
	
	@Test
	void testVenditoreIsEmpty() {
		Venditore vd=new Venditore();
		assertNotNull(vd);
	}
	
	@Test 
	void testGetNome() {
		Venditore vend= new Venditore("Monte97","Saprisapri@97","Vincenzo","Montesano","vincenzomontesano@gmail.com","M	","3482914912","Via santa domenica","Sapri","84073");
		assertEquals("Vincenzo", vend.getNome());
	}

	@Test 
	void testSetNome() {
		Venditore vend= new Venditore("Monte97","Saprisapri@97","Vincenzo","Montesano","vincenzomontesano@gmail.com","M	","3482914912","Via santa domenica","Sapri","84073");
		vend.setNome("Romolo");
		assertEquals("Romolo", vend.getNome());
	}
	
	@Test 
	void testGetCognome() {
		Venditore vend= new Venditore("Monte97","Saprisapri@97","Vincenzo","Montesano","vincenzomontesano@gmail.com","M	","3482914912","Via santa domenica","Sapri","84073");
		assertEquals("Montesano", vend.getCognome());
	}

	@Test 
	void testSetCognome() {
		Venditore vend= new Venditore("Monte97","Saprisapri@97","Vincenzo","Montesano","vincenzomontesano@gmail.com","M	","3482914912","Via santa domenica","Sapri","84073");
		vend.setCognome("Lulic");
		assertEquals("Lulic", vend.getCognome());
	}
	
	@Test 
	void testGetEmail() {
		Venditore vend= new Venditore("Monte97","Saprisapri@97","Vincenzo","Montesano","vincenzomontesano@gmail.com","M	","3482914912","Via santa domenica","Sapri","84073");
		assertEquals("vincenzomontesano@gmail.com", vend.getEmail());
	}

	@Test 
	void testSetEmail() {
		Venditore vend= new Venditore("Monte97","Saprisapri@97","Vincenzo","Montesano","vincenzomontesano@gmail.com","M	","3482914912","Via santa domenica","Sapri","84073");
		vend.setEmail("lulic@gmail.com");
		assertEquals("lulic@gmail.com", vend.getEmail());
	}
	
	@Test 
	void testGetSesso() {
		Venditore vend= new Venditore("Monte97","Saprisapri@97","Vincenzo","Montesano","vincenzomontesano@gmail.com","M","3482914912","Via santa domenica","Sapri","84073");
		assertEquals("M", vend.getSesso());
	}

	@Test 
	void testSetSesso() {
		Venditore vend= new Venditore("Monte97","Saprisapri@97","Vincenzo","Montesano","vincenzomontesano@gmail.com","M	","3482914912","Via santa domenica","Sapri","84073");
		vend.setSesso("F");
		assertEquals("F", vend.getSesso());
	}
	
	@Test 
	void testGetTelefono() {
		Venditore vend= new Venditore("Monte97","Saprisapri@97","Vincenzo","Montesano","vincenzomontesano@gmail.com","M	","3482914912","Via santa domenica","Sapri","84073");
		assertEquals("3482914912", vend.getTelefono());
	}

	@Test 
	void testSetTelefono() {
		Venditore vend= new Venditore("Monte97","Saprisapri@97","Vincenzo","Montesano","vincenzomontesano@gmail.com","M	","3482914912","Via santa domenica","Sapri","84073");
		vend.setTelefono("0000000000");
		assertEquals("0000000000", vend.getTelefono());
	}
	
	@Test 
	void testGetVia() {
		Venditore vend= new Venditore("Monte97","Saprisapri@97","Vincenzo","Montesano","vincenzomontesano@gmail.com","M	","3482914912","Via santa domenica","Sapri","84073");
		assertEquals("Via santa domenica", vend.getVia());
	}

	@Test 
	void testSetVia() {
		Venditore vend= new Venditore("Monte97","Saprisapri@97","Vincenzo","Montesano","vincenzomontesano@gmail.com","M	","3482914912","Via santa domenica","Sapri","84073");
		vend.setVia("Gianflanco");
		assertEquals("Gianflanco", vend.getVia());
	}
	
	@Test 
	void testGetCitta() {
		Venditore vend= new Venditore("Monte97","Saprisapri@97","Vincenzo","Montesano","vincenzomontesano@gmail.com","M	","3482914912","Via santa domenica","Sapri","84073");
		assertEquals("Sapri", vend.getCitta());
	}

	@Test 
	void testSetCitta() {
		Venditore vend= new Venditore("Monte97","Saprisapri@97","Vincenzo","Montesano","vincenzomontesano@gmail.com","M	","3482914912","Via santa domenica","Sapri","84073");
		vend.setCitta("Roma");
		assertEquals("Roma", vend.getCitta());
	}
	
	@Test 
	void testGetCap() {
		Venditore vend= new Venditore("Monte97","Saprisapri@97","Vincenzo","Montesano","vincenzomontesano@gmail.com","M	","3482914912","Via santa domenica","Sapri","85100");
		assertEquals("85100", vend.getCap());
	}

	@Test 
	void testSetCap() {
		Venditore vend= new Venditore("Monte97","Saprisapri@97","Vincenzo","Montesano","vincenzomontesano@gmail.com","M	","3482914912","Via santa domenica","Sapri","84073");
		vend.setCap("84600");
		assertEquals("84600", vend.getCap());
	}
}
