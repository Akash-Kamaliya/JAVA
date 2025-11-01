class CountObject{
	static int c=0;
	public CountObject(){
		c++;
	}
}
public class CountObjectDemo{
	public static void main(String [] args){
		@SuppressWarnings("unused")
		CountObject c1 = new CountObject();
		@SuppressWarnings("unused")
		CountObject c2 = new CountObject();
		@SuppressWarnings("unused")
		CountObject c3 = new CountObject();
		@SuppressWarnings("unused")
		CountObject c4 = new CountObject();
		@SuppressWarnings("unused")
		CountObject c5 = new CountObject();
		System.out.println("Total Object are = "+CountObject.c);
	}
}
