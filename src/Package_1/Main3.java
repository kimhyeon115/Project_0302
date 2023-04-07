package Package_1;

public class Main3 {

	public static void main(String[] args) {
		Student[] students = new Student[100];		//1차원 배열테이블에 배열주소를 배열되고 주소별로 배열에 연결
		for(int i=0; i<100; i++) {
			students[i] = new Student("홍길동", 20, 175, 70, i+"", 1, 4.5);
			students[i].showStudent();
		}

	}

}
