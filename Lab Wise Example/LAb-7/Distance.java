import java.lang.Math;
class MyPoint{
    double xCoordinate;
    double yCoordinate;
    public MyPoint(){
        this.xCoordinate = 0;
        this.yCoordinate = 0;
    }
    public MyPoint(double xCoordinate,double yCoordinate){
        this.xCoordinate = xCoordinate;
        this.yCoordinate = yCoordinate;
    }
    public void distance(MyPoint p){
        System.out.println(Math.sqrt(Math.pow((this.xCoordinate-p.xCoordinate),2)+Math.pow((this.yCoordinate-p.yCoordinate),2)));
    }
}
class TreeDPoint extends MyPoint{
    double zCoordinate;
    public TreeDPoint(){
        super(0,0);
        this.zCoordinate = 0;
    }
    public TreeDPoint(double xCoordinate,double yCoordinate,double zCoordinate){
        super(xCoordinate,yCoordinate);
        this.zCoordinate = zCoordinate;
    }
    public double getZ(){
        return this.zCoordinate;
    }
    public void distance(TreeDPoint t){
        System.out.println(Math.pow(Math.pow((this.xCoordinate-t.xCoordinate),2)+Math.pow((this.yCoordinate-t.yCoordinate),2)+Math.pow((this.zCoordinate-t.zCoordinate),2),0.5));
    }
}
public class Distance{
    public static void main(String[] args){
        MyPoint m = new MyPoint();
        MyPoint m1 = new MyPoint(2.0,5.0);
        m.distance(m1);
        TreeDPoint t = new TreeDPoint();
        System.out.println(t.getZ());
        TreeDPoint t1 = new TreeDPoint(2.0,2.0,2.0);
        System.out.println(t.getZ());
        t.distance(t1);
    }
}