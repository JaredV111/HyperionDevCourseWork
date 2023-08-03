package Task3;
import java.util.Scanner;

public class SumElemants {
    public static void main(String args[]) {
    int [][] userArray = new int[4][3];
            
    for(int i = 0; i < 4; i++) { 
        for(int j = 0; j < 3; j++) { 
        System.out.println("Please enter a number");
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        userArray[i][j]= a;
           }
        }
    for(int i = 0; i < 4; i++) { 
        for(int j = 0; j < 3; j++) { 
            System.out.print(userArray[i][j] + " "); 
        } 
            System.out.println(); 
      
    } 
    int sum1 = userArray[0][0]+userArray[1][0]+userArray[2][0]+userArray[3][0];
    int sum2 = userArray[0][1]+userArray[1][1]+userArray[2][1]+userArray[3][1];
    int sum3 = userArray[0][2]+userArray[1][2]+userArray[2][2]+userArray[3][2];
        
    System.out.println("Sum for Column1 = "+(sum1));
    System.out.println("Sum for Column2 = "+(sum2));
    System.out.println("Sum for Column3 = "+(sum3));

    }
 
  
}

	
