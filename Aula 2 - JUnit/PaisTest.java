import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.Assert;
import org.junit.Assert.*;
import org.junit.FixMethodOrder;
import org.junit.jupiter.api.BeforeEach;
import org.junit.runners.MethodSorters;
import org.junit.jupiter.api.Test;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
class PaisTest {

	Pais pais, copia;
	static int id = 0;
	
	@BeforeEach
	void setUp() throws Exception {
		System.out.println("setup");
		pais = new Pais(11, "França", 65844000, 551500); 
		copia = new Pais(11, "França", 65844000, 551500); 
		System.out.println(pais);
		System.out.println(copia);
	}

	@Test
	void test00Carregar() {
		System.out.println("carregar");
		Pais p1 = new Pais(1, "Afeganistão", 31108077, 652090);
		Pais p2 = new Pais(1);
		p2.carregar();
		assertEquals("Teste carregar", p2, p1);
	}
	
	@Test
	public void test01Insert() {
		System.out.println("inserir");
		pais.inserir();
		id = pais.getId();
		System.out.println(id);
		copia.setId(id);
		assertEquals("Testa inclusão", pais, copia);
	}
	
	@Test
	public void test02Atualizar() {
		System.out.println("atualizar");
		pais.inserir();
		pais.setPopulacao(55555);
		copia.setPopulacao(55555);
		pais.atualizar();
		pais.carregar();
		assertEquals("Testa atualização", pais, copia);
	}
	
	@Test
	public void test03Excluir() {
		System.out.println("Excluir");
		copia.setId(-1);
		copia.setNome(null);
		copia.setPopulacao(0);
		copia.setArea(0.0);
		pais.excluir();
		pais.carregar();
		assertEquals("testa exclusão", pais, copia);
	}
	
	@Test
	public void test04maiorPopulacao() {
		System.out.println("Maior população");
		pais.maiorPopulacao();
		copia.setId(10);
		copia.carregar();
		assertEquals("testa método que retorna o país com maior população", pais, copia);
	}
	
	@Test
	public void test05menorArea() {
		System.out.println("Menor área");
		pais.menorArea();
		copia.setId(2);
		copia.carregar();
		assertEquals("testa método que retorna o país com a menor área", pais, copia);
	}
	
	@Test
	public void test06vetorTresPaises() {
		System.out.println("Vetor de três países");
		Pais[] v1 = pais.vetorTresPaises();
		Pais[] v2 = new Pais[] {v1[0], v1[1], v1[2]};
		Assert.assertArrayEquals(v1, v2);
	}
	
	
	
}
