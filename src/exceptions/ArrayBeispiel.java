package exceptions;


public class ArrayBeispiel {

	public static void main(String[] args) {
		
		ArrayListe al = new ArrayListe();
		
		System.out.println("Das erste Wort ist " + 
				al.get(1).length() + 
               " Zeichen lang.");
//		System.out.println(al.get(-1));
		
		
		//int[] numbers123 = new int[]{1,2,3};
		//System.out.println("Letzter Wert ist die " + numbers123[-1]);
		
	}
	
	
	
	
}
