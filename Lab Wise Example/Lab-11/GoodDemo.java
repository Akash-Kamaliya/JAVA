class GoodMorning implements Runnable{
	public void run(){
		while(true){
		System.out.println("Good Morning :");
		try{
			Thread.sleep(1000);
		}
		catch(Exception e){
			e.printStackTrace();
		}
	}
	}
}
class GoodAfterNoon implements Runnable{
	public void run(){
		while(true){
		System.out.println("Good After Noon :");
		try{
			Thread.sleep(3000);
		}
		catch(Exception e){
			e.printStackTrace();
		}
	}
	}
}
public class GoodDemo {
	public static void main(String[] args) {
		GoodMorning m = new GoodMorning();
		GoodAfterNoon a = new GoodAfterNoon();
		Thread t1 = new Thread(m);
		Thread t2 = new Thread(a);
		t1.start();
		t2.start();
	}
}