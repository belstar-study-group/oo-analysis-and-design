package my_example_fourth;

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
