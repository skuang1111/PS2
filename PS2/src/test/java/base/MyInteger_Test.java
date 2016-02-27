package base;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class MyInteger_Test {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	static MyInteger myInt1 = new MyInteger(5);
	static MyInteger myInt2 = new MyInteger(10);
	
	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}
	

	@Test
	public void test() {
		assertFalse(myInt1.isEven());
		assertTrue(myInt1.isOdd());
		assertTrue(myInt1.isPrime());
		assertTrue(MyInteger.isEven(10));
		assertFalse(MyInteger.isOdd(10));
		assertFalse(MyInteger.isPrime(10));
		assertFalse(MyInteger.isEven(myInt1));
		assertTrue(MyInteger.isOdd(myInt1));
		assertTrue(MyInteger.isPrime(myInt1));
		assertTrue(myInt1.equals(5));
		assertFalse(myInt1.equals(myInt2));
	}
	
	

	

}
