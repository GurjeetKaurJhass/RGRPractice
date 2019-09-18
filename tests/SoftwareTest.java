import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class SoftwareTest {

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {
		fail("Not yet implemented");
		SoftwareSales s=new SoftwareSales();
		double finalPrice=s.calculateQuantity(1);
		assertEquals(99,finalPrice,0);
		
	}

}
