import java.util.Scanner;

public class CountWovelConst {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String");
        String name = sc.nextLine().toLowerCase();
        int i = 0;
        int c = 0;
        int v = 0;
        for (i = 0; i < name.length(); i++) {
            if ((name.charAt(i) == 'a') || (name.charAt(i) == 'e') || (name.charAt(i) == 'i') || (name.charAt(i) == 'o')
                    || (name.charAt(i) == 'u')) {
                v++;
            } else if (name.charAt(i) == ' ') {
            } else {
                c++;
            }
        }
        System.out.println("In given String number of wovel is : " + v);
        System.out.println("In given String number of Constant is : " + c);
        sc.close();
    }
}