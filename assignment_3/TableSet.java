package assignment_3;

public class TableSet {
	//식당의 모든 테이블에 대한 작업을 수행
	
	private Table[] tableSet;
	
	public TableSet() {
		tableSet = new Table[5];
		for(int i=0; i<5; i++) {
			tableSet[i] = new Table();
		}
	}
	
	public void addToTable(int index, int tableNum, String name) {
		//table #[index]에 음식을 추가
		tableSet[index].getDishSet().add(new Dish(tableNum, name));
		tableSet[index].setTableNum(tableNum);
	}
	
	public Table[] getTableSet() {
		return tableSet;
	}
}
