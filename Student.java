package kr.co.Quiz.Collection;
import java.util.Random;

public class Student {
	private String name;
	private int StudentNumber;
	private int Korean, Math, English;
	private double Avg;
	
	private int r_num;
	
	Random random = new Random();
	
	public Student(String name, int Korean, int Math, int English){
		this.name = name;
		this.Korean = Korean;
		this.Math = Math;
		this.English = English;
		Avg = (Korean + Math + English) / 3;
		r_num = random.nextInt(10000);
		StudentNumber = 2018000001 + r_num;
	}
	
	public Student(Student another) {
		name = another.name;
		Korean = another.Korean;
		Math = another.Math;
		English = another.English;
		Avg = another.Avg;
		StudentNumber = another.StudentNumber;
	}
	
	public int getStudentNumber() {
		return this.StudentNumber;
	}
	
	public static void makeRank(Student[] StudentList) {
		Student tmp;
		for(int i=StudentList.length-1;i>0;i--) {
			for(int j=0;j<i;j++) {
				if(StudentList[j].getStudentNumber()>StudentList[j+1].getStudentNumber()) {
					tmp = new Student(StudentList[j]);
					StudentList[j]=new Student(StudentList[j+1]);
					StudentList[j+1]=new Student(tmp);
				}
			}
		}
	}
	
	public String toString() {
		return "�̸�: "+name+"  �й�: "+StudentNumber+"\n����: "+Grade(Korean)
				+" ����: "+Grade(Math)+"  ����: "+Grade(English)+"\n���"+Avg+"\n";
	}
	
	public String Grade(int grade) {
		if(grade>=90) {
			return "A";
		}
		else if(grade>=80) {
			return "B";
		}else if(grade>=70) {
			return "C";
		}else if(grade>=60) {
			return "D";
		}else {
			return "F";
		}
	}
}
