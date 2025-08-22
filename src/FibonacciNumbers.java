
public class FibonacciNumbers {

	public static void main(String[] args) {
		int n1=0, n2=1,sum=0;//0+1=1 +1=2 +1=3 +2= 5+3= 8+3=13------
		System.out.println(n1+" "+n2);
		for(int i=2;i<30;i++) {
			sum=n1+n2;
			System.out.println(sum);
			n1=n2;
			n2=sum;
		}

	}

}
