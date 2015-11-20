import static org.junit.Assert.*;

import org.junit.Test;

public class DiamondLineTest {
	
	private DiamondLine diamondLine;

	@Test
	public void testTraceLineWithOneCharacter() {
		diamondLine = new DiamondLine(0);
		assertEquals("*\n", diamondLine.toString());
		
		diamondLine = new DiamondLine(5);
		assertEquals("     *\n", diamondLine.toString());
		
		diamondLine = new DiamondLine(8);
		assertEquals("        *\n", diamondLine.toString());
		
		diamondLine = new DiamondLine(11);
		assertEquals("           *\n", diamondLine.toString());
	}
	
	@Test
	public void testTraceLineWithTwoCharacter() {
		diamondLine = new DiamondLine(0, 2);
		assertEquals("*  *\n", diamondLine.toString());
		
		diamondLine = new DiamondLine(5, 2);
		assertEquals("     *  *\n", diamondLine.toString());
		
		diamondLine = new DiamondLine(8, 1);
		assertEquals("        * *\n", diamondLine.toString());
		
		diamondLine = new DiamondLine(11, 6);
		assertEquals("           *      *\n", diamondLine.toString());
	}

}
