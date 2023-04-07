package Package_2;
class MyPoint1 {
	int x;
	int y;
}
class Circle1{
	MyPoint1 p = new MyPoint1();
	int r;
}
public class InheritanceTest2 {

	public static void main(String[] args) {
		Circle1 c = new Circle1();
		c.p.x = 1;
		c.p.y = 2;
		c.r = 3;
		System.out.println("c.x = " + c.p.x);
		System.out.println("c.y = " + c.p.y);
		System.out.println("c.r = " + c.r);
	}

}
