package enums;
public class SeasonalGreeting {
	
	public static void main(String[] args) {
		greeting(JahreszeitenKonstanten.FRÜHLING);
	}
	
	private static void greeting(final int Jahreszeit) {
		String name = "";
		
		switch (Jahreszeit) {
		case 0:
			name = "Frühling";
			break;
		case 1:
			name = "Sommer";
			break;
		case 2:
			name = "Herbst";
			break;
		case 3:
			name = "Winter";
			break;

		default:
			break;
		}
		
		System.out.println("Schönen " + name);
	}
}
