package Assignment_1;
import java.util.Scanner;

public class TimeTableApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		int input, period;
		String day, subjName, subjTutor, subjRoom;
		
		TimeTable timeTable = new TimeTable();
		
		while(true) {
			System.out.println("------------Main Menu------------");
			System.out.println("(1)Add a class to my time table");
			System.out.println("(2)View the class");
			System.out.println("(3)Print the entire time table");
			System.out.println("(4)Exit the program");
			
			input = scanner.nextInt();
			scanner.nextLine();
			
			if(input == 1) {
				System.out.print("Day: ");
				day = scanner.nextLine();
				day = day.toUpperCase();
				
				System.out.print("Period: ");
				period = scanner.nextInt();
				scanner.nextLine();
				
				System.out.print("Name: ");
				subjName = scanner.nextLine();
				
				System.out.print("Tutor: ");
				subjTutor = scanner.nextLine();
				
				System.out.print("Room: ");
				subjRoom = scanner.nextLine();
				
				if(timeTable.setSchedule(day, period, subjName, subjTutor, subjRoom)) {
					System.out.println("Class successfully added\n");
				}else {
					System.out.println("Class was NOT successfully added\n");
				}
			}
			else if(input == 2) {
				System.out.println("-----View the class-----");
				System.out.println("(1)At a specific period");
				System.out.println("(2)By subject title");
				input = scanner.nextInt();
				scanner.nextLine();
				if(input == 1) {
					System.out.print("Day: ");
					day = scanner.nextLine();
					day = day.toUpperCase();
					
					System.out.print("Period: ");
					period = scanner.nextInt();
					scanner.nextLine();
					
					if(timeTable.getSchedule(day, period) == null) {
						System.out.println("Enter the correct day");
					}else {
						System.out.println("At that time you have");
						System.out.println(timeTable.getSchedule(day, period).getDetails());
					}
					System.out.println();
				}
				else if(input == 2) {
					System.out.println("-----By subject title-----");
					System.out.println("(1)Specific title");
					System.out.println("(2)View all subjects");
					input = scanner.nextInt();
					scanner.nextLine();
					if(input == 1) {
						System.out.print("Title: ");
						subjName = scanner.nextLine();
						
						if(timeTable.getSubjectByTitle(subjName) == null) {
							System.out.println("It doesn't exist\n");
						}
						else {
							System.out.println(timeTable.getSubjectByTitle(subjName).getDetails());
							System.out.println();
						}
					}
					else if(input == 2) {
						if(timeTable.getAllSubjects()[0] == null) {
							System.out.println("No subject\n");
						}
						else {
							for(int i=0;timeTable.getAllSubjects()[i] != null;i++) {
								System.out.println("----------");
								System.out.println(timeTable.getAllSubjects()[i].getDetails());
								System.out.println("----------");
							}
							System.out.println();
						}
					}
					else {
						System.out.println("Insert 1~2\n");
					}
				}
				else {
					System.out.println("Insert 1~2\n");
				}
			}
			else if(input == 3) {
				timeTable.printTimeTable();
			}
			else if(input == 4) {
				System.out.println("Exit the application");
				break;
			}
			else {
				System.out.println("Insert 1~4\n");
			}
		}
		return;
	}

}
