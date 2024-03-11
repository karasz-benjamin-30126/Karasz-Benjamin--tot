package isp.lab2.Exercise6WordGuess;

import java.util.Arrays;
import java.util.Scanner;

public class Exercise6WordGuess {

    /**
     * This method will return the number of occurrences of a character in a word
     *
     * @param c
     * @param word
     * @return
     */
    public static int[] getOccurrencePositions(char c, char[] word) {
        int j=0, d= word.length;
        int[] rez= new int[d];
        rez[0]=-1;
        for(int i = 0; i<d; i++ )
        {
            if(word[i]==c){
                rez[j]=i;
                j++;
            }
        }
        if(j==0) j++;
        return Arrays.copyOfRange(rez, 0, j );
    }

    public static void main(String[] args) {
        char[] word = {'a', 'b', 'c', 'a', 'd', 'a'}; // replace with a word from a dictionary
        boolean solved = false;
        Scanner scanner = new Scanner(System.in);
        int n= word.length;

        int tries = 0;
        while (tries < 20 && !solved) {
            tries++;
            System.out.println("Enter a letter: ");
            String letter = scanner.nextLine();
            int[] occurrences = getOccurrencePositions(letter.charAt(0), word);
            // todo: continue the implementation
            if(occurrences[0]!=-1) {
                n = n - occurrences.length;
                if (n == 0) {
                    solved = true;
                    System.out.print("Congrats, you solved it. The word is:");
                    for (char c : word)
                        System.out.print(c);
                    System.out.println();
                    System.out.println("Number of tries: " + tries);
                }
            }
            else System.out.println("The word doesn't contain this letter");

        }
    }

}
