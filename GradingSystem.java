package Task_09;


import java.util.Scanner;

public class GradingSystem {
    int marks;
    public void getUserInput(){
        //getting input from user 
        Scanner sc = new Scanner(System.in);
        marks =sc.nextInt();
        sc.close();

    }
    public void gradsBasedOnMarks(){

        //using if statement and generating grade based on input

        if(marks ==100){
            System.out.print("S");
        }
        else if(marks >=90 && marks<=99){
            System.out.print("A");
        }
        else if(marks >=80 && marks<=89){
            System.out.print("B");
        }
        else if(marks >=70 && marks<=79){
            System.out.print("C");
        }
        else if(marks >=60 && marks<=69){
            System.out.print("D");
        }
        else if(marks >=50 && marks<=59){
            System.out.print("E");
        }
        else if(marks <50){
            System.out.print("F");
        }
        else{
            System.out.print("Invalid Input");
        }
        }

    public static void main(String[] args) {
        GradingSystem gradingSystem = new GradingSystem();
        gradingSystem.getUserInput();
        gradingSystem.gradsBasedOnMarks();

    }


}
