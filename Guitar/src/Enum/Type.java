package Enum;

public enum Type {
	ACOUSTIC,ELECTRIC,VIDEO;
	public String toString() {
		switch(this){
		case ACOUSTIC : return "acoustic";
		case ELECTRIC: return "electric";
		case VIDEO:return "video";
		default: return null;
		}
		
	}

}
