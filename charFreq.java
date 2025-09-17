/*
this sample code count the frequecy of character present in string
Written by-Prasoon Mishra
Dated- 16/09/2025
*/
import java.util.Scanner;

public class charFreq {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();
        scanner.close();
        
        int[] frequency = new int[256];
        
        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            frequency[c]++;
        }
        
        System.out.println("Character frequencies:");
        for (int i = 0; i < frequency.length; i++) {
            if (frequency[i] > 0) {
                System.out.println((char)i + " : " + frequency[i]);
            }
        }
    }
}