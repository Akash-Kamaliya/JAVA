import java.util.Scanner;
class Book{
    private String author_name;
    public Book(String author_name){
        this.author_name = author_name;
    }
    public void displayTitle(){
        System.out.println(this.author_name);
    }
}/n 

class Book_publication extends Book{
    private String title;
    public Book_publication(String author_name,String title){
        super(author_name);
        this.title = title;
    }
    public void displayTitle(){
        super.displayTitle();
        System.out.println(this.title);
    }
}

class Paper_publication extends Book{
    private String title;
    public Paper_publication(String author_name,String title){
        super(author_name);
        this.title = title;
    }
    public void displayTitle(){
        super.displayTitle();
        System.out.println(this.title);
    }
}

public class Author{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Book b1 = null;
        System.out.println("Enter 1 for book publicationor 2 for paper publication");
        int n = sc.nextInt();
        if(n == 1){
            b1 = new Book_publication(args[0],args[1]);
        }else if(n == 2){
            b1 = new Paper_publication(args[0],args[1]);
        }else{
        System.out.println("Enter valid no ");
        }
        if (b1 != null) {
            b1.displayTitle();
        }
    }
}