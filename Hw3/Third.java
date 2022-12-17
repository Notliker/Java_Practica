package Hw3;

import java.util.Arrays;
import java.util.Random;

public class Third {
    public static void main(String[] args) {
    int size = 4;
    Random random = new Random();
    int[] array = random.ints(size, 10, 100).toArray();
    System.out.println(Arrays.toString(array));
    int temp;
    for (int i = 0; i < size; i++){
        if ((array[i] < array[i+1]) & (array[i+1] < array[i+2]) & (array[i+2] < array[i+3])){
            System.out.println("Strictly increasing sequence");
            break;
        }
        else {
            System.out.println("Not strictly increasing sequence");
            break;
        }
    }
}
}
