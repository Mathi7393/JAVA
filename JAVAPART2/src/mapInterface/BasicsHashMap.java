package mapInterface;

import java.util.HashMap;
import java.util.Hashtable;

public class BasicsHashMap {

	public static void main(String[] args) {
		HashMap<Integer,String> m1=new HashMap<>();
		m1.put(101,"Samsung");
		m1.put(102,"Realme");
		m1.put(103,"Oppo");
		m1.put(104,"Vivo");
		System.out.println("Map Objects are : "+m1);
		m1.put(103, "Redmi");
		System.out.println("Map Objects are : "+m1);
		System.out.println("Check key : "+m1.containsKey(103));
		System.out.println("Check Value :"+m1.containsValue("Oppo"));
		Hashtable<Object, Object> ht=new Hashtable<>();
		ht.put(101,"Samsung");
		ht.put(102,"Realme");
		ht.put(103,"Oppo");
		ht.put(104,"Vivo");
		System.out.println("Table Objects are : "+m1);
		System.out.println(ht.entrySet());
	}

}
