package Guitar;

public class Guitar {
	public String number;
	private double Price;
	GuitarSpec guitarSpec;
	public void setPrice(double price){
		this.Price=price;
	}
	public double getPrice (){
		return Price;
	}
	public String getNumber(){
		return number;
	}
 public Guitar(String number, double Price,GuitarSpec guitarSpec){
	 this.number=number;
	 this.Price=Price;
	 this.guitarSpec=guitarSpec;
 }
}
