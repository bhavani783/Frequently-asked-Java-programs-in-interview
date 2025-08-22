import java.util.Scanner;

public class CountEvenAndOddCount {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int number=sc.nextInt();
		int even_count=0;
		int odd_count=0;
		
		while(number>0) {
			int result=number%10;
			if(result%2==0) {
				even_count++;
			}else {
				odd_count++;	
			}
			number=number/10;
		}
		System.out.println("number of even count:"+even_count);
		System.out.println("number of odd count:"+odd_count);

	}

}
