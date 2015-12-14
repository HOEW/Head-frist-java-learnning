package Enum;

public enum Wood {
	INDIAN_ROSEWOOD, BRAZILIAN_ROSEWOOD, MAHOGANY,
	MAPLE, COCOBOLO, CEDAR;
	public String toString(){
		switch(this){
		case INDIAN_ROSEWOOD:return "inden_rosewood";
		case BRAZILIAN_ROSEWOOD: return "brazilian_rosewood";
		case MAHOGANY:return "mahogany";
		case MAPLE: return "maole";
		case COCOBOLO:return "cocobolo";
		case CEDAR:return "cedar";
		default: return null;
		}
	}
}
