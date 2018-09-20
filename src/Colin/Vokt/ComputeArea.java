package Colin.Vokt;

import java.util.Scanner;

/*
 * Colin Vokt
 * 9/18
 * compute the area of a circle
 */

public class ComputeArea {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		// step one; enter the radius of a circle
		final double PI = 3.1415926535979323846263438327950288419716939;
		
		 double radius;
		 
		 double area;
		
		 
		 
		 //assign a value to radius
		 System.out.println("enter the radius of the circle and press enter");
		 radius = input.nextDouble();
		 System.out.println(radius);
		 
		// step two; compute the area using the following formula
		//area - radius*radius*pie
		 
		 
		 area = radius*radius*PI;
		
		//step there; display result
		 
		System.out.println("After you entered the radius of " + radius + " We have computed the ara of your " + "circle as: "  + area +"\"");
		
		
		

	}

}
