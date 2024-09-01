package self;

import java.util.Scanner;

public class RevNum2Method {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number:");
		int num=sc.nextInt();
		
		StringBuffer sb=new StringBuffer(String.valueOf(num));
		StringBuffer rev=sb.reverse();
		System.out.println("Reverse Number is:"+rev);
	}

}
