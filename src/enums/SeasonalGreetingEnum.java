package enums;
public class SeasonalGreetingEnum {

	
	
	public static void main(String[] args) {
				
		System.out.println(Jahreszeiten.values());		
		String seasonName = greeting(Jahreszeiten.FRÜHLING);
		
		//System.out.println("Schönen " + seasonName);

	}
	
	private static String greeting(Jahreszeiten jz) {
		String name = "";
		
		switch (jz) {
		case FRÜHLING:
			name = "Frühling";
			break;
		case SOMMER:
			name = "Sommer";
			break;
		case HERBST:
			name = "Herbst";
			break;
		case WINTER:
			name = "Winter";
			break;

		default:
			break;
		}
		
		return name;
	}

}
