
public class Array4 {

	public static void main(String[] args) {
		int arr[][]={{14,45,63},{78,56,25},{86,61,46}};
		int arr1[][]={{12,46,64},{79,57,26},{87,62,47}};

		
		int sum[][]= {{0,0,0},{0,0,0},{0,0,0}};
		
		for (int i=0;i<3;i++)
		{
			for (int j=0;j<3;j++) {
				sum[i][j]=arr[i][j]+arr1[i][j];
			}
		}
		
		   for(int i=0;i<3;i++) {
			   
	           for(int j=0;j<3;j++){  
	    	         System.out.print(sum[i][j] + " ");
	                }
	                 System.out.println();
   }
		
	}

}
