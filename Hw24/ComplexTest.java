package Hw24;

import java.util.*;

public class ComplexTest {
    public static void main(String[] args) {
        ConcreteFactory numb1 = new ConcreteFactory();
        int real = 0, img = 0;
        try {
            System.out.println("Enter real part: ");
            real = new Scanner(System.in).nextInt();
            System.out.println("Enter the imaginary part: ");
            img = new Scanner(System.in).nextInt();
        }
        catch (InputMismatchException e ) {
            System.err.println("U enter something wrong");
            System.exit(0);
        }
        numb1.createComplex();
        numb1.createComplex(real, img);
    }
}
