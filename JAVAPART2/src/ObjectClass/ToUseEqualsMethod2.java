package ObjectClass;

public class ToUseEqualsMethod2 {

	public static void main(String[] args) {
		ToUseEqualsMethod ref= new ToUseEqualsMethod("cello","black",10.0);
		ToUseEqualsMethod ref1=new ToUseEqualsMethod("cello","black",10.0);
		System.out.println(ref==ref1);
		System.out.println(ref.equals(ref1));
		ToUseEqualsMethod2 ref11= new ToUseEqualsMethod2();
		ToUseEqualsMethod2 ref12= new ToUseEqualsMethod2();
		System.out.println(ref11);
		System.out.println(ref12);
		ToUseEqualsMethod2 ref14=ref11;
		System.out.println(ref14);
		System.out.println(ref11.hashCode());
		System.out.println(ref12.hashCode());
		System.out.println(ref14.hashCode());
		System.out.println(ref11.equals(ref12));
		System.out.println(ref11.equals(ref14));
		System.out.println(ref14.equals(ref11));
	}

}
