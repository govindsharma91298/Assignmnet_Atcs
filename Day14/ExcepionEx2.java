package Day14;

public class ExcepionEx2 {

	public static void main(String[] args) {
		try {

			int a[] = new int[5];
			a[4] = 30 / 0;
			String s = "100";
			System.out.println(s.length());
			int x = Integer.parseInt(s);
			System.out.println("no error  " + a[4] + "  " + x);

		} catch (ArrayIndexOutOfBoundsException ae) {
			System.out.println("Enter valid index");
		} catch (ArithmeticException ae) {
			System.out.println("Don't enter denominotor as zero");
		} catch (NumberFormatException e) {
			System.out.println("We cant convert String to number");
		} catch (Exception ae) {
			System.out.println("Unable to find length of the String");
		} finally {
			System.out.println("Executes every time to close the connection");
		}
		System.out.println("Remaining 100000 lines of code");
	}


	}


