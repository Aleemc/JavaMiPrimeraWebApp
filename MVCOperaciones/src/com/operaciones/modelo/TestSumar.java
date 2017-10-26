package com.operaciones.modelo;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestSumar {

	@Test
	void test() {
		OperacionesMatematicas test;
		test = new OperacionesMatematicas ();
		
		test.setNumero1(1);
		test.setNumero2(2);
		float result = test.sumar();
		assertEquals(3,result);
		// assertTrue(result==3);
	}

}
