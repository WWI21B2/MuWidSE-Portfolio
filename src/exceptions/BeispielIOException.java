package exceptions;

import java.io.IOException;

public class BeispielIOException {

	public static void main(String[] args) {
		try {
			String content = readFileToString("meineDatei.txt");
			System.out.println(content);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
			System.out.println("hat nicht geklappt...");
		}
		System.out.println("Programmende.");
	}
		
	public static String readFileToString(String fileName) throws IOException {
		//simulates an error
		throw new IOException("File disappeared");
	}
}
