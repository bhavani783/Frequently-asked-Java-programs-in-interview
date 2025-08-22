import java.util.Scanner;

public class LargestOfTwoNumbers {

	public static void main(String[] args) {
		//taking input from the keyboard
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter first number");
		int first_num=sc.nextInt();
		System.out.println("Enter second number");
		int second_num=sc.nextInt();
		
		if(first_num>second_num) {
			System.out.println(first_num+" "+"is largest number");
		}else {
			System.out.println(second_num+" "+"is larest number");
		}

	}

}
