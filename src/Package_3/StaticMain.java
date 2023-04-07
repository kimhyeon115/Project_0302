package Package_3;
class StaticTest {
	static int width = 200;
	static int height = 120;
	int s1 = 10;
	int s2 = 20;
	final double PI = 3.14;
	static int max(int a, int b) {
		return a>b ? a : b;
	}
}
public class StaticMain {

	public static void main(String[] args) {
		System.out.println(StaticTest.max(20,30));
		System.out.println(StaticTest.width);
		System.out.println(StaticTest.height);
		StaticTest st = new StaticTest();
		System.out.println(st.s1);
	}

}
