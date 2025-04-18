interface Transport{
    public void deliver();
}


abstract class Animal{
    abstract public void method();+
}


class Tiger extends Animal{
    public void method(){
        System.out.println("not delivered");
    }
}


class Camel extends Animal{
    public void method(){
        System.out.println("not delivered");
    }
} 


class Deer extends Animal implements Transport{
    public void method(){
        System.out.println("delivered");
    }
    public void deliver(){
        System.out.println("delivered");
    }
} 


class Donkey extends Animal implements Transport{
    public void method(){
        System.out.println("delivered");
    }
    public void deliver(){
        System.out.println("delivered");
    }
}  
 

public class Animals{
    public static void main(String[] args){
        Animal[] a = new Animal[4];
        a[0] = new Tiger();
        a[1] = new Camel();
        a[2] = new Deer();
        a[3] = new Donkey();
        a[0].method();
        a[1].method();
        a[2].method();
        ((Transport)a[2]).deliver();
        a[3].method();
        ((Transport)a[3]).deliver();
    }
}
