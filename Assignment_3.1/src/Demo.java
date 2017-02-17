
public class Demo {
	//Will throw a NOSuchMethod error at runtime
	static
	{
		print(10);
	}
	static void print(int x)
	{
		System.out.println(x);
		System.exit(0);
	}
}
