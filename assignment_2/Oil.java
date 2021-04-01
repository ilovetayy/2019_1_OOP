package assignment_2;

public abstract class Oil {
	private String company;
	private String oilType;
	private double priceInStore;//소비자 가격
	
	public Oil(String company, String oilType) {
		this.company = company;
		this.oilType = oilType;
		priceInStore = 0;
	}
	
	public double getPriceInStore() {
		return priceInStore;
	}
	
	public void setPriceInStore() {
		priceInStore = getOilPrice();
	}
	
	public String toString() {
		return "company: "+company+"\noil type: "+oilType+"\n";
	}
	
	public abstract double getOilPrice();	
}
