package assignment_3;

import java.util.ArrayList;

public class Table {
	//�Ĵ��� ���̺�: �� ���̺��� ������ȣ�� �ְ� �ִ� 4���� ������ �ֹ����� �� �ִ�
	
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
