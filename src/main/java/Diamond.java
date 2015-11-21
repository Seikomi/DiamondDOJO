
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
	
	public int getSize() {
		return size;
	}

	public int getNumberOfLines() {
		return numberOfLines;
	}

	@Override
	public String toString() {
		StringBuilder diamondBuilder = new StringBuilder();
		
		constructFirstSide(diamondBuilder);
		if (size > 1) {
			constructSecondSide(diamondBuilder); 
		}
		
		return diamondBuilder.toString();
	}

	private void constructFirstSide(StringBuilder diamondBuilder) {
		int firstSpaces = size - 1;
		int secondSpaces = -1;
		
		diamondBuilder.append(new DiamondLine(firstSpaces).toString());
		while (firstSpaces > 0) {
			firstSpaces--;
			secondSpaces += 2;
			diamondBuilder.append(new DiamondLine(firstSpaces, secondSpaces).toString());
		}		
	}

	private void constructSecondSide(StringBuilder diamondBuilder) {
		int firstSpaces = 0;
		int secondSpaces = (size * 2) - 3;
		
		while (firstSpaces < size - 2) {
			firstSpaces++;
			secondSpaces -= 2;
			diamondBuilder.append(new DiamondLine(firstSpaces, secondSpaces).toString());
		}
		firstSpaces++;
		diamondBuilder.append(new DiamondLine(firstSpaces).toString());
		
	}

}
