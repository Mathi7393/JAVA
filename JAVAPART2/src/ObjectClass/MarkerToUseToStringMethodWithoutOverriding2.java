package ObjectClass;

public class MarkerToUseToStringMethodWithoutOverriding2 {
//Marker Driver
	public static void main(String[] args) {
		MarkerToUseToStringMethodWithoutOverriding m2=new MarkerToUseToStringMethodWithoutOverriding("cello","Blue",50.0);
		System.out.println(m2);
		m2.detailsOfMarker();
	}
}
