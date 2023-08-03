package Task14;

import java.util.Scanner;
import java.util.Formatter;
import java.io.File;
import java.io.FileNotFoundException;
import java.nio.file.FileAlreadyExistsException;
import java.util.Arrays;

public class MyFile {
  public static void main(String[] args) {
    System.out.println("It wrote to the output file");
    
    	try {
            //File, Scanner, and Formatter for file input and output
            File inputFile = new File("C:\\Users\\ASUS\\Dropbox\\Jared Valensky-45735\\Introduction to Software Engineering\\Task 14\\Task\\input.txt");
            Scanner fileScanner = new Scanner(inputFile);
            Formatter fileFormatter = new Formatter("C:\\Users\\ASUS\\Dropbox\\Jared Valensky-45735\\Introduction to Software Engineering\\Task 14\\Task\\output.txt");
             
            //String for storing and manipulating each line of the file
            String lineContents;
            //String for storing the operation of the line
            String operation;
            //Int array for storing the numbers of the line, double for storing operation result
            int[] numbers;
            double result;
             
            while (fileScanner.hasNext()){
                //Gets next line, stores operation type and removes from line
                lineContents = fileScanner.nextLine();
                operation = lineContents.split(":")[0].toLowerCase();
                System.out.println(lineContents);
                lineContents = lineContents.split(": ")[1];
                 
                //Fills int[] with contents of the line
                numbers = new int[lineContents.split(",").length];
                for(int i = 0 ; i < lineContents.split(",").length ; i++){
                    numbers[i] = Integer.parseInt(lineContents.split(",")[i]);
                }
                 
                //Performs the calculation for the line
                if(operation.equals("min")) {
                    result = min(numbers);
                } else if(operation.equals("max")) {
                    result = max(numbers);
                } else if(operation.equals("avg")) {
                    result = avg(numbers);
                } else if(operation.equals("sum")) {
                    result = sum(numbers);
                } else {
                    int percentile = Integer.parseInt(operation.toLowerCase().split("p")[1]);
                    operation = percentile+"th percentile";
                    result = px(numbers, percentile);
                }
 
 
                //Prints the result of the calculation
                fileFormatter.format("The %s of %s is %s.\r\n", operation, Arrays.toString(numbers), result);
            }
             
            fileScanner.close();
            fileFormatter.close();
        } catch (FileNotFoundException e) {
            System.out.println("File not found.");
        }
  }
   //Calculates the minimum of a list of integers
    public static int min(int[] numbers) {
        int result = numbers[0];
        for (int num : numbers) {
            if(num<result) {
                result = num;
            }
        }
        return result;
    }
     
    //Calculates the maximum of a list of integers
    public static int max(int[] numbers) {
        int result = numbers[0];
        for (int num : numbers) {
            if(num>result) {
                result = num;
            }
        }
        return result;
    }
     
    //Calculates the average of a list of integers
    public static double avg(int[] numbers) {
        double sum = 0;
        for (int num : numbers) {
            sum += num;
        }
        return sum / numbers.length;
    }
     
    //Calculates the sum of a list of integers
    public static int sum(int[] numbers) {
        int sum = 0;
        for (int num : numbers) {
            sum += num;
        }
        return sum;
    }
     
    //Calculates the xth percentile of a list of integers
    public static int px(int[] numbers, int percentile) {
        int result = numbers[0];
        for (int n = 0; n < numbers.length ; n++) {
            if(result<numbers[n] && ((double)(n+1)/numbers.length*100 <= percentile )) {
                result = numbers[n];
            }
        }
        return result;
    }
}