package Day11;
import java.util.ArrayList;
public class ForEach {

	public static void main(String[] args) {
	ArrayList al=new ArrayList();
	al.add(123);
	al.add("govind");
	al.add("rahul");
	al.add('g');
	al.add(45.0f);
	
	System.out.println(al);
	
	for(int i=0;i<al.size();i++) {
		System.out.println(al.get(i));
	}
	

	
	
	for (Object o:al)
	{System.out.println(o);
}
	
	
}
}