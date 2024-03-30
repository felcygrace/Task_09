package Task_09;


public class StarPattern2 {

    public static void main(String[] args) {
        //Initiate a 2D Array
        String arr[][] = new String[5][5];
        //set size to zero
        int size =5;
        //for loop to print "*""
        for(int i=0;i<size;i++){
            for(int j=0;j<size;j++){
                if(i==j || i+j==size-1){
                    arr[i][j]="*";
                    System.out.print(arr[i][j]+"");
                }
                   
                else{
                    arr[i][j]=" ";
                    System.out.print(arr[i][j]+"");
                }
                

            
            }
            System.out.println(" ");
        }
    }
    
}
