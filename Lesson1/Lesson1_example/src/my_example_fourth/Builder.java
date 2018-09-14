package my_example_fourth;

public enum Builder {
	FENDER, MARTIN, GIBSON, COLLINGS;
	public String toString() {
		switch(this) {
		case FENDER:
			return "fender";
		case MARTIN:
			return "martin";
		case GIBSON:
			return "gibson";
		case COLLINGS:
			return "collings";
		}
		return "";
	}
}
