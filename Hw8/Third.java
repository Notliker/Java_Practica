package Hw8;
import java.util.Scanner;

public class Third {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter A number: ");
            int a = scanner.nextInt();
            System.out.println("Enter B number: ");
            int b = scanner.nextInt();
            if (a < b) {
                System.out.println("Sequence: ");
                for (int i = a; i <= b; i++)
                {//begin for loop i
                    System.out.print(i + " ");
                }
            }
            if (b < a) {
                System.out.println("Sequence: ");
                for (int j = a; j >= b; j--) {
                    System.out.print(j + " ");
                }
            }
            if (a == b) {
                System.out.println("Enter different num! ");
            }
        }
    }
