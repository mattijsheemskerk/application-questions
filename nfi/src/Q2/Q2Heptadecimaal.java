package Q2;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q2Heptadecimaal {

	public static void main(String[] args) throws IOException {
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        	String line;
        	while ((line = bufferedReader.readLine()) != null) {
            	char[] tokens = line.toCharArray();
            	int maxbaseindex = tokens.length - 1;
        		int numberConverted = 0;
        		if (line.equals("x")) {
	        		bufferedReader.close();
	        		break;
	        	}
		        for (int i = 0; i <= maxbaseindex; i++) {
	        		int numberPerPosition =0;
		        	if (!Character.isDigit(tokens[i])) {
		        		numberPerPosition = tokens[i] - 'a' + 10;
		        	}
		        	else numberPerPosition = Character.getNumericValue(tokens[i]);
		        	numberConverted += (int) (numberPerPosition * Math.pow(17, maxbaseindex  - i));
	        	}
		        System.out.println(numberConverted);
        	}
    		bufferedReader.close();
        }
        catch (Exception e) {
        	System.out.println("Input error: " + e);
        }
    }
}