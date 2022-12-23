package Hw18;


public class Exception1 {
    public void exceptionDemo() {
        try{
            System.out.println( 121/0 );
        } catch ( ArithmeticException e ) {
            System.out.println("Attempted division by zero");
        }
    }
}
