
public class Diamond {

	private int size;
	private int numberOfLines;

	public Diamond(int size) {
		if (size < 0) {
			throw new NegativeSizeDiamondException();
		}
		this.size = size;
		this.numberOfLines = size * 2 - 1;
	}
	
	@Override
	public String toString() {
		StringBuilder diamondBuilder = new StringBuilder();
		
		for (int lineNumber = 1 ; lineNumber <= numberOfLines ; lineNumber++) {
			if (lineNumber == 1 || lineNumber == numberOfLines) {
				diamondBuilder.append(createFirstLine());
			} else if (lineNumber == 2) {
				diamondBuilder.append("* *\n");
			} else {
				diamondBuilder.append("\n");
			}
		}
		return diamondBuilder.toString();
	}

	private String createFirstLine() {
		StringBuilder lineBuilder = new StringBuilder();
		
		int n = 0;
		while (n < (size-1)) {
			lineBuilder.append(" ");
			n++;
		}
		lineBuilder.append("*\n");
		
		return lineBuilder.toString();
	}

	public int getSize() {
		return size;
	}

	public int getNumberOfLines() {
		return numberOfLines;
	}
	
	

}
