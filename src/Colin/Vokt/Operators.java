package Colin.Vokt;

import java.util.Scanner;

/*
 * Colin Vokt
 * 9/18
 */
public class Operators {

	public static void main(String[] args) {
		/*
		int i = 1;
		System.out.println(i);
		i=--i;
		System.out.println(i);
		*/
		Scanner input = new Scanner(System.in);
		/*
		System.out.println("enter a value that will fit in a byte -128 - 127");
		byte byteValue = input.nextByte();
		*/
		
		System.out.println("enter a value that will fit in a double");
		double doubleValue = input.nextDouble();
		System.out.println("enter a value that will fit in a int");
		int intValue = input.nextInt();
		
		/*
		byte addAByte = (byte) (byteValue + byteValue);
		System.out.print(addAByte);
		
		
		byte minusAByte = (byte) (byteValue - byteValue+5);
		System.out.print(minusAByte);
		
		int xAByte = (byteValue * byteValue);
		System.out.print(xAByte);
		*/
		double intdev = (doubleValue) %  intValue;
		System.out.println(intdev);
		
		
		
	
		
		
		
		
		
		
		
		
		
	}

}
