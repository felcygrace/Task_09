package Task_09;

import java.util.Scanner;

public class Palindrome {
    String str ="";
    public void getScannerInput(){
        //get user input from user
        System.out.print("Enter a String");
        Scanner sc = new Scanner(System.in);
        str = sc.nextLine();
        sc.close();
    }
    public void palindromeString(String str){
        //initialize a empty string
        String reverse ="";
        str = str.toLowerCase();
        for ( int i = str.length() - 1; i >= 0; i-- )  
        reverse = reverse + str.charAt(i);  
        // Checking if the input string and the reversed string are equal
     if (str.equals(reverse))  
        System.out.println("Entered string is a palindrome.");  
     else  
        System.out.println("Entered string isn't a palindrome.");  
    }

    public static void main(String[] args) {
        //create a object to access non static methods
        Palindrome palindrome = new Palindrome();
        palindrome.getScannerInput();
        palindrome.palindromeString(palindrome.str);
        
    }
    
}
