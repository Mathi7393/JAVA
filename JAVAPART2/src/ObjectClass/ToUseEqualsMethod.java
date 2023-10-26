package ObjectClass;

import java.util.Objects;

public class ToUseEqualsMethod {

	String Brand;
	String Colour;
	double Price;

	ToUseEqualsMethod() {

	}

	ToUseEqualsMethod(String brand, String colour, double price) {
		super();
		this.Brand = brand;
		this.Colour = colour;
		this.Price = price;
	}

	@Override
	public String toString() {
		return "Brand=" + Brand + ", Colour=" + Colour + ", Price=" + Price;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ToUseEqualsMethod other = (ToUseEqualsMethod) obj;
		return Objects.equals(Brand, other.Brand) && Objects.equals(Colour, other.Colour)
				&& Double.doubleToLongBits(Price) == Double.doubleToLongBits(other.Price);
	}
	
}
