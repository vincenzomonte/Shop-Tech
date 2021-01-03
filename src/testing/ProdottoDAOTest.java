package testing;

import static org.junit.Assert.assertFalse;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import manageraccouting.Venditore;
import managernegozio.Categoria;
import managernegozio.Negozio;
import managernegozio.Prodotto;
import model.CategoriaDAO;
import model.NegozioDAO;
import model.ProdottoDAO;
import model.VenditoreDAO;

/**
 * Test di unita ProdottoDAO
 * @author monte
 *
 */
class ProdottoDAOTest {
	
	static Venditore vend;
	static VenditoreDAO modelv=new VenditoreDAO();
	static Negozio neg;
	static NegozioDAO modeln=new NegozioDAO();
	static CategoriaDAO modelc=new CategoriaDAO();
	static Categoria cat;
	static ProdottoDAO modelp = new ProdottoDAO();
	
	@BeforeAll
	static public void setup()throws Exception {
		vend= new Venditore("Monte97","Saprisapri@97","Vincenzo","Montesano","vincenzomontesano@gmail.com","M","3482914912","Via santa domenica","Sapri","84073");
		modelv.addVenditore(vend);
		neg=new Negozio("TECH","Monte97","left","Blue","12345678909","2020-11-12","NUOVI SMARTPHONE","santa","76765","76765","images/favicon.ico");
		modeln.addNegozio(neg);
		cat=new Categoria("TECH","iPad","path/negozi/TECH/iPad.jfjf","iPad Air Potente,Attraente,Sorprendente");
		modelc.addCategoria(cat);
	}
	

	@AfterAll
	static public void remove()throws Exception{
		modelv.deleteVenditore("Monte97");
		modeln.deleteShop("TECH");
		modelc.deleteCategory("TECH", "iPad");
	}
	
	@Test
	void testGetPathByID() throws Exception{
		int id=0;
		try {
		Prodotto prod= new Prodotto(11111,"TECH","iPad","",22,"images/negozi/TECH/142.jpg",10.5f,4,23,"iPhone12");
		modelp.addProdotto(prod);
		id=modelp.getIDProd("iPad","TECH","Iphone12");
		
		}finally {
			modelp.deleteProduct(id);
		}
	}
	/*
	
	@Test
	void testGetAllProductBySellerCat() throws Exception{
		int id=0;
		try {
		Prodotto prod= new Prodotto(11111,"Pacifico","Biscotti","ringo",22,"images/negozi/Pacifico/500.jpg",10.5f,4,23,"Molto buoni e gustosi");
		modelp.addProdotto(prod);
		id=modelp.getIDProd("Biscotti","Pacifico","ringo");
		
		
		assertEquals(1,modelp.getAllProductBySellerCategory("Mario", "Biscotti").size());
		}finally {
			modelp.deleteProduct(id);
		}
	}
	
	@Test
	void testAddProdotto() throws Exception{
		int id=0;
		try {
		Prodotto prod= new Prodotto(11111,"Pacifico","Biscotti","ringo",22,"images/negozi/Pacifico/500.jpg",10.5f,4,23,"Molto buoni e gustosi");
		modelp.addProdotto(prod);
		id=modelp.getIDProd("Biscotti","Pacifico","ringo");
		if(id==0)
			fail("Errore prodotto non inserito");
		}finally {
			modelp.deleteProduct(id);
		}
	}

	
	@Test
	void testDeleteProduct() throws Exception{
		int id=0;
		try {
		Prodotto prod= new Prodotto(11111,"Pacifico","Biscotti","ringo",22,"images/negozi/Pacifico/500.jpg",10.5f,4,23,"Molto buoni e gustosi");
		modelp.addProdotto(prod);
		id=modelp.getIDProd("Biscotti","Pacifico","ringo");
		boolean result = modelp.deleteProduct(id);
		assertTrue(result);
		}finally {
			modelp.deleteProduct(id);
		}
	}
	
	@Test
	void testGetProductById() throws Exception {
		int id=0;
		try {
		Prodotto prod= new Prodotto(11111,"Pacifico","Biscotti","ringo",22,"images/negozi/Pacifico/500.jpg",10.5f,4,23,"Molto buoni e gustosi");
		modelp.addProdotto(prod);
		id=modelp.getIDProd("Biscotti","Pacifico","ringo");
		Prodotto actual = modelp.getProductById(id);
		assertEquals(id,actual.getIdProdotto());
		}finally {
			modelp.deleteProduct(id);
		}
		
	}
	
	@Test
	void testUpdateProdotto() throws Exception{
		int id=0;
		try {
		Prodotto prod= new Prodotto(11111,"Pacifico","Biscotti","ringo",22,"images/negozi/Pacifico/500.jpg",10.5f,4,23,"Molto buoni e gustosi");
		modelp.addProdotto(prod);
		id=modelp.getIDProd("Biscotti","Pacifico","ringo");
		Prodotto prod2=new Prodotto(id,"Pacifico","Biscotti","Mileb",22,"images/negozi/Pacifico/500.jpg",10.5f,4,23,"Molto buoni e gustosi");
		assertTrue(modelp.updateProdotto(prod2));
		}finally {
			modelp.deleteProduct(id);
		}
		
	}
	
	
	
	@Test
	void  testUpdatePathProdotto() throws Exception{
		int id = 0;
		try {
			
			Prodotto prod= new Prodotto(11111,"Pacifico","Biscotti","ringo",22,"images/negozi/Pacifico/500.jpg",10.5f,4,23,"Molto buoni e gustosi");
			modelp.addProdotto(prod);
			id = modelp.getIDProd(prod.getNomeCategoria(),prod.getNomeNegozio(),"ringo");
			assertTrue( modelp.updatePathProdotto(prod.getNomeNegozio(), prod.getNomeCategoria(),id,prod.getPath()));
		}finally {
			modelp.deleteProduct(id);
		}
		
	}
	
*/



}
