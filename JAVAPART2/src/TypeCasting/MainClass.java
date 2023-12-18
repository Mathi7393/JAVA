package TypeCasting;

public class MainClass {

	public static void main(String[] args) {
		ChildClass cc=new ChildClass();
		ParentClass pc=cc;
		pc.parent();
		ChildClass cc1= (ChildClass) pc;
		cc1.parent();
		cc1.children();
	}

}
