package testing;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Collection;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import manageraccouting.Venditore;
import managernegozio.Categoria;
import managernegozio.Negozio;
import model.CategoriaDAO;
import model.NegozioDAO;
import model.VenditoreDAO;

/**
 * Test di unita Categoria DAO
 * @author monte
 *
 */
class CategoriaDAOTest {
	static Venditore vend;
	static VenditoreDAO modelv=new VenditoreDAO();
	static Negozio neg;
	static NegozioDAO modeln=new NegozioDAO();
	static CategoriaDAO model=new CategoriaDAO();
	
	@BeforeAll
	static public void setup()throws Exception {
		vend= new Venditore("Monte97","Saprisapri@97","Vincenzo","Montesano","vincenzomontesano@gmail.com","M","3482914912","Via santa domenica","Sapri","84073");
		modelv.addVenditore(vend);
		neg=new Negozio("TECH","Monte97","left","Blue","12345678909","2020-11-12","NUOVI SMARTPHONE","santa","sapri","76765","images/favicon.ico");
		modeln.addNegozio(neg);
	}
	@AfterAll
	static public void remove()throws Exception{
		modelv.deleteVenditore("Monte97");
		modeln.deleteShop("TECH");
	}
	
	@Test
	void testAddCat() throws Exception{
		try {
			Categoria cat=new Categoria("TECH","iPad","path/negozi/TECH/iPad.jfjf","iPad Air Potente,Attraente,Sorprendente");
			model.addCategoria(cat);
			assertEquals("TECH",model.getCategoria("TECH", "iPad").getNomeNegozio());
			assertEquals("iPad",model.getCategoria("TECH", "iPad").getNomeCategoria());
		} finally {
			model.deleteCategory("TECH","iPad");
		}
	}
	
	@Test
	void testGetCat() throws Exception{
		try {
			Categoria cat=new Categoria("TECH","iPad","path/negozi/TECH/iPad.jfjf","iPad Air Potente,Attraente,Sorprendente");
			model.addCategoria(cat);
			assertEquals("iPad",model.getCategoria("TECH", "iPad").getNomeCategoria());
		} finally {
			model.deleteCategory("TECH","iPad");
		}
	}
	
	@Test
	void testGetAllCategoryBySeller() throws Exception{
		try {
			Categoria cat=new Categoria("TECH","iPad","path/negozi/TECH/iPad.jfjf","iPad Air Potente,Attraente,Sorprendente");
			model.addCategoria(cat);
			assertEquals(1,model.getAllCategoryBySeller("Monte97").size());
		} finally {
			model.deleteCategory("TECH","iPad");
		}
	}
	
	@Test
	void testUpdatePathCat() throws Exception{
		try {
			Categoria cat=new Categoria("TECH","iPad","path/negozi/TECH/iPad.jfjf","iPad Air Potente,Attraente,Sorprendente");
			model.addCategoria(cat);
			model.updatePathCategoria("TECH","iPad","path/negozi/TECH/iPad.jfjf");
			assertEquals("path/negozi/TECH/162.jpg",model.getCategoria("TECH","iPad").getPath());
		} finally {
			model.deleteCategory("TECH","iPad");
		}
	}
	
	@Test
	void testUpdateDescrizioneCat() throws Exception{
		try {
			Categoria cat=new Categoria("TECH","iPad","path/negozi/TECH/iPad.jfjf","iPad Air Potente,Attraente,Sorprendente");
			model.addCategoria(cat);
			model.updateDescrizioneCategoria("TECH","iPad","iPad Air Potente,Attraente,Sorprendente");
			assertEquals("Desc",model.getCategoria("TECH","iPad").getDescrizione());
		} finally {
			model.deleteCategory("TECH","iPad");
		}
	}
	

}
