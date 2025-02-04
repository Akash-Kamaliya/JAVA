class MathExamples {
    public static void main(String[] args) {
        // 1. Constants
        System.out.println("PI: " + Math.PI);
        System.out.println("E: " + Math.E);

        // 2. Basic Operations
        System.out.println("Absolute (-10): " + Math.abs(-10));
        System.out.println("Max (10, 20): " + Math.max(10, 20));
        System.out.println("Min (10, 20): " + Math.min(10, 20));

        // 3. Power and Root
        System.out.println("Square root of 25: " + Math.sqrt(25));
        System.out.println("2^3 (Power): " + Math.pow(2, 3));

        // 4. Rounding Operations
        System.out.println("Ceil(5.3): " + Math.ceil(5.3));
        System.out.println("Floor(5.7): " + Math.floor(5.7));
        System.out.println("Round(5.5): " + Math.round(5.5));

        // 5. Trigonometric Functions (Angle in Radians)
        System.out.println("Sin(30 degrees): " + Math.sin(Math.toRadians(30)));
        System.out.println("Cos(60 degrees): " + Math.cos(Math.toRadians(60)));
        System.out.println("Tan(45 degrees): " + Math.tan(Math.toRadians(45)));

        // 6. Logarithmic Functions
        System.out.println("Log(10): " + Math.log(10));
        System.out.println("Log10(10): " + Math.log10(10));
        System.out.println("Exponential (e^2): " + Math.exp(2));

        // 7. Random Number
        System.out.println("Random Number (0 to 1): " + Math.random());

        // 8. Sign Functions
        System.out.println("Signum(-5): " + Math.signum(-5));

        // 9. Hyperbolic Functions
        System.out.println("Sinh(1): " + Math.sinh(1));
        System.out.println("Cosh(1): " + Math.cosh(1));
        System.out.println("Tanh(1): " + Math.tanh(1));

        // 10. Convert Degrees to Radians & Vice Versa
        System.out.println("Radians(180): " + Math.toRadians(180));
        System.out.println("Degrees(π): " + Math.toDegrees(Math.PI));
    }
}
