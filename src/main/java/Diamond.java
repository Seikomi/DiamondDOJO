
public class Diamond {

	private int size;

	public Diamond(int size) {
		this.size = size;		
	}
	
	@Override
	public String toString() {
		switch (size) {
		case 1 :
			return "*";
		case 2 :
			return " *\n"
			   	 + "* *\n"
			     + " *";
		default :
			return "";
		}
	}

}
