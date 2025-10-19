package Static;

public class StaticVar {
    int id;
    String name;
    static String college = "Darshan University";

    StaticVar(int i, String n) {
        id = i;
        name = n;
    }

    void display() {
        System.out.println(id + " " + name + " " + college);
    }

    public static void main(String[] args) {
        StaticVar s1 = new StaticVar(1, "Akash");
        StaticVar s2 = new StaticVar(2, "Ravi");

        s1.display();
        s2.display();
    }
}
