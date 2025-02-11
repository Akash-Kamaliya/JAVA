class Time {
	int hour;
	int minute;
	public Time(int hour , int minute) {
		this.hour = hour;
		this.minute = minute; 
	}
	public void addition (Time t){
		this.hour+=t.hour;
		this.minute+=t.minute;
		if(this.minute>59){
			this.minute-=60;
			this.hour++;
		}
		System.out.println(this.hour+":"+this.minute);
	}
}
public class TimeDemo {
	public static void main(String[] args) {
		Time t1 = new Time(2,50);
		Time t2 = new Time(2,50);
		t1.addition(t2);
	}
}