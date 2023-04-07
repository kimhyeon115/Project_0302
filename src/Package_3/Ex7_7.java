package Package_3;

public class Ex7_7 {

	public static void main(String[] args) {
		Car cc = new FireEngine();				//업캐스팅
//		cc.water();								//사용 불가능
		FireEngine fe2 = (FireEngine)cc;		//다운캐스팅  <강제 형변화랑 유사>
		fe2.water();
	}
}
class Car {
	String color;
	int door;
	
	void drive() {
		System.out.println("drive, brrrr~");
	}
	void stop() {
		System.out.println("stop!!!");
	}
}
class FireEngine extends Car {
	void water() {
		System.out.println("water!!!");
	}
}