import java.util.Scanner;

public class MultiplicationTable {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int number=sc.nextInt();
		System.out.println("Entered number is:"+number);
		
		//looping statement
		for(int i=1;i<=number;i++) {
			System.out.println(number+"*"+i+"="+(number*i));
		}
	}

}
