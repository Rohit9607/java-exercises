package self;

import java.util.Scanner;

public class RevNum3Method {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number:");
		int num=sc.nextInt();
		
		StringBuilder sbl=new StringBuilder();
		sbl.append(num);
		StringBuilder rev=sbl.reverse();
		
		System.out.println("Reverse Number is:"+rev);
	}

}
