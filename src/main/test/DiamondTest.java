import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class DiamondTest {
	
	private Diamond diamond;
	
	@Before
	public void setUp() {
		
	}
	
	@After
	public void tearDown() {
		diamond = null;
	}

	@Test
	public void testCreateSizeOneDiamond() {
		diamond = new Diamond(1);
		
		String diagram = "*\n";
		assertEquals(diagram, diamond.toString());
	}
	
	@Test
	public void testCreateSizeTwoDiamond() {
		diamond = new Diamond(2);
		
		String diagram = " *\n"
					   + "* *\n"
					   + " *\n";
		assertEquals(diagram, diamond.toString());
	}
	
	@Test
	public void testFirstLineFromOneSizeToTenSizeDiamond() {
		for (int i = 1 ; i <= 10 ; i++) {
			diamond = new Diamond(i);
			
			StringBuilder firstLineBuilder = new StringBuilder();
			int n = 0;
			while (n < (i-1)) {
				firstLineBuilder.append(" ");
				n++;
			}
			firstLineBuilder.append("*\n");
			
			System.out.println(diamond.toString());
			assertTrue("fail on the line " + i, 
					diamond.toString().startsWith(firstLineBuilder.toString()));
		}
	}
	
	@Test (expected = NegativeSizeDiamondException.class)
	public void testNegativeSizeDiamondException() {
		diamond = new Diamond(-14);
	}

}
