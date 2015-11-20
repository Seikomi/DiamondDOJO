import static org.junit.Assert.*;

import org.junit.Test;

public class DiamondTest {

	@Test
	public void testCreateSizeOneDiamond() {
		Diamond diamond = new Diamond(1);
		assertEquals("*", diamond.toString());
	}

}
