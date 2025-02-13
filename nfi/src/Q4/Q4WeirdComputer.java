package Q4;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Q4WeirdComputer {

	public static void main(String[] args) throws IOException {
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        	int number = Integer.valueOf(bufferedReader.readLine());
        	List<Integer> digits = new ArrayList<>();
            while (number != 0) {
                int remainder = number % -2;
                number /= -2;
                if(remainder < 0) {
                    remainder += 2;
                    number++;
                }
                digits.add(0, remainder);
            }
        	digits.forEach(System.out::print);
    		bufferedReader.close();
        }
        catch (Exception e) {
        	System.out.println("Input error: " + e);
        }
    }
}