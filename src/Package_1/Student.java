package Package_1;

public class Student extends Person {
	private String studentId;
	private int grade;
	private double GPA;
	public String getStudentId() {
		return studentId;
	}
	public void setStudentId(String studentId) {
		this.studentId = studentId;
	}
	public int getGrade() {
		return grade;
	}
	public void setGrade(int grade) {
		this.grade = grade;
	}
	public double getGPA() {
		return GPA;
	}
	public void setGPA(double gPA) {
		GPA = gPA;
	}
	public Student(String name, int age, int height, int weight, String studentId, int grade, double gPA) {
		super(name, age, height, weight);
		this.studentId = studentId;
		this.grade = grade;
		GPA = gPA;
	}
	void showStudent() {
		System.out.println("이름 : " + getName());
		System.out.println("나이 : " + getAge() + " 세");
		System.out.println("신장 : " + getHeight() + " cm");
		System.out.println("체중 : " + getWeight() + " kg");
		System.out.println("학번 : " + studentId);
		System.out.println("학년 : " + grade);
		System.out.println("평점 : " + GPA);
	}	
}
