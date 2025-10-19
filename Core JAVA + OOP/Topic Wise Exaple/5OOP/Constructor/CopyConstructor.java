public class CopyConstructor {
     String name;
    int age;

    CopyConstructor(String n, int a) {
        name = n;
        age = a;
    }

    CopyConstructor(CopyConstructor s) {   
        name = s.name;
        age = s.age;
    }

    void display() {
        System.out.println(name + " - " + age);
    }

    public static void main(String[] args) {
        CopyConstructor s1 = new CopyConstructor("Akash", 19);
        CopyConstructor s2 = new CopyConstructor(s1); 
        s2.display();
    }
}
