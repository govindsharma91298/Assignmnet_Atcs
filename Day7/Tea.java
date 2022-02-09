package Day7;

public class Tea extends Beverages {
	
	public void addIngredient() {
		System.out.println("add ingredients for tea");
	}


	public static void main(String[] args) {
		
		Tea obj=new Tea();
		obj.addIngredient();
		obj.addmilk();
		

	}

}
