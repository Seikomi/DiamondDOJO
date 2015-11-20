
public class DiamondLine {
	StringBuilder lineBuilder = new StringBuilder();

	public DiamondLine(int firstSpaces) {
		createSpaces(firstSpaces);
		lineBuilder.append("*\n");
		
	}
	
	public DiamondLine(int firstSpaces, int secondSpaces) {
		createSpaces(firstSpaces);
		lineBuilder.append("*");
		createSpaces(secondSpaces);
		lineBuilder.append("*\n");
		
	}

	private void createSpaces(int numberOfSpace) {
		int n = 0;
		while(n < numberOfSpace) {
			lineBuilder.append(" ");
			n++;
		}
	}

	@Override
	public String toString() {
		return lineBuilder.toString();
	}

}
