package writing;

import java.io.FileWriter;
import java.io.IOException;

public class Speisekarte {

	public Speisekarte(Pizza[] essen, Getraenk[] getr�nke) {
		super();
		this.essen = essen;
		this.getr�nke = getr�nke;
	}

	Pizza[] essen;
	
	Getraenk[] getr�nke;
	
	
	private void writeMenu() throws IOException {
		FileWriter writer = new FileWriter("ausgabe", true);
		writer.write("Meine Speisekarte");
		
		for (Pizza pizza : essen) {
			pizza.writePizza(writer);
		}
		writer.write("Ende");
		writer.close();
	}
	
	//skizze
	private void writePizza(FileWriter writer) {
		writer.write("pizza1");
	}
	
}
