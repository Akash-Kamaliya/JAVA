public class ExceptionDemo1 {
    public static void main(String[] args) {
        try{
            int a = 10 , b = 0;
            int c = a / b;
            System.out.println("Result :"+c);
        }catch(ArithmeticException e){
            System.out.println("Arithmatic Exception :"+e.getMessage());
        }
        try{
            int arr[] = {1,2,3};
            System.out.println(arr[5]);
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Array Index out of bounds :" + e.getMessage());
        }
    }    
}
