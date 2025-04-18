interface Playable{
    public void play();
}



class Football implements Playable{
    public void play(){
        System.out.println("Football is played");
    }
}



class Volleyball implements Playable{
    public void play(){
        System.out.println("Volleyball is played");
    }
}



class Basketball implements Playable{
    public void play(){
        System.out.println("Basketball is played");
    }
}



public class Sport{
    public static void main(String[] args){
        Football f = new Football();
        Volleyball v = new Volleyball();
        Basketball b = new Basketball();
        f.play();
        v.play();
        b.play();
    }
}