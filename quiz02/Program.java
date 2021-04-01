package oop_quiz2;
import java.util.Scanner;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.io.File;
import java.io.FileNotFoundException;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		PrintWriter outputStream = null;
		int input;
		String word, def, name;
		int count;
		
		
		DictionaryArray list = new DictionaryArray();
		
		while(true) {
			System.out.println("=================main menu================");
			System.out.println("(1) Add a word to dictionary");
			System.out.println("(2) Show definition of word");
			System.out.println("(3) Show word list");
			System.out.println("(4) remove word");
			System.out.println("(5) print all contents");
			System.out.println("(6) Exit Prigram");
			System.out.println("==========================================");
			System.out.print("choose a menu: ");
			input = sc.nextInt();
			sc.nextLine();
			
			switch(input) {
			case 1:
				try {
					System.out.println("word:");
					word = sc.nextLine();
					System.out.println("definition:");
					def = sc.nextLine();
					list.insertEntry(word, def);
				}
				catch(AlreadyExistInDicException e) {
					System.out.println(e.getMessage());
				}
				break;
			case 2:
				try {
					System.out.println("word for searching: ");
					word = sc.nextLine();
					list.getDefinition(word);
				}
				catch(EmptyException e) {
					System.out.println(e.getMessage());
				}
				catch(NotInDicException e) {
					System.out.println(e.getMessage());
				}
				break;
			case 3:
				try {
					list.printWords();
				}
				catch(EmptyException e) {
					System.out.println(e.getMessage());
				}
				break;
			case 4:
				try {
					System.out.println("word to remove: ");
					word = sc.nextLine();
					list.removeWord(word);
				}
				catch(EmptyException e) {
					System.out.println(e.getMessage());
				}
				catch(NotInDicException e) {
					System.out.println(e.getMessage());
				}
				break;
			case 5:
				try {
					list.printAll();
				}
				catch(EmptyException e) {
					System.out.println(e.getMessage());
				}
				break;
			case 6:
				try {
					System.out.println("Enter a file name: ");
					name = sc.nextLine();
					File file = new File(name);
					outputStream = new PrintWriter(new FileOutputStream(name));
					for(int i=0; i<list.size(); i++) {
						count = i+1;
						outputStream.println(count+". word: "+list.get(i).getWord());
						outputStream.println("definition: "+list.get(i).getDefinition());
					}
					System.out.println("saved as "+ name);
					System.out.println("exit program");
					outputStream.close();
					System.exit(0);
				}
				catch(FileNotFoundException e) {
					System.out.println("no file");
				}
				break;
			default:
				System.out.println("insert 1~6");
				break;
			}
		}
	}

}
