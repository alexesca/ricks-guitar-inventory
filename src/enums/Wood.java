package enums;

public enum Wood {
	ROSEWOOD, BRAZILIAN, MAHOGANY, MAPLE;
	public String toString() {
		switch(this) {
		case ROSEWOOD: return "Rosewood";
		case BRAZILIAN: return "Brazilian";
		case MAHOGANY: return "Mahogany";
		case MAPLE: return "Maple";
		default: return "unknown";
		}
	}
}
