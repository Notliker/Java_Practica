package Hw8;

import java.util.Scanner;

public class Tenth {public static String reverse(String str) {
    return str.isEmpty() ? "" : reverse(str.substring(1)) + str.charAt(0);
}
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter number: ");
            System.out.println("Reversed: " + reverse(String.valueOf(sc.nextInt())));
        }
    }
}