package eng2;

import java.util.Arrays;

import org.junit.Test;

import junit.framework.TestCase;

public class SushimanMatematicoTest extends TestCase {

	@Test
	public void testEhPrimo() {
		// assert statements
		assertTrue(SushimanMatematico.ehPrimo(7));
		assertTrue(SushimanMatematico.ehPrimo(11));
		assertTrue(SushimanMatematico.ehPrimo(71));
		assertTrue(SushimanMatematico.ehPrimo(233));
		assertFalse(SushimanMatematico.ehPrimo(12));
	}
	
	@Test
	public void testGetPrimos() {
		assertEquals("getPrimos(0) deve retornar os primos de 1 digito", SushimanMatematico.getPrimos(0),
				Arrays.asList(2, 3, 5, 7));
	}
	
	@Test
	public void testGetSuperPrimos() {
		assertEquals("getSuperPrimos(1) SUPER-PRIMOS de 1 digito", Arrays.asList(2, 3, 5, 7),
				SushimanMatematico.getSuperPrimos(1));
		assertEquals("getSuperPrimos(2) SUPER-PRIMOS de 2 digitos", Arrays.asList(23, 29, 31, 37, 53, 59, 71, 73, 79),
				SushimanMatematico.getSuperPrimos(2));
		assertEquals("getSuperPrimos(3) SUPER-PRIMOS de 3 digitos", Arrays.asList(233, 239, 293, 311, 313, 317, 373, 379, 593, 599, 719, 733, 739, 797),
				SushimanMatematico.getSuperPrimos(3));
		assertEquals("getSuperPrimos(4) SUPER-PRIMOS de 4 digitos", Arrays.asList(2333,2339,2393,2399,2939,3119,3137,3733,3739,3793,3797,5939,7193,7331,7333,7393),
				SushimanMatematico.getSuperPrimos(4));
	}

}
