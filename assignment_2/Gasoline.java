package assignment_2;
import java.util.Random;

public class Gasoline extends Oil{
	Random rand = new Random();
	
	private int price;//°ø±Þ°¡
	private double VAT;
	
	public Gasoline(int price, String company) {
		super(company, "gasoline");
		this.price = price;
		VAT = (rand.nextInt(30)+1)/100.0;
	}
	
	public double getOilPrice() {
		return price + price * VAT;
	}
	
	public String toString() {
		return super.toString()+"supply price: "+price+"\n";
	}
}
