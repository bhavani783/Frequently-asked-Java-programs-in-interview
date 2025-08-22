
public class DuplicatesOfanArray {

	public static void main(String[] args) {
		int a[]= {100,200,100,300,400,500,500,300,600};
		int num=100;
		int count=0;
		//logic
		
		for(int i=0;i<a.length;i++) {
			if(a[i]==num) {
				count++;
			}
		}
		System.out.println(count);

	}

}
