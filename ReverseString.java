package Task_09;

import java.util.Scanner;

public class ReverseString {
    //decalre a empty string
    String string="";
    public void getUserInput(){
        //get user input using Scanner
        System.out.print("Please enter the input String: ");
        Scanner sc = new Scanner(System.in);
        string = sc.nextLine();
        sc.close();
    }
    public void reverseOperation(String string){
        //Store the string in char array
       char sr[] = string.toCharArray();
       int start =0;
       int last = sr.length-1;
       // swap the letters 
       while(start<last){
         char temp = sr[start];
         sr[start]=sr[last];
         sr[last]=temp;
         start ++;
         last--;

       }
       System.out.print("The reversed string is :"+ new String(sr));

    }

    public static void main(String[] args) {
        ReverseString reversestring = new ReverseString();
        reversestring.getUserInput();
        reversestring.reverseOperation(reversestring.string);
    }
}
