public class bb{
	public static bb t1 = new bb();
	public static bb t2 = new bb();
	{
		System.out.println("构造快");
	}
	{
		System.out.println("静态快");
	}
	public static void main(String[] args) {
		bb t = new bb();
	}
}