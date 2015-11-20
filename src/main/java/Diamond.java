
public class Diamond {

	private int size;

	public Diamond(int size) {
		this.size = size;		
	}
	
	@Override
	public String toString() {
		StringBuilder diamondBuilder = new StringBuilder();
		
		diamondBuilder.append(createFirstLine());
		
		switch (size) {
		case 1 :
			return diamondBuilder.toString();
		case 2 :
			return diamondBuilder.toString()
			   	 + "* *\n"
			     + " *\n";
		default :
			return diamondBuilder.toString();
		}
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

}
