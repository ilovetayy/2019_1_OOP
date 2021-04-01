package assignment_3;

import java.util.ArrayList;

public class Table {
	//식당의 테이블: 각 테이블은 고유번호가 있고 최대 4개의 음식을 주문받을 수 있다
	
	private int TableNum;
	private ArrayList<Dish> dishSet;
	
	public Table() {
		dishSet = new ArrayList<Dish>(4);
	}
	
	public int getTableNum() {
		return TableNum;
	}
	
	public void setTableNum(int num) {
		TableNum = num;
	}
	
	public ArrayList<Dish> getDishSet(){
		return dishSet;
	}
}
