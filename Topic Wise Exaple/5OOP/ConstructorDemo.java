//Default Constructor
class Rect {
	int len;
	int wid;
	boolean isFailed;
	public Rect() {
		len = 6;
		wid = 6;
		isFailed = false;
	}
}
public class ConstructorDemo {
	public static void main(String [] args){
		Rect r1 = new Rect();
		System.out.println(r1.len);
	}
}