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
                int i = number % -2;
                number /= -2;
                if(i < 0) {
                    i += Math.abs(-2);
                    number++;
                }
                digits.add(0, i);
            }
        	digits.forEach(System.out::print);
    		bufferedReader.close();
        }
        catch (Exception e) {
        	System.out.println("Input error");
        }
    }
}