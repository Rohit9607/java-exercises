package Day7;

import java.util.Arrays;

public class SortingString {

	public static void main(String[] args) {
		String[] s= {"ro","oh","hi","it","t"};
		
		System.out.println("berfore sorting...."+Arrays.toString(s));
		
		Arrays.sort(s);
		System.out.println("After sorting.."+Arrays.toString(s));
	}

}
