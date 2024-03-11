package isp.lab2.Exercise1RandomArray;

import java.util.Random;

public class Exercise1RandomArray {

    public static int[] getArrayOfRandomNumbers(int n) {
        int[] array = new int[n];
        // creează un obiect Random
        Random rand = new Random();

        for (int i = 0; i < n; i++) {
            array[i] = rand.nextInt(100);
        }
        return array;
    }

    public static int[] findMinAndMax(int[] array) {
        int i, min=array[0], max=array[0];
        for(i=0; i< array.length; i++) {
            if(array[i]<min) min=array[i];
            if(array[i]>max) max=array[i];

        }
        int mn[]= {min, max};
        return mn;
    }

    public static void print() {
        System.out.println("TEST");
    }

    public static void main(String[] args) {

        Random random = new Random();
        //genereaza numar random intre 10 si 100
        int size = random.nextInt(90) + 10;
        int[] a = getArrayOfRandomNumbers(size);
        int[] mm = findMinAndMax(a);
        System.out.println("Min is:"+mm[0]+" Max is:"+mm[1] );
    }
}
