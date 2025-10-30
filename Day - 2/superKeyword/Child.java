package superKeyword;

public class Child extends Parent {
	int a = 999;
	@Override
	void display() {
		super.display();
			System.out.println("Displaying "+a+" from CHILD");
			System.out.println("Displaying "+super.a+" from CHILD");
		
	}
}
