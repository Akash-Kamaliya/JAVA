class Odd implements Runnable{
	public void run(){
		int i = 0;
		while(i<=20){
			if(i%2!=0){
				System.out.println(i);
		try{
			Thread.sleep(1000);
		}
		catch(Exception e){
			e.printStackTrace();
		}
			}
			i++;
		}
	}
}
class Even implements Runnable{
	public void run(){
		int i = 0;
		while(i<=20){
			if(i%2==0){
				System.out.println(i);
		try{
			Thread.sleep(1000);
		}
		catch(Exception e){
			e.printStackTrace();
		}
			}
			i++;
		}
	}
}
public class OddEven {
	public static void main(String[] args) {
		Odd o = new Odd();
		Even e = new Even();
		Thread t1 = new Thread(o);
		Thread t2 = new Thread(e);
		t1.start();
		t2.start();
	}
}