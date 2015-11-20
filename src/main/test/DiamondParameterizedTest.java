import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class DiamondParameterizedTest {
	
	private static final int NUMBER_OF_DIAMONDS = 10;

	@Parameters
	public static Collection<Diamond> params() {
		ArrayList<Diamond> diamondList = new ArrayList<>();
		for (int i = 1 ; i <= NUMBER_OF_DIAMONDS ; i++) {
			diamondList.add(new Diamond(i));
		}
		
	    return diamondList;
	}
	
	private final Diamond diamondParameter;
	
	public DiamondParameterizedTest(final Diamond diamondParameter) {
		this.diamondParameter = diamondParameter;
	}
	
	@Test
	public void testDiamondIsInGoodSize() {
		assertEquals(diamondParameter.getNumberOfLines(),
				diamondParameter.toString().split("\n").length);
	}
	
	@Test
	public void testFirstAndLastLine() {
		StringBuilder lineBuilder = new StringBuilder();
		int n = 0;
		while (n < (diamondParameter.getSize() - 1)) {
			lineBuilder.append(" ");
			n++;
		}
		lineBuilder.append("*\n");
		
		assertTrue(diamondParameter.toString().startsWith(lineBuilder.toString()));
		assertTrue(diamondParameter.toString().endsWith(lineBuilder.toString()));
	}
	
	@Test
	public void testMiddleLine() {
		StringBuilder lineBuilder = new StringBuilder();
		lineBuilder.append("*");
		int n = 0;
		if (diamondParameter.getNumberOfLines() > 2) {
			while (n < (diamondParameter.getNumberOfLines() - 2)) {
				lineBuilder.append(" ");
				n++;
			}
			lineBuilder.append("*");
		}
		lineBuilder.append("\n");
		
		int middleLineNumber = diamondParameter.getNumberOfLines() / 2 + 1; 
		String middleLine = diamondParameter.toString().split("\n")[middleLineNumber - 1]
				+ "\n";
		
		assertEquals(lineBuilder.toString(), middleLine);
	}

}
