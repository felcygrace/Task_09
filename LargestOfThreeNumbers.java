package Task_09;

import java.util.Scanner;

public class LargestOfThreeNumbers {
    int a, b, c;
    public void getUserInput(){
        //to get user input
        Scanner sc = new Scanner(System.in);
        a= sc.nextInt();
        b=sc.nextInt();
        c=sc.nextInt();
        sc.close();
    }
    public void largestNumber(int a2, int b2, int c2){
        //conditions to check the greatest number
        if(a2>b2 && a2>c2){
          System.out.print("The number a "+a2+" is the greatest number");
        }
        else if (b2>c2){
            System.out.print("The number b "+b2+" is the greatest number");
        }
        else{
            System.out.print("The number c "+c2+" is the greatest number");
        }

    }
    public static void main(String[] args) {
        LargestOfThreeNumbers largestofthreenumbers = new LargestOfThreeNumbers();
        largestofthreenumbers.getUserInput();
        largestofthreenumbers.largestNumber(largestofthreenumbers.a,largestofthreenumbers.b,largestofthreenumbers.c);
        
    }
    
}
