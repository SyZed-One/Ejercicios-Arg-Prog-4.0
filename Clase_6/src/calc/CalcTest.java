package calc;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CalcTest {

	@Test
	void multiplicarTest() {
		float resultado= Calcu.prod(8,30);
		assertEquals(resultado, 240);
	}

	@Test
	void combinado1Test() {
		float resultado= Calcu.suma(180,150);
		resultado = Calcu.divi(resultado, 3);
		assertEquals(resultado, 110);
	}
	
	@Test
	void combinado2Test() {
		float resultado= Calcu.rest(90,50);
		resultado = Calcu.prod(resultado, 15);
		assertFalse(resultado== 605);
	}
	
	@Test
	void combinado3Test() {
		float resultado= Calcu.suma(70,40);
		resultado = Calcu.prod(resultado, 25);
		assertFalse(resultado== 2700);
	}
}
