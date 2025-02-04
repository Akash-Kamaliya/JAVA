class SmartPhone{
	String manufacturer;
	String model ;
	double storage;
	double screenSize;
	public String getManufacturer(){
		return manufacturer;
	}
	public void setManufacturer(String a){
		manufacturer = a;
	}
}
public class SmartPhoneDemo {
	public static void main (String[]args){
		SmartPhone sp = new SmartPhone();
		sp.setManufacturer("Samsung");
		String name = sp.getManufacturer();
		System.out.println(name);
	}
}