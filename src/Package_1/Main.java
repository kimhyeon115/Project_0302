package Package_1;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String name;
		int age;
		int height;
		int weight;
		String studentId;
		int grade;
		double gpa;
		
		System.out.println("이름 입력");
		name = scn.nextLine();
		System.out.println("나이 입력");
		age = scn.nextInt();
		System.out.println("신장 입력");
		height = scn.nextInt();
		System.out.println("체중 입력");
		weight = scn.nextInt();
		System.out.println("학번 입력");
		studentId = scn.next();
		System.out.println("학년 입력");
		grade = scn.nextInt();
		System.out.println("평점 입력");
		gpa = scn.nextDouble();
		Student st = new Student(name, age, height, weight, studentId,grade, gpa);
		st.showStudent();
		System.out.println();
		Teacher te = new Teacher("Tome", 27, 180, 80, "A20203001", 3700000, 2);
		st.showStudent();
	}

}
