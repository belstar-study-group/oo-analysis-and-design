package my_example_second;

public enum Wood {
	ALDER, SITKA, CEDAR, MAPLE;
	public String toString() {
		switch(this) {
		case ALDER:
			return "alder";
		case SITKA:
			return "sitka";
		case CEDAR:
			return "cedar";
		case MAPLE:
			return "maple";
		}
		return "";
	}
}
