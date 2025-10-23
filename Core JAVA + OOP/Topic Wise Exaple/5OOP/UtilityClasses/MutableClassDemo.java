class MutableClass {
	int a;
	void add5(){
		a=a+5;
	}
}

public class MutableClassDemo {
	public static void main(String[] args) {
		MutableClass m1 = new MutableClass();
		m1.a=10;
		m1.add5();
		System.out.println(m1.a);
	}
}