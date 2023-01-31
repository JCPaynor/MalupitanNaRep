import java.util.Scanner;
public class SimpleCalculator{
	public static Scanner s = new Scanner(System.in);
	
	public static void main(String [] xxx){
		System.out.println("Input your function \n a) +   b) -   c) /   d) x");
		String function = s.nextLine();
		
		System.out.println("Input two Integers");
		
	}//end main
	public static double add (int x, int y){
		double output = x + y;
		return output;
	}// end add
	public static double div (int x, int y){
		double output = x / y;
		return output;
	}// end div
	public static double mul (int x, int y){
		double output = x * y;
		return output;
	}// end mul
	public static double sub (int x, int y){
		double output = x - y;
		return output;
	}// end sub
}//end SimpleCalculator