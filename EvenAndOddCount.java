package self;

import java.util.Scanner;

public class EvenAndOddCount {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number");
		int num=sc.nextInt();
		
		int even_count=0;
		int odd_count=0;
		
		while(num>0) {
			int rem=num%2;
			if(rem%2==0) {
				even_count++;
			}
			else {
				odd_count++;
			}
			num=num/10;
					
		}
		System.out.println("number of even numbers:"+even_count);
		System.out.println("number of odd numbers:"+odd_count);

	}

}
