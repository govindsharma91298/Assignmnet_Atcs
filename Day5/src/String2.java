
public class String2 {
	int stuid;
	String stuname;
	
 public String2(int id,String name) {
	     stuid=id;
	     stuname=name;
	}
	public void dispaly() {
		System.out.println(stuid+" "+stuname);
	}

	public static void main(String[] args) {
		
		String2 s1=new String2(3,"rahul");
		s1.dispaly();
        
	}

}
