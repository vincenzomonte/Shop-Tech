package testing;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import managernegozio.Categoria;

/**
 * Test di unita Categoria
 * @author monte
 *
 */
class CategoriaTest {

	@Test
	void testCategoriaIsEmpty() {
		Categoria cat=new Categoria();
		assertNotNull(cat);
	}
	
	@Test
	void testGetNomeNegozio() {
		Categoria cat=new Categoria( "TECH",  "iPad", "path/negozi/TECH/iPad.jfjf",  "iPad Air Potente,Attraente,Sorprendente");
		assertEquals("TECH",cat.getNomeNegozio());
	}
	
	@Test 
	void testSetNomeNegozio() {
		Categoria cat=new Categoria( "TECH",  "iPad", "path/negozi/TECH/iPad.jfjf",  "iPad Air Potente,Attraente,Sorprendente");
		cat.setNomeNegozio("Lumier");
		assertEquals("Lumier",cat.getNomeNegozio());
	}
	
	@Test
	void testGetNomeCategoria() {
		Categoria cat=new Categoria( "TECH",  "iPad", "path/negozi/TECH/iPad.jfjf",  "iPad Air Potente,Attraente,Sorprendente");
		assertEquals("iPad",cat.getNomeCategoria());
	}
	
	@Test 
	void testSetNomeCategoria() {
		Categoria cat=new Categoria( "TECH",  "iPad", "path/negozi/TECH/iPad.jfjf",  "iPad Air Potente,Attraente,Sorprendente");
		cat.setNomeCategoria("iPadPro");
		assertEquals("iPadPro",cat.getNomeCategoria());
	}
	
	@Test
	void testGetDescrizione() {
		Categoria cat=new Categoria( "TECH",  "iPad", "path/negozi/TECH/iPad.jfjf",  "iPad Air Potente,Attraente,Sorprendente");
		assertEquals("iPad Air Potente,Attraente,Sorprendente",cat.getDescrizione());
	}
	
	@Test 
	void testSetDescrizione() {
		Categoria cat=new Categoria( "TECH",  "iPad", "path/negozi/TECH/iPad.jfjf",  "iPad Air Potente,Attraente,Sorprendente");
		cat.setDescrizione("Desc");
		assertEquals("Desc",cat.getDescrizione());
	}
	
	@Test
	void testGetPath() {
		Categoria cat=new Categoria( "TECH",  "iPad", "path/negozi/TECH/iPad.jfjf",  "iPad Air Potente,Attraente,Sorprendente");
		assertEquals("path/negozi/TECH/iPad.jfjf",cat.getPath());
	}
	
	@Test 
	void testSetPath() {
		Categoria cat=new Categoria("TECH",  "iPad", "path/negozi/TECH/iPad.jfjf",  "iPad Air Potente,Attraente,Sorprendente");
		cat.setPath("path/lumier");
		assertEquals("path/lumier",cat.getPath());
	}
	
	
	
}
