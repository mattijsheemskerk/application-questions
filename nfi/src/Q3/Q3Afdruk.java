package Q3;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q3Afdruk {

	public static void main(String[] args) throws IOException {
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        	String line;
        	int lineNumber = 1;
        	int numberOfColumns = 0;
        	while ((line = bufferedReader.readLine()) != null) {
        		if (line.equals("0")) {
	        		bufferedReader.close();
	        		break;
	        	}
        		if (lineNumber % 2 != 0) {
        			numberOfColumns = Integer.valueOf(line);
        		}
        		else {
        			char[] tokens = line.toCharArray();
        			char[] result = new char[tokens.length];
        			int numberOfRows = tokens.length / numberOfColumns;

        			for (int i = 0; i < tokens.length; i++) {
        				int indexPerColumn = Math.abs(i / numberOfColumns);
        				int rowNumber = (i % numberOfColumns);
        				//System.out.println(i + ": indexPerColumn=" + indexPerColumn + ", rowNumber=" + rowNumber + ", index=" + (indexPerColumn + (rowNumber * numberOfRows)));
        				result[indexPerColumn + (rowNumber * numberOfRows)] = tokens[i];
        			}
    		        System.out.println(String.valueOf(result));
        		}
        		lineNumber++;
        	}
    		bufferedReader.close();
        }
        catch (Exception e) {
        	System.out.println("Input error: " + e);
        }
    }
}