package Day14;

class UserException extends Exception{
private int password;

public UserException(int password) {
	this.password=password;
}
public String toString() {
	return "password not matched";
}
}

public class ExceptionEx4 {

static void checking(int password) throws UserException{
	if(password>8)
		throw new UserException(password);
	else
		System.out.println("Correct Password");
}
public static void main(String[] args) throws UserException {
	ExceptionEx4.checking(10);
	System.out.println("RestCode");
   }
  }

