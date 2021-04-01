package assignment_3;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Restaurant {
	
	static TableSet tbset;//주문표
	static ArrayList<Dish> dishes_lee;
	static ArrayList<Dish> dishes_kang;

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		TableSet tbset = new TableSet();
		ArrayList<String> input = new ArrayList<String>();
		
		//파일 읽고 저장
		try {
			File file = new File("OrderSheet.txt");
			FileReader reader = new FileReader(file);
			BufferedReader bufReader = new BufferedReader(reader);
			
			String line = "";
			
			while((line = bufReader.readLine()) != null) {
				input.add(line);
			}
			
			reader.close();
			bufReader.close();
		}
		catch(FileNotFoundException e) {
			e.printStackTrace();
		}
		catch(IOException e) {
			e.printStackTrace();
		}
		
		int i = 0;
		int table_i = 0;
		int tableNum;
		
		while(i < input.size()) {
			if(input.get(i).substring(0,1).equals("T")) {
				tableNum = Integer.parseInt(input.get(i).substring(7));
				i++;
				while(input.get(i).substring(0,1).equals("T") == false) {
					if(input.get(i).substring(0,1).equals("r")) {
						tbset.addToTable(table_i, tableNum, "ramen");
						i++;
					}
					else if(input.get(i).substring(0,1).equals("s")) {
						tbset.addToTable(table_i, tableNum, "stew");
						i++;
					}
					else if(input.get(i).substring(0,1).equals("f")) {
						tbset.addToTable(table_i, tableNum, "friedrice");
						i++;
					}
					else if(input.get(i).substring(0,1).equals("o")) {
						tbset.addToTable(table_i, tableNum, "ovenroast");
						i++;
					}
					
					if(i == input.size()) break;
				}
				table_i++;
			}
		}
		/*
		for(int j=0; j<5; j++) {
			System.out.println(tbset.getTableSet()[j].getTableNum());
			for(int k=0; k<tbset.getTableSet()[j].getDishSet().size(); k++) {
				System.out.println(tbset.getTableSet()[j].getDishSet().get(k).getName());
			}
		}
		*/
		
		dishes_lee = new ArrayList<Dish>();
		dishes_kang = new ArrayList<Dish>();
		Kitchen kitchen = new Kitchen();
		
		//divide dishes: 짝수번째 테이블 Lee, 홀수번째 테이블은 Kang
		for(int j=0; j<tbset.getTableSet().length; j++) {
			if(j % 2 == 0) {
				dishes_lee.addAll(tbset.getTableSet()[j].getDishSet());
			}
			else {
				dishes_kang.addAll(tbset.getTableSet()[j].getDishSet());
			}
		}
		/*
		for(int j=0; j<dishes_lee.size(); j++) {
			System.out.println(dishes_lee.get(j).getName());
		}
		System.out.println();
		for(int j=0; j<dishes_kang.size(); j++) {
			System.out.println(dishes_kang.get(j).getName());
		}
		*/
		Chef lee = new Chef("Lee", kitchen, dishes_lee);
		Chef kang = new Chef("Kang", kitchen, dishes_kang);
		
		lee.start();
		kang.start();
	}

}
