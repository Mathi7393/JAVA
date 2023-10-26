package ObjectClass;

public class MarkerToUseToStringMethodWithOverriding {
//to use toStringMethod with Overriding
	String Brand;
	String Colour;
	double Price;
	MarkerToUseToStringMethodWithOverriding(String brand, String colour, double price) {
		super();
		this.Brand = brand;
		this.Colour = colour;
		this.Price = price;
	}
	MarkerToUseToStringMethodWithOverriding() {
		
	}
	@Override
	public String toString() {
		return "Brand=" + Brand + ", Colour=" + Colour + ", Price=" + Price;
	}
	
}
