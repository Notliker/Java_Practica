package Hw3;

import java.util.Arrays;
import java.util.Random;


public class first {
    public static void main(String[] args){
        int size = (int) ((Math.random()+1)*5);
        System.out.println("Size: " + size);
        double[] arr1 = new double[size];
        for (int i = 0; i < size; i++){
            arr1[i] = ((double)(Math.random() * 30));
        }
        System.out.println("Unsorted (Math.random) - " + Arrays.toString(arr1));
        Random random = new Random();
        double[] arr2 = random.doubles(size, 1,100).toArray();
        System.out.println("Unsorted (class Random) - " + Arrays.toString(arr2));

        bubbleSort(arr1);
        bubbleSort(arr2);
        System.out.println("Sorted (Math.random) - " + Arrays.toString(arr1));
        System.out.println("Sorted (class Random) - " + Arrays.toString(arr2));
    }
    public static void bubbleSort(double[] sortArr){
        for (int i = 0; i < sortArr.length - 1; i++) {
            for(int j = 0; j < sortArr.length - i - 1; j++) {
                if(sortArr[j + 1] < sortArr[j]) {
                    var swap = sortArr[j];
                    sortArr[j] = sortArr[j + 1];
                    sortArr[j + 1] = swap;
                }
            }
        }
    }
}
