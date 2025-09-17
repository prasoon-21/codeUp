/*
 This sample code expands characters based on the number that follows them.
 For example: a2b3 -> aabbb
 Written by - Prasoon Mishra
 Dated - 16/09/2025
*/

import java.util.Scanner;

public class expandChar {
    public static void main(String[] args) {
        expand();
    }

    public static void expand() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the string: ");
        String s = scanner.nextLine();
        scanner.close();

        int i = 0;

        while (i < s.length()) {
            char currentChar = s.charAt(i);

            if (Character.isLetter(currentChar)) {
                i++;
                int count = 0;
                while (i < s.length() && Character.isDigit(s.charAt(i))) {
                    count = count * 10 + (s.charAt(i) - '0');
                    i++;
                }
                for (int j = 0; j < count; j++) {
                    System.out.print(currentChar); 
                }
            } else {
                i++;
            }
        }
        System.out.println();
    }
}