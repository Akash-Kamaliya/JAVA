class DarshanUniException extends Exception {
    public DarshanUniException(String message) {
        super(message);
    }
}

public class ExceptionDemo3 {
    static void checkEligibility(int marks) throws DarshanUniException {
        if (marks < 40) {
            throw new DarshanUniException("Not eligible for next semester!");
        } else {
            System.out.println("Eligible for next semester.");
        }
    }

    public static void main(String[] args) {
        try {
            checkEligibility(30);
        } catch (DarshanUniException e) {
            System.out.println("Caught Exception: " + e.getMessage());
        }
    }
}
