package self;

public class StringReverse1Method {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="pranita";
		String rev="";
		
		int len=str.length();
		for(int i=len-1;i>=0;i--) {
			rev=rev+str.charAt(i);
		}
		System.out.println("Reversed String is:"+rev);
	}

}
