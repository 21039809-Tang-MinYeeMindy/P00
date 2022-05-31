import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class CalculatorTest {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

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
	public final void testAdd() {
		//fail("Not yet implemented");
				int a=1234;
				int b=8765;
				
				Calculator cal=new Calculator();
				int actual =cal.add(a,b);
				
				int expected =9999;
				assertEquals(expected,actual);
	}
	@Test
	public final void testsubstract() {
		int a=9876;
		int b=4321;
		
		Calculator cal=new Calculator();
		int actual =cal.substract(a,b);
		
		int expected =5555;
		assertEquals(expected,actual);
	}
		@Test
		public final void testmultiply() {
			int a=10;
			int b=50;
			
			Calculator cal=new Calculator();
			int actual =cal.multiply(a,b);
			
			int expected =500;
			assertEquals(expected,actual);
		
	}
		@Test
		public final void testdivide() {
			int a=500;
			int b=10;
			
			Calculator cal=new Calculator();
			int actual =cal.divide(a,b);
			
			int expected =50;
			assertEquals(expected,actual);
		
		}
	
	
	
	

}
