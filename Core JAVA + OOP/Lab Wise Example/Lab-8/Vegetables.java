abstract class Vegetable{
    String color;
    public Vegetable(String color){
        this.color = color;
    }
    public abstract String toString();
}



class Potato extends Vegetable{
    public Potato(String color){
        super(color);
    }
    public String toString(){
        return super.color;
    }
}



class Brinjal extends Vegetable{
    public Brinjal(String color){
        super(color);
    }
    public String toString(){
        return super.color;
    }

}



class Tomato extends Vegetable{
    public Tomato(String color){
        super(color);
    }
    public String toString(){
        return super.color;
    }

}



public class Vegetables{
    public static void main(String[] args){
        Potato p = new Potato("Brown");
        System.out.println(p);
        Brinjal b = new Brinjal("Purple");
        System.out.println(b);
        Tomato t = new Tomato("Red");
        System.out.println(t);
    }
}