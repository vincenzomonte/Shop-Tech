package testing;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import managernegozio.Negozio;

/**
 * Test di unita Negozio
 * @author schettini
 *
 */
class NegozioTest {

	@Test
	void testNegozioCostruttore() {
		Negozio negozio = new Negozio();
		assertNotNull(negozio);
	}
	
	@Test
	void testGetLogo() {
		Negozio negozio = new Negozio("TECH","Monte97","left","Blue","12345678909","2020-11-12","NUOVI SMARTPHONE","santa","76765","76765","images/favicon.ico");
		assertEquals("images/favicon.ico",negozio.getLogo());
	}
	
	@Test
	void testSetLogo() {
		Negozio negozio = new Negozio("TECH","Monte97","left","Blue","12345678909","2020-11-12","NUOVI SMARTPHONE","santa","76765","76765","images/favicon.ico");
		negozio.setLogo("images/negozi/Pacifico/Pac.png");
		assertEquals("images/negozi/Pacifico/Pac.png",negozio.getLogo());
	}
	
	@Test
	void testGetNomeNegozio() {
		Negozio negozio = new Negozio("TECH","Monte97","left","Blue","12345678909","2020-11-12","NUOVI SMARTPHONE","santa","76765","76765","images/favicon.ico");
		assertEquals("TECH",negozio.getNomeNegozio());
	}
	
	@Test
	void testSetNomeNegozio() {
		Negozio negozio = new Negozio("TECH","Monte97","left","Blue","12345678909","2020-11-12","NUOVI SMARTPHONE","santa","76765","76765","images/favicon.ico");
		negozio.setNomeNegozio("SHOP");
		assertEquals("SHOP",negozio.getNomeNegozio());
	}
	
	
	@Test
	void testGetUsernameVenditore() {
		Negozio negozio = new Negozio("TECH","Monte97","left","Blue","12345678909","2020-11-12","NUOVI SMARTPHONE","santa","76765","76765","images/favicon.ico");
		assertEquals("Monte97",negozio.getUsernameVenditore());
	}
	
	@Test
	void testSetUsernameVenditore() {
		Negozio negozio = new Negozio("TECH","Monte97","left","Blue","12345678909","2020-11-12","NUOVI SMARTPHONE","santa","76765","76765","images/favicon.ico");
		negozio.setUsernameVenditore("Angelo");;
		assertEquals("Angelo",negozio.getUsernameVenditore());
	}
	
	@Test
	void testGetDesign() {
		Negozio negozio = new Negozio("TECH","Monte97","left","Blue","12345678909","2020-11-12","NUOVI SMARTPHONE","santa","76765","76765","images/favicon.ico");
		assertEquals("left",negozio.getDesign());
	}
	
	
	@Test
	void testSetDesign() {
		Negozio negozio = new Negozio("TECH","Monte97","left","Blue","12345678909","2020-11-12","NUOVI SMARTPHONE","santa","76765","76765","images/favicon.ico");
		negozio.setDesign("right");
		assertEquals("right",negozio.getDesign());
	}
	
	@Test
	void testGetColore() {
		Negozio negozio = new Negozio("TECH","Monte97","left","Blue","12345678909","2020-11-12","NUOVI SMARTPHONE","santa","76765","76765","images/favicon.ico");
		assertEquals("Blue",negozio.getColore());
	}
	
	
	@Test
	void testSetColore() {
		Negozio negozio = new Negozio("TECH","Monte97","left","Blue","12345678909","2020-11-12","NUOVI SMARTPHONE","santa","76765","76765","images/favicon.ico");
		negozio.setColore("Verde");
		assertEquals("Verde",negozio.getColore());
	}
	
	@Test
	void testGetPartitaIva() {
		Negozio negozio = new Negozio("TECH","Monte97","left","Blue","12345678909","2020-11-12","NUOVI SMARTPHONE","santa","76765","76765","images/favicon.ico");
		assertEquals("12345678909",negozio.getPartitaIva());
	}
	
	
	@Test
	void testSetPartitaIva() {
		Negozio negozio = new Negozio("TECH","Monte97","left","Blue","12345678909","2020-11-12","NUOVI SMARTPHONE","santa","76765","76765","images/favicon.ico");
		negozio.setPartitaIva("123456789");;
		assertEquals("123456789",negozio.getPartitaIva());
	}
	
	@Test
	void testGetDataIscrizione() {
		Negozio negozio = new Negozio("TECH","Monte97","left","Blue","12345678909","2020-11-12","NUOVI SMARTPHONE","santa","76765","76765","images/favicon.ico");
		assertEquals("2020-11-12",negozio.getDataIscrizione());
	}
	
	
	@Test
	void testSetDataIscrizione() {
		Negozio negozio = new Negozio("TECH","Monte97","left","Blue","12345678909","2020-11-12","NUOVI SMARTPHONE","santa","76765","76765","images/favicon.ico");
		negozio.setDataIscrizione("2020-12-12");
		assertEquals("2020-12-12",negozio.getDataIscrizione());
	}
	
	@Test
	void testGetDescrizione() {
		Negozio negozio = new Negozio("TECH","Monte97","left","Blue","12345678909","2020-11-12","NUOVI SMARTPHONE","santa","76765","76765","images/favicon.ico");
		assertEquals("NUOVI SMARTPHONE",negozio.getDescrizione());
	}
	
	
	@Test
	void testSetDescrizione() {
		Negozio negozio = new Negozio("TECH","Monte97","left","Blue","12345678909","2020-11-12","NUOVI SMARTPHONE","santa","76765","76765","images/favicon.ico");
		negozio.setDescrizione("NUOVI SMARTPHONE MODERNI");
		assertEquals("NUOVI SMARTPHONE MODERNI",negozio.getDescrizione());
	}
	
	@Test
	void testGetVia() {
		Negozio negozio = new Negozio("TECH","Monte97","left","Blue","12345678909","2020-11-12","NUOVI SMARTPHONE","santa","76765","76765","images/favicon.ico");
		assertEquals("santa",negozio.getVia());
	}
	
	
	@Test
	void testSetVia() {
		Negozio negozio = new Negozio("TECH","Monte97","left","Blue","12345678909","2020-11-12","NUOVI SMARTPHONE","santa","76765","76765","images/favicon.ico");
		negozio.setVia("Petrarca");
		assertEquals("Petrarca",negozio.getVia());
	}
	
	@Test
	void testGetCitta() {
		Negozio negozio = new Negozio("TECH","Monte97","left","Blue","12345678909","2020-11-12","NUOVI SMARTPHONE","santa","76765","76765","images/favicon.ico");
		assertEquals("76765",negozio.getCitta());
	}
	
	
	@Test
	void testSetCitta() {
		Negozio negozio = new Negozio("TECH","Monte97","left","Blue","12345678909","2020-11-12","NUOVI SMARTPHONE","santa","76765","76765","images/favicon.ico");
		negozio.setCitta("caserta");
		assertEquals("caserta",negozio.getCitta());
	}
	
	
	@Test
	void testGetCap() {
		Negozio negozio = new Negozio("TECH","Monte97","left","Blue","12345678909","2020-11-12","NUOVI SMARTPHONE","santa","76765","76765","images/favicon.ico");
		assertEquals("76765",negozio.getCap());
	}
	
	
	@Test
	void testSetCap() {
		Negozio negozio = new Negozio("TECH","Monte97","left","Blue","12345678909","2020-11-12","NUOVI SMARTPHONE","santa","76765","76765","images/favicon.ico");
		negozio.setCap("81021");
		assertEquals("81021",negozio.getCap());
	}
	
	
	
	
	
	
	

}
