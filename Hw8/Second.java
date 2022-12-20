package Hw8;
import java.util.Scanner;


public class Second {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = scanner.nextInt();
        System.out.println("All numbers from 1 to " + n + " : ");
        for (int i = 1; i <= n; i++) {
            System.out.println(i);
        }
    }
}
