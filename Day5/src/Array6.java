
public class Array6 {

	public static void min(int a[]) {
		int min=a[0];
		
		for(int i=0;i<a.length;i++) {
			if (min>a[i]) {
				min=a[i];
			}
		}
		System.out.println(min);
	}
	
	
	public static void main(String[] args) {
		int a[]= {3,42,12,56,72,1};
		
		min(a);
	}

}
