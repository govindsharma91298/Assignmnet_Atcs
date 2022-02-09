
public class Arrayaverage {

	public static void main(String[] args) {
		int a[]= {1,2,3,4,5};
		 int sum=0;
		
		for (int i=0;i<5;i++) {
			sum+=a[i];
		}
		int average=sum/5;
		System.out.println(average);

	}

}
