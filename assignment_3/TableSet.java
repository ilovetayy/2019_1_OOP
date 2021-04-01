package assignment_3;

public class TableSet {
	//�Ĵ��� ��� ���̺� ���� �۾��� ����
	
	private Table[] tableSet;
	
	public TableSet() {
		tableSet = new Table[5];
		for(int i=0; i<5; i++) {
			tableSet[i] = new Table();
		}
	}
	
	public void addToTable(int index, int tableNum, String name) {
		//table #[index]�� ������ �߰�
		tableSet[index].getDishSet().add(new Dish(tableNum, name));
		tableSet[index].setTableNum(tableNum);
	}
	
	public Table[] getTableSet() {
		return tableSet;
	}
}
