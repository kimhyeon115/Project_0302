package Package_3;
class Tv {
	boolean power;
	int channel;
	void power( ) {power = !power;}
	void channelUp() {++channel;}
	void channelDown() {--channel;}
}
class SmartTv extends Tv {
	String text;
	void caption() { }
}
public class TvMain {

	public static void main(String[] args) {
		Tv t = new Tv();
		SmartTv s = new SmartTv();
		Tv ts = new SmartTv();			//업 캐스팅
		SmartTv ttss = (SmartTv)ts;		//다운 캐스팅
		ts.channel = 30;
		ts.channelUp();
		System.out.println(ts.channel);
		ttss.text = "SmartTv";
		System.out.println(ttss.text);
	}

}
// Tv와 SmartTv 객체에서 Tv의 참조변수로 SmartTv만의 변수 참조는 어렵다
//그래서 업캐스팅하여 업캐스팅된 참조변수를 형변환해서 사용하면 SmartTv만의 변수 사용 가능하다