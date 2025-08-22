
public class EvenAndOddFromAnArray {

	public static void main(String[] args) {
		int a[]= {10,11,12,13,14,15,16};
		System.out.println("even numbers in an array");
		//logic to find even numbers
		for(int i=0;i<a.length;i++) {
			if(a[i]%2==0) {
				System.out.println("even number"+" "+a[i]);
			}
		}
		System.out.println("odd numbers in an array");
		//logic to find odd numbers(we can write it in else block also)
		for(int i=0;i<a.length;i++) {
			if(a[i]%2!=0) {
				System.out.println("odd number"+" "+a[i]);
			}
		}	
	}

}
