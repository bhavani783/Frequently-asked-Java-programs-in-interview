import java.util.Scanner;

public class StringIsPalindromeOrNot {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a string");
		String str=sc.nextLine();
		String org_str=str;
		String rev="";
		//logic
		for(int i=str.length()-1;i>=0;i--) {
			rev=rev+str.charAt(i);
			
		}
		if(org_str.equalsIgnoreCase(rev)) {
			System.out.println("Palindrome"+" "+rev);
		}else {
			System.out.println("Not Palimdrome"+" "+rev);
		}
		
	}

}
