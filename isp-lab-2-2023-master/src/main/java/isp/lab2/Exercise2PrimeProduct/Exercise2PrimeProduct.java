package isp.lab2.Exercise2PrimeProduct;

import java.util.Scanner;

public class Exercise2PrimeProduct {

    /**
     * This method should return the product of the first n prime numbers
     * @param n
     * @param m
     * @return
     */
    public static long getPrimeProduct(int n, int m) {
        int i, j, ok=1, sq;
        long product=1;
        for(i=n+1; i<m; i++)
        {
            ok=1;
            if(i%2!=0) {
                sq = (int) Math.sqrt(i);
                for (j = 3; j <= sq; j++) {
                    if (i % j == 0) ok = 0;
                }
            }
            else ok=0;
            if (ok == 1) product=product*i;

        }
        return product;
    }


    /**
     * This method should read from the console a number
     * @return the number read from the console
     */
    public static int readfromConsoleInt() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int number = scanner.nextInt();
        return number;
    }

    public static void main(String[] args) {
        System.out.println("The product of the first 10 prime numbers is: " + getPrimeProduct(1, 10));
        System.out.println("The product of prime numbers between m and n: " + getPrimeProduct(readfromConsoleInt(), readfromConsoleInt()));
    }

}
