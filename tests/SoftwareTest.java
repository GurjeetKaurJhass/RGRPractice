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
	public void test()
	{
		
		SoftwareSales s=new SoftwareSales();
		double finalPrice=s.calculateQuantity(60);
		assertEquals(3564,finalPrice,0);
		
		
	}

}
