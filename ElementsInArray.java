package Day7;

public class ElementsInArray {

	public static void main(String[] args) {
		
		int a[]= {100,200,300,400,500,600};
		
		int search_element=500;
		boolean status=false;
		
		for(int i=0;i<a.length;i++) {
			if(a[i]==search_element) {
				System.out.println("Element found");
				status=true;
				break;
			}
			
		}
		if(status==false) {
		System.out.println("Element not found");
	}
	} 

}
