package ObjectClass;

public class MarkerToUseToStringMethodWithoutOverriding {
//to use toStringMethod without Overriding
	String Brand;
	String Colour;
	double Price;
	MarkerToUseToStringMethodWithoutOverriding(String brand, String colour, double price) {
		super();
		this.Brand = brand;
		this.Colour = colour;
		this.Price = price;
	}
	MarkerToUseToStringMethodWithoutOverriding() {
		
	}
	public void detailsOfMarker() {
		System.out.println("Brand"+Brand);
		System.out.println("Colour"+Colour);
		System.out.println("Price"+Price);
	}
}
