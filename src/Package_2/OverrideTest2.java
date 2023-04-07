package Package_2;
class MyPoint3D extends Object {
	int x;
	int y;
	public String toString() {
		return "x : " + x + ", y : " + y;
	}
	String getLocation() {
		return "x : " + x + ", y : " + y;
	}
}
public class OverrideTest2 {

	public static void main(String[] args) {
		MyPoint3D p = new MyPoint3D();
		p.x = 3;
		p.y = 5;
		System.out.println("p.x : " + p.x);
		System.out.println("p.x : " + p.y);
	}

}
