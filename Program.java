package kr.co.Quiz;
import kr.co.Quiz.Collection.*;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		String Name;
		int K, M, E;
		
		System.out.print("�л����� �Է��ϼ���: ");
		int StudentNum = scanner.nextInt();
		scanner.nextLine();
		
		Student[] StudentList = new Student[StudentNum];
		
		for(int i=0;i<StudentList.length;i++) {
			System.out.print("�л� �̸��� �Է��ϼ���: ");
			Name = scanner.nextLine();
			System.out.print("���� ������ �Է��ϼ���: ");
			K = scanner.nextInt();
			System.out.print("���� ������ �Է��ϼ���: ");
			M = scanner.nextInt();
			System.out.print("���� ������ �Է��ϼ���: ");
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
