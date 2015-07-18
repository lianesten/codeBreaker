package codeBreaker;

import static org.junit.Assert.*;

import org.junit.Test;

public class testCodeBraker {
		

	@Test
	public void testXxxx() {
		CodeBreaker code = new CodeBreaker();
		assertEquals(code.acertar("1234"), "xxxx");
	}
	
	@Test
	public void testXxx() {
		CodeBreaker code = new CodeBreaker();
		assertEquals(code.acertar("1235"), "xxx");
	}
	
	@Test
	public void testXx() {
		CodeBreaker code = new CodeBreaker();
		assertEquals(code.acertar("1265"), "xx");
	}
	@Test
	public void testX() {
		CodeBreaker code = new CodeBreaker();
		assertEquals(code.acertar("1865"), "xxxxxxx");//Solo es una x, hago fallar la prueba con muchas
	}
	@Test
	public void testVacio() {
		CodeBreaker code = new CodeBreaker();
		assertEquals(code.acertar("9865"), "");
	}
	@Test
	public void test4rayas() {
		CodeBreaker code = new CodeBreaker();
		assertEquals(code.acertar("4321"), "____");
	}
	@Test
	public void test3rayas() {
		CodeBreaker code = new CodeBreaker();
		assertEquals(code.acertar("4326"), "___");
	}
	@Test
	public void test2rayas() {
		CodeBreaker code = new CodeBreaker();
		assertEquals(code.acertar("4386"), "__");
	}
	@Test
	public void test1rayas() {
		CodeBreaker code = new CodeBreaker();
		assertEquals(code.acertar("4586"), "_");
	}
	@Test
	public void test2X2rayas() {
		CodeBreaker code = new CodeBreaker();
		assertEquals(code.acertar("2134"), "xx__");
	}
	@Test
	public void test2X1raya1() {
		CodeBreaker code = new CodeBreaker();
		assertEquals(code.acertar("1263"), "xx_");
	}
}
