import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class EvenOddD {

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	
		
		public void EvenOdd()
		{
			EvenO d= new EvenO();
			 Boolean ActualOutput=d.isEven(-1);
			 assertEquals(true,ActualOutput);
		}
		
		
	}


