/*
this sample code is used to check the prime no for given integer
Written by-Prasoon Mishra
Dated- 16/09/2025
*/

import java.util.*;
public class checkPrime {
    public static void main(String[] args) {
        if(prime()){
            System.out.println("Entered integer is a Prime no ");
        }
        else{
                System.out.println("Enter integer isn't a Prime no");
        }
    }
    public static boolean prime(){
        Scanner xy = new Scanner(System.in);
        System.out.print("Enter a integer : ");
        int n=xy.nextInt();
        xy.close();
        for (int i=2;i<n;i++){
        if (n%i==0){
            return false;
        }
    }

        return true;
    }
    
}
