class Rect {
	int len;
	int wid;
	boolean isFailed;
	public Rect(int l,int w , boolean isF) {
		len = l;
		wid = w;
		isFailed = isF;
	}
}
public class ConstructorDemo1 {
	public static void main(String [] args){
		Rect r1 = new Rect(6,6,false);
		System.out.println(r1.len);
	}
}