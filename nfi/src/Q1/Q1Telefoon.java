package Q1;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q1Telefoon {

	public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        try {
        	String line;
        	boolean signal666 = false; 
        	while ((line = bufferedReader.readLine()) != null) {
	        	
	        	System.out.println(line);
	        	if (line.equals("999") && signal666 == true) {
	        		bufferedReader.close();
	        		break;
	        	}
	        	if (line.equals("666")) {
	        		signal666 = true;
	        	}
	        	else signal666 = false;
        	}
        }
        catch(Exception e) {
        	bufferedReader.close();
        }
    }
}