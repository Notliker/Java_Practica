package Hw29;

import java.util.*;

public class Test {
    public static void main(String[] args) {
        System.out.println("Enter count of cities: ");
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        if(N <= 1) {
            System.out.println("Bruh");
            System.exit(0);
        }
        int[][] g = new int[N][N];
        System.out.println("In next " + N + " strings enter through space N numbers, each of which 0 or 1: ");
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                g[i][j] = scanner.nextInt();
                if (g[i][j] != 0 && g[i][j] != 1 || (i == j && g[i][j] == 1)) {
                    System.out.println("Error");
                    System.exit(0);
                }
            }
        }
        int count = 0;
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (g[i][j] == 1) {
                    if (g[j][i] == 1) {
                        count++;
                    } else {
                        System.out.println("Error");
                        System.exit(0);
                    }
                }
            }
        }
        System.out.println("Count of roads: " + count / 2);
    }
}
