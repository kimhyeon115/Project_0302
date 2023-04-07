package Package_1;

import java.util.*;

public class Main2 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("신청 인원수?");
		int number = scn.nextInt();
		Student[] students = new Student[number];
		for(int i=0; i<number; i++) {
			System.out.println("이름?");
			String name = scn.next();
			System.out.println("나이?");
			int age = scn.nextInt();
			System.out.println("신장?");
			int height = scn.nextInt();
			System.out.println("체중?");
			int weight = scn.nextInt();
			System.out.println("학번?");
			String studentID = scn.next();
			System.out.println("학년?");
			int grade = scn.nextInt();
			System.out.println("학점?");
			double gPA = scn.nextDouble();
			students[i] = new Student(name, age, height, weight, studentID, grade, gPA);
		}
		for(int i=0; i<number; i++) {
			students[i].showStudent();
			System.out.println();
		}
	}

}
