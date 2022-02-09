
public class Student {
	int stuid;
	String stuname;
	public Student() {
		stuid=1;
		stuname="rahul";
	}
	public Student(int id, String name)
	{
		stuid=id;
		stuname=name;
	}
	public void dispaly() {
		System.out.println(stuid+" "+stuname);
	}
	public static void main(String[] args) {
		Student s=new Student();
		s.dispaly();
		Student s1=new Student(2,"govind");
		s1.dispaly();
		

	}

}
