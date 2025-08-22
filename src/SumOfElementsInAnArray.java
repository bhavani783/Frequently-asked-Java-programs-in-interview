
public class SumOfElementsInAnArray {

	public static void main(String[] args) {
		int a[]= {100,200,300,400,500};
		int sum=0;
		//logic to find length 
		for(int i=0;i<=a.length-1;i++) {
			sum=sum+a[i];
		}
		System.out.println("sum of an array element:"+sum);
		

	}

}
