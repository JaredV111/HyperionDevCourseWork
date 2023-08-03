package mytest;

import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

import com.sun.jdi.connect.spi.Connection;

public class Bookstore {

    public static void main(String[] args) {
        try(
                //Creating table connection and statement
                Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/bookshelf?useSSL=false","myuser","Valensky1@"); 

                Statement stmt = conn.createStatement();
                ){

            Scanner input = new Scanner(System.in);
            int selection = 0;

            //Menu for action selection and user input
            while(selection != 5) {
                System.out.println("Please enter the number corresponding to the action you would like to take:\n"
                        + "1. Enter book\n"
                        + "2. Update book\n"
                        + "3. Delete book\n"
                        + "4. Search books\n"
                        + "5. Exit");
                selection = input.nextInt();

                //Selection sorting
                if(selection == 1) {
                    //Collecting book information
                    System.out.println("Please enter the Title of the book you would like to put into the system: ");
                    String title = input.next();
                    System.out.println("Please enter the Author of said book: ");
                    String author = input.next();
                    System.out.println("Please enter the number of said book currently in stock: ");
                    int qty = input.nextInt();

                    //Sending info to the addBook method
                    addBook(title, author, qty, stmt);
                } else if(selection == 2) {
                    //Collecting book information
                    System.out.println("Please enter the id of the book you would like to update: ");
                    int id = input.nextInt();

                    //Sending info to the updateBook method
                    updateBook(id, stmt);
                } else if(selection == 3) {
                    //Collecting book information
                    System.out.print("Please enter the id of the book you would like to delete from the system: ");
                    int id = input.nextInt();

                    //Sending info to deleteBook method
                    deleteBook(id, stmt);
                } else if(selection == 4) {
                    searchStore(stmt);
                } else if(selection == 5) {
                    System.out.println("Goodbye");
                    input.close();
                } else { //Invalid entry handler
                    System.out.println("Sorry, that isn't a valid selection.");
                }
            }

        } catch(SQLException ex) {
            ex.printStackTrace();
        }
    }
}

}
