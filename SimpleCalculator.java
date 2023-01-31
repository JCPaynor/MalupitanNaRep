import java.util.Scanner;
public class SimpleCalculator{
	public Scanner s = new Scanner(System.in);
	
	public static void main(String [] xxx){
		System.out.println("Input your function \n a) +   b) -   c) /   d) x");
		
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