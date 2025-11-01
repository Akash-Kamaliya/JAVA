import java.util.Scanner;
class Book{
	private String author_name;
	public Book(String author_name){
		this.author_name = author_name ;
	}
	public void display(){
		System.out.println(this.author_name);
	}
}
class Book_publication extends Book {
	private String title;
	public Book_publication(String author_name,String title){
		super(author_name);
		this.title = title ;
	}
	public void display(){
		super.display();
		System.out.println(this.title);
	}
}
class Paper_publication extends Book{
	private String title ;
	public Paper_publication(String author_name,String title){
		super(author_name);
		this.title = title;
	}
	public void display(){
		super.display();
		System.out.println(this.title);
	}
}
public class BookDemo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 1 to Book publiction\nEnter 2 to Paper Publication\n");
		int x = sc.nextInt();
		Book b1=null;
		if(x==1){
			b1 = new Book_publication(args[0],args[1]);
		}
		else if(x==2){
			b1 = new Paper_publication(args[0],args[1]);
		}
		b1.display();
		sc.close();
	}
}