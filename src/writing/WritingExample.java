package writing;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class WritingExample {
	
	public static void main(String[] args) throws IOException {
		
		System.out.println("Hallo");
		
		FileWriter writer1 = new FileWriter("helloworld.txt", false);
			
	    writer1.write("Hello f d s \n");
        writer1.write(System.lineSeparator());
        writer1.write(" World");
        writer1.close();

//		try (FileWriter writer = new FileWriter("helloworld.txt", true)) {
//        	writer.write("Hello");
//            //writer.write(System.lineSeparator());
//        	writer.write("World");
//
//        } catch (IOException e) {
//            e.printStackTrace();
//        }		
//		
//		printSpeisekarte();
		
	}

	private static void printSpeisekarte() throws IOException {
	}
	
	private void mitbuffered() {
		// TODO Auto-generated method stub
		try {
            FileWriter writer = new FileWriter("MyFile.txt", true);
            BufferedWriter bufferedWriter = new BufferedWriter(writer);
 
            bufferedWriter.write("Hello World");
            bufferedWriter.newLine();
            bufferedWriter.write("See You Again!");
 
            bufferedWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
	}

}
