package kr.co.Quiz;
import kr.co.Quiz.Collection.*;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		String Name;
		int K, M, E;
		
		System.out.print("학생수를 입력하세요: ");
		int StudentNum = scanner.nextInt();
		scanner.nextLine();
		
		Student[] StudentList = new Student[StudentNum];
		
		for(int i=0;i<StudentList.length;i++) {
			System.out.print("학생 이름을 입력하세요: ");
			Name = scanner.nextLine();
			System.out.print("국어 성적을 입력하세요: ");
			K = scanner.nextInt();
			System.out.print("수학 성적을 입력하세요: ");
			M = scanner.nextInt();
			System.out.print("영어 성적을 입력하세요: ");
			E = scanner.nextInt();
			scanner.nextLine();
			
			StudentList[i] = new Student(Name,K,M,E);
		}
		
		Student.makeRank(StudentList);
		
		for(int i=0;i<StudentList.length;i++) {
			System.out.print(i+1+".");
			System.out.println(StudentList[i].toString());
		}
	}

}
