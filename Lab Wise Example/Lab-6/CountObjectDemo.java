class CountObject{
	static int c=0;
	public CountObject(){
		this.c++;
	}
}
public class CountObjectDemo{
	public static void main(String [] args){
		CountObject c1 = new CountObject();
		CountObject c2 = new CountObject();
		CountObject c3 = new CountObject();
		CountObject c4 = new CountObject();
		CountObject c5 = new CountObject();
		System.out.println("Total Object are = "+c1.c);
	}
}
