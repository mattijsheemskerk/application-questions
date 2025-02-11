package Q1;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q1Telefoon {

	public static void main(String[] args) throws IOException {

        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        	String line;
        	boolean isSignal666 = false; 
        	while ((line = bufferedReader.readLine()) != null) {
	        	
	        	System.out.println(line);
	        	if (line.equals("999") && isSignal666) {
	        		bufferedReader.close();
	        		break;
	        	}
	        	if (line.equals("666")) isSignal666 = true;
	        	else isSignal666 = false;
        	}
        }
        catch (Exception e) {
        	System.out.println("Input error");
        }
    }
}