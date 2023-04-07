package Package_1;

public class Person {
	private String name;
	private int age;
	private int height;
	private int weight;

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	public int getWeight() {
		return weight;
	}
	public void setWeight(int weight) {
		this.weight = weight;
	}
	public Person(String name, int age, int height, int weight) {
		super();
		this.name = name;
		this.age = age;
		this.height = height;
		this.weight = weight;
	}
//	void showPerson() {
//		System.out.println("이름 : " + name);
//		System.out.println("나이 : " + age + " 세");
//		System.out.println("신장 : " + height + " cm");
//		System.out.println("체중 : " + weight + " kg");
//	}
	
}
