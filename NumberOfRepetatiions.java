package Day7;

public class NumberOfRepetatiions {

	public static void main(String[] args) {
		
		int a[]= {10,20,30,10,30,50,33,33,43,34,43};
		int num = 33;
		int count=0;
		
		for(int value:a) {
			if(value==num) {
				count++;
			}
		}
		System.out.println(count);
	}

}
