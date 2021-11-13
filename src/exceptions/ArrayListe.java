package exceptions;

public class ArrayListe {

	String[] werte;
	
	public ArrayListe() {
		werte = new String[99];
		werte[0] = "wert";
		
	}
	
	//methode darf nicht mit -1 aufgerufen werden
	public String get(int i) {
		if(i < 0) {
			throw new IllegalArgumentException("You shall not pass -1 as parameter!");
		}
		
		return werte[i];
	}
	
}
