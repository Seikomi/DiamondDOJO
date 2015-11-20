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

}
