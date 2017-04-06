package extend;

public class Parent {

	static int a = 1;
	static{
		a = 10;
		System.out.println("parent static");
	}
	public Parent() {
		System.out.println("parent 构造函数");
		System.out.println("parent a =" + a);
	}
	public static void main(String[] args) {
		System.out.println("****************");
		Parent c = new Child();
	}
}
class Child extends Parent{
	static int a = 2;
	static{
		a = 20;
		System.out.println("child static");
	}
	public Child() {
		System.out.println("child 构造函数");
		System.out.println("child a = "+ a);
	}
}
