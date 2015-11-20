
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
		
		int firstSpaces = size - 1;
		int secondSpaces = -1;
		
		diamondBuilder.append(new DiamondLine(firstSpaces).toString());
		if (firstSpaces > 0) {
			while (firstSpaces > 0) {
				firstSpaces--;
				secondSpaces += 2;
				diamondBuilder.append(new DiamondLine(firstSpaces, secondSpaces).toString());
			}
			while (firstSpaces < size - 2) {
				firstSpaces++;
				secondSpaces -= 2;
				diamondBuilder.append(new DiamondLine(firstSpaces, secondSpaces).toString());
			}
			firstSpaces++;
			diamondBuilder.append(new DiamondLine(firstSpaces).toString());
		}
		
		return diamondBuilder.toString();
	}
	
	public int getSize() {
		return size;
	}

	public int getNumberOfLines() {
		return numberOfLines;
	}

}
