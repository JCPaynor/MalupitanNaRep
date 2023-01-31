import java.util.Scanner;
public class SimpleCalculator{
	public static Scanner s = new Scanner(System.in);
	
	public static void main(String [] xxx){
		System.out.println("Input your function \n a) +   b) -   c) /   d) x");
		String function = s.nextLine();
		
		System.out.println("Input two Integers");
		int x = s.nextInt();
		int y = s.nextInt();
		
		switch(function){
			case "a":
				add(x,y);
			break;
			case "b":
				sub(x,y);
			break;
			case "c":
				div(x,y);
			break;
			case "d":
				mul(x,y);
			break;
			default:
			
			break;
		}
	}//end main
	public static void add (int x, int y){
		double output = x + y;
	}// end add
	public static void div (int x, int y){
		double output = x / y;
	}// end div
	public static void mul (int x, int y){
		double output = x * y;
	}// end mul
	public static void sub (int x, int y){
		double output = x - y;
	}// end sub
}//end SimpleCalculator