/*
this sample code convert number into word
Written by-Prasoon Mishra
Dated- 16/09/2025
*/

import java.util.*;

public class intToString {

    public static void main(String[] args) {
        Scanner xy= new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n = xy.nextInt();
        String result = toWords(n);
        System.out.println(result);
        xy.close();
    }

public static String toWords(int n) {
    if (n == 0) {
        return "zero";
    }
    if (n == 1000) {
        return "one thousand";
    }

    String result = "";

    int hundreds = n / 100;
    int remainder = n % 100;
    int tens = remainder / 10;
    int ones = remainder % 10;

    if (hundreds > 0) {
        result += ones(hundreds) + " hundred";
        if (remainder != 0) {
            result += " and ";
        }
    }

    if (remainder != 0) {
        if (remainder < 10) {
            result += ones(ones);
        } else if (remainder < 20) {
            result += tenToTwenty(remainder - 10);
        } else {
            result += tenToTwenty(tens);
            if (ones != 0) {
                result += " " + ones(ones);
            }
        }
    }

    return result;
}

    
    public static String ones(int digit) {
        String[] ones = {"", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
        return ones[digit];
    }
    
    public static String tenToTwenty(int digit) {
        String[] teens = {"ten", "eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen", "nineteen"};
        return teens[digit];
    }
    
    public static String tens(int digit) {
        String[] tens = {"", "", "twenty", "thirty", "forty", "fifty", "sixty", "seventy", "eighty", "ninety"};
        return tens[digit];
    }
}