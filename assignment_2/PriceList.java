package assignment_2;

public class PriceList {
	private Oil[][] priceList;
	private int vertical;
	
	public PriceList() {
		vertical = 2;
		priceList = new Oil[2][2];
	}
	
	public int getVertical() {
		return vertical;
	}
	
	public void setPriceList(int i, int j, Oil oil) {
		priceList[i][j] = oil;
		priceList[i][j].setPriceInStore();
	}
	
	public void extendList(int amount) {
		vertical += amount;
		Oil[][] newArr = new Oil[vertical][2];
		for(int i=0; i<priceList.length; i++) {
			for(int j=0; j<2; j++) {
				newArr[i][j] = priceList[i][j];
			}
		}
		priceList = newArr;
	}
	
	public String getRegionInfo(int i) {
		if(i-1<0 || i>priceList.length) {
			System.out.println("wrong number");
			return "\0";
		}
		if(priceList[i-1][0] == null) {
			System.out.println("nothing");
			return "\0";
		}
		return priceList[i-1][0].toString()+"\n"+priceList[i-1][1].toString();
	}
	
	public void printList() {
		if(priceList[0][0] == null) {
			System.out.println("nothing to print\n");
			return;
		}
		System.out.println("\t\tGasoline\tDiesel");
		System.out.println("==========================================");
		for(int i=0; i<priceList.length; i++) {
			if(priceList[i][0] != null) {
				int count = i+1;
				System.out.print("Region #"+count+"\t");
				System.out.print(priceList[i][0].getOilPrice()+"\t\t");
				System.out.println(priceList[i][1].getOilPrice());
				System.out.println();
			}
		}
	}
}
