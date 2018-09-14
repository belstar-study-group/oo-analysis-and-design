package my_example_third;

public enum Type {
	ACOUSTIC, ELECTRIC;
	public String toString() {
		switch(this) {
		case ACOUSTIC:
			return "acoustic";
		case ELECTRIC:
			return "electric";
		}
		return "";
	}
}
