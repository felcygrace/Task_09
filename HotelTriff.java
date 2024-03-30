package Task_09;

import java.util.Scanner;

public class HotelTriff {
    int num_of_month;
    float room_rent;
    int num_of_days;
    float total;
    public void getUserInput(){
        //getting user inputs
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter number of the Month: "); 
        num_of_month = sc.nextInt();
        System.out.println("Please enter room rent per day: ");
        room_rent = sc.nextFloat();
        System.out.println("Please enter number of days stayed in Hotel: ");
        num_of_days = sc.nextInt();
        sc.close();

    }
    public void hotelTriffCalculation(){
        
        switch (num_of_month) {
            //cases for peak seasons
            case 4:
            case 5:
            case 6:
            case 11:
            case 12:
            total=(float) ((room_rent*num_of_days) + (0.2*( room_rent*num_of_days)));
            System.out.printf("%.2f", total);
                break;
            // default case for non peak seasons
            default:
            total= room_rent*num_of_days;
            System.out.printf("%.2f", total);
                break;
        }
       
       
    }
    public static void main(String[] args) {
        HotelTriff hotelTriff = new HotelTriff();
        hotelTriff.getUserInput();
        hotelTriff.hotelTriffCalculation();
    }
    
} 
