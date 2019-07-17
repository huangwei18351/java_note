class A {
	public static int k = 0; // 1 加载子类对象的静态成员和静态代码块之前，先加载父类对象的静态成员和静态代码块
	int j=0;//8
	static {
		System.out.println("父类静态方法"); // 2
	}
	{
		System.out.println("父类非静态方法"); // 9
	}
	public static void load(){//只有在用到的时候才会执行
		System.out.println("父类load");
	}
	public A() { // 构造  调用无参构造器之前，会初始化非静态代码块或者非静态常量（因static只执行一次，不再执行）
		System.out.println("父类构造"); // 10
	}
}

public class demo extends A {
	public static int i=0;//3  加载子类对象的静态成员之前，加载子类对象的静态成员和静态代码块之前，先加载父类对象的静态成员和静态代码块
	int j=0;//11
	static {
		System.out.println("子类静态方法"); // 4   在加载子类对象的静态成员和静态代码块
	}
	{
		System.out.println("子类非静态方法");//12
	}
	public static void load(){
		System.out.println("子类load");
	}

	public demo() { // 构造
		super();// 7 子类默认调用父类无参构造器
		System.out.println("子类构造"); // 13
	}
	public static void main(String[] args) {//加载main方法前，必须要对静态成员变量和静态代码块进行加载
		System.out.println("demo print"); //5
		demo d=new demo();//6	14
	}
}

