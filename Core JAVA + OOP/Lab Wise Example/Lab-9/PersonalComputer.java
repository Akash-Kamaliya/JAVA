interface EventListener{
    public void performEvent();
}

interface MouseListener{
    public void mouseClicked();
    public void mousePressed();
    public void mouseReleased();
    public void mouseMoved();
    public void mouseDragged();
}

interface KeyListener{
    public void keyPressed();
    public void keyReleased();
}

class EventDemo implements EventListener, MouseListener, KeyListener{
    public void performEvent(){
        System.out.println("Event perfomed");
    }
    public void mouseClicked(){
        System.out.println("Mouse clicked");
    }
    public void mousePressed(){
        System.out.println("Mouse pressed");
    }
    public void mouseReleased(){
        System.out.println("Mouse released");
    }
    public void mouseMoved(){
        System.out.println("Mouse moved");
    }
    public void mouseDragged(){
        System.out.println("Mouse dragged");
    }
    public void keyPressed(){
        System.out.println("Key pressed");
    }
    public void keyReleased(){
        System.out.println("Key released");
    }
}

public class PersonalComputer{
    public static void main(String[] args){
        EventDemo e = new EventDemo();
        e.performEvent();
        e.mouseClicked();
        e.mousePressed();
        e.mouseReleased();
        e.mouseMoved();
        e.mouseDragged();
        e.keyPressed();
        e.keyReleased();
    }
}