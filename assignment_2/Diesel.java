package assignment_2;
import java.util.Random;

public class Diesel extends Oil{
	Random rand = new Random();
	
	private int price;//°ø±Þ°¡
	private double VAT;
	private double envTax;
	
	public Diesel(int price, String company) {
		super(company, "diesel");
		this.price = price;
		VAT = (rand.nextInt(30)+1)/100.0;
		envTax = 500;
	}
	
	public double getOilPrice() {
		return price + envTax + price * VAT;
	}
	
	public String toString() {
		return super.toString()+"supply price: "+price+"\n";
	}
}
