package clase7;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;


class Ppal_C7Test {

	@Test
	void testCostoFinalDescuentoFijo() {
		Producto prod= new Producto("NaranJú", "PA4534", "300", "100");
		Carrito carroTest= new Carrito("22/03/2023");
		try {
		carroTest.addProd2Carrito(prod, 3);
		}
		catch (NoHayStockException e) {
			//bla bla
		};
		Descuento descFijo= new DescuentoFijo(300);
		float valorFinal= carroTest.costoFinal(descFijo);
		assertEquals(valorFinal, 600);
	}

	@Test
	void testCostoFinalDescuentoPorcentaje() {
		Producto prod= new Producto("NaranJú", "PA4534", "300", "100");
		Carrito carroTest= new Carrito("22/03/2023");
		try {
		carroTest.addProd2Carrito(prod, 3);
		}
		catch (NoHayStockException e) {
			//bla bla
		};
		Descuento descPorc= new DescuentoPorcentaje(10);
		float valorFinal= carroTest.costoFinal(descPorc);
		assertEquals(valorFinal, 810);
	}
	
	@Test
	void testCostoFinalDescuentoPorcentajeConTope() {
		Producto prod= new Producto("NaranJú", "PA4534", "300", "100");
		Carrito carroTest= new Carrito("22/03/2023");
		try {
		carroTest.addProd2Carrito(prod, 3);
		}
		catch (NoHayStockException e) {
			//bla bla
		};
		Descuento descPorcCT= new DescPorcConTope(25);
		
		descPorcCT.setValorDesc(10); //si acá quiero poner >30 no me lo TOMA

		float valorFinal= carroTest.costoFinal(descPorcCT);
		assertEquals(valorFinal, 810);
	}
}
