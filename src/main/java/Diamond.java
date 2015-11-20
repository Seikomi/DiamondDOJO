
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
		
		int middleLineNumber = numberOfLines / 2 + 1;
		
		for (int lineNumber = 1 ; lineNumber <= numberOfLines ; lineNumber++) {
			if (lineNumber == 1 || lineNumber == numberOfLines) {
				diamondBuilder.append(createFirstLine());
			} else if (lineNumber == middleLineNumber) {
				diamondBuilder.append(createMiddleLine());
			} else {
				diamondBuilder.append("\n");
			}
		}
		return diamondBuilder.toString();
	}

	private String createMiddleLine() {
		StringBuilder lineBuilder = new StringBuilder();
		
		
		lineBuilder.append("*");
		int n = 0;
		if(numberOfLines > 2) {
			while (n < (numberOfLines - 2)) {
				lineBuilder.append(" ");
				n++;
			}
			lineBuilder.append("*");
		}
		lineBuilder.append("\n");
		
		return lineBuilder.toString();
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
