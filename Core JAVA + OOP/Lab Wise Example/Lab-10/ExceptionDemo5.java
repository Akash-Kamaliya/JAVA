class OutOfRangeException extends Exception {
    public OutOfRangeException(String message) {
        super(message);
    }
}

public class ExceptionDemo5 {
    static void checkNumber(int num) throws OutOfRangeException {
        if (num < 10 || num > 50) {
            throw new OutOfRangeException("Number is out of range (10–50)!");
        } else {
            System.out.println("Square of number: " + (num * num));
        }
    }

    public static void main(String[] args) {
        try {
            checkNumber(8);
        } catch (OutOfRangeException e) {
            System.out.println(e.getMessage());
        }
    }
}
