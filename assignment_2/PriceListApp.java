package assignment_2;
import java.util.Scanner;

public class PriceListApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int input;
		String input_company;		
		
		PriceList list = new PriceList();
		
		int count = 0;
		
		while(true) {
			System.out.println("=============Main Menu=============");
			System.out.println("(1) add a oil to price list");
			System.out.println("(2) View Region Information");
			System.out.println("(3) Print the entire price list");
			System.out.println("(4) Exit the program");
			System.out.println("===================================");
			System.out.print("choose a menu: ");
			
			input = sc.nextInt();
			sc.nextLine();
			
			if(input == 1) {
				try {
					if(list.getVertical() <= count) throw new FullArrayException();
				}
				catch(FullArrayException e) {
					System.out.println("List is full!\ntry to expand...\nHow much will it expand?");
					input = sc.nextInt();
					sc.nextLine();
					list.extendList(input);
					System.out.println("list is extended");
					System.out.println();
				}
				if(list.getVertical() > count) {
					for(int i=0; i<2; i++) {
						System.out.print("company : ");
						input_company = sc.nextLine();
						System.out.print("supply price : ");
						input = sc.nextInt();
						sc.nextLine();
						
						if(i == 0) {
							list.setPriceList(count, i, new Gasoline(input, input_company));
							System.out.println("gasoline added\n");
						}
						else if(i == 1){
							list.setPriceList(count, i, new Diesel(input, input_company));
							System.out.println("diesel added\n");
						}
					}
					count++;
				}
			}
			else if(input == 2) {
				System.out.print("region number to view: ");
				input = sc.nextInt();
				sc.nextLine();
				System.out.println(list.getRegionInfo(input));
			}
			else if(input == 3) {
				list.printList();
			}
			else if(input == 4) {
				System.out.println("Exit Application");
				System.exit(0);
			}
			else {
				System.out.println("Insert 1~4");
				System.out.println();
			}
		
		}
	}

}
