package Day7;
import java.util.Arrays;

public class SortingOfArray {

	public static void main(String[] args) {
		int a[]= {2,1,5,3,4,6,9,7,8};
		
		System.out.println("Berfor sorting");
		System.out.println(Arrays.toString(a));
		
		Arrays.sort(a);
		System.out.println("after sorting");
		System.out.println(Arrays.toString(a));
	}

}
