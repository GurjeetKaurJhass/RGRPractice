import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class FizzBuzzWizz {

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {
		FizzBuzzWhizz d= new FizzBuzzWhizz();
		boolean ActualOutput=d.checkPrime(11);
		assertEquals(true,ActualOutput);
		
	}

}
