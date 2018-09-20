package Colin.Vokt;
import java.util.Scanner;
import static java.lang.System.out;
/*
 * Colin Vokt
 * 9/18
 */
public class FtoC {

	public static void main(String[] args) {
		Scanner  input = new Scanner(System.in);
		
		float f;
		float c;
		
		
		out.println("What is the Fahrenheit");
		f = input.nextInt();
		c = (float) ((f - 32)*.5556);
		out.println("the Celsius is "+c);

	}

}
