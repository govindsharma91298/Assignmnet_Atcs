package Day6;
//print default value of static and instance variable for different datatypes

public class One {
	static int a;
	static char A;
	static float b;
	static long c;
	static double d;
	static boolean e;
	static byte f;
	static short s;
	static String p;
	
	int g;
	 char h;
	 float i;
	 long j;
	 double k;
	 boolean l;
	 byte m;
	 short n;
	 String q;
	

	public static void main(String[] args) {
		One obj=new One();
		
		System.out.println(a);
		System.out.println(A);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		System.out.println(e);
		System.out.println(f);
		System.out.println(s);
		System.out.println(p);
		
		System.out.println(obj.g);
		System.out.println(obj.h);
		System.out.println(obj.i);
		System.out.println(obj.j);
		System.out.println(obj.k);
		System.out.println(obj.l);
		System.out.println(obj.m);
		System.out.println(obj.n);
		System.out.println(obj.q);
	}

}
