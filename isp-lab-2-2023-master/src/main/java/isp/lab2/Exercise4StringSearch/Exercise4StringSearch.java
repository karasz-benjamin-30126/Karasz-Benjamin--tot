package isp.lab2.Exercise4StringSearch;

import java.util.Arrays;
import java.util.Scanner;

public class Exercise4StringSearch {
    /**
     * This method should return an array of strings that contain the substring.
     * @param input
     * @param substring what to search for
     * @return
     */
    public static String[] searchSubstrings(String input, String substring) {
        int d=0;
        String[] splitInput = input.split(",");
        String[] vectorStrings = new String[splitInput.length];
        for(String temp : splitInput)
        {
            if(temp.contains(substring))
            {
                vectorStrings[d]=temp;
                d++;
            }
        }
        return Arrays.copyOfRange(vectorStrings, 0, d);
    }

    public static String readFromConsole(String suffix) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter " + suffix);
        return scanner.nextLine();
    }

    public static void main(String[] args) {
        String input = "apples,computer,bread,tea,car"; // = readFromConsole("words");
        String substring = "te"; // = readFromConsole("substring");
        String[] result = searchSubstrings(input, substring);
        for (String string : result) {
            System.out.println(string);
        }
    }
}
