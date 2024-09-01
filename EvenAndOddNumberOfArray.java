package selfNew;

public class EvenAndOddNumberOfArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {1,11,12,12,14,18,16,17,10,18};
		System.out.println("Even number of an array:");
		
		for (int i=0;i<a.length;i++) {
			if(a[i]%2==0) {
				System.out.println(a[i]);
			}
		}
		System.out.println("Odd number of an array:");
		
		for(int i=0;i<a.length;i++) {
			if(a[i]%2!=0) {
				System.out.println(a[i]);
			}
		}
	}

}
