package Package_1;

public class Teacher extends Person {
	private String teacherID; 
	private int monthSalary;
	private int workdeYear;
	public String getTeacherID() {
		return teacherID;
	}
	public void setTeacherID(String teacherID) {
		this.teacherID = teacherID;
	}
	public int getMonthSalary() {
		return monthSalary;
	}
	public void setMonthSalary(int monthSalary) {
		this.monthSalary = monthSalary;
	}
	public int getWorkdeYear() {
		return workdeYear;
	}
	public void setWorkdeYear(int workdeYear) {
		this.workdeYear = workdeYear;
	}
	public Teacher(String name, int age, int height, int weight, String teacherID, int monthSalary, int workdeYear) {
		super(name, age, height, weight);
		this.teacherID = teacherID;
		this.monthSalary = monthSalary;
		this.workdeYear = workdeYear;
	}
		
		void showTheacher() {
			System.out.println("이름 : " + getName());
			System.out.println("나이 : " + getAge() + " 세");
			System.out.println("신장 : " + getHeight() + " cm");
			System.out.println("체중 : " + getWeight() + " kg");
			System.out.println("교번 : " + getTeacherID());
			System.out.println("급여 : " + getMonthSalary());
			System.out.println("년차 : " + getWorkdeYear());
	}
	
}
