package Day6;
class A{  
void eat()
{System.out.println("eating...");}  
}  
class Dog extends A{  
void bark()
{System.out.println("barking...");}  
}  
public class Animal {

	public static void main(String[] args) {
		Dog d=new Dog();  
		d.bark();  
		d.eat();
		
	}

}
