import java.util.Scanner;

public class FindSumOfDigits {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter a number");
		int number=s.nextInt();
		int sum=0;
		//while loop
		while(number>0) {
			sum=sum+number%10;
			number=number/10;
			
		}
		System.out.println("Sum of digits in a number is:"+sum);
	}

}
