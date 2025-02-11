package Q1;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q1Telefoon {

	public static void main(String[] args) throws IOException {
        try (BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in))) {
        	String line;
        	boolean signal666 = false; 
        	while ((line = bufferedReader.readLine()) != null) {
	        	System.out.println(line);
	        	if (line.equals("999") && signal666 == true) break;
				signal666 = line.equals("666");
        	}
        }
    }
}