package DynamicMethodDispatch;
public class TestStaticBinding {
    public void display() {
        System.out.println("Static method called");
    }

    private void show() {
        System.out.println("Private method called");
    }

    public static void main(String[] args) {
        TestStaticBinding t = new TestStaticBinding();
        t.display();
        t.show();
    }
}

