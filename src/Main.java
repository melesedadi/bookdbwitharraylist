import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);
        ArrayList<ArrayListBookDB> booklist = new ArrayList<ArrayListBookDB>();
        System.out.println("Would you like to enter a new book?: ");
        String answer = keyboard.nextLine();

        //create a book from our object
//        while (answer.equalsIgnoreCase("y") || (answer.equalsIgnoreCase("yes"))) {
//            System.out.println(" Do you want to enter a new book?: ");
//            answer = keyboard.nextLine();
while (true){
            if (answer.equalsIgnoreCase("y") || (answer.equalsIgnoreCase("yes"))) {
                ArrayListBookDB book = new ArrayListBookDB();
                System.out.print("Enter the author:");
                book.setAuthor(keyboard.nextLine());
                System.out.print("Enter the title: ");
                book.setTitle(keyboard.nextLine());
                booklist.add(book);
                System.out.println("Enter SKU:");
                book.setSku(keyboard.nextLine());
                booklist.add(book);
                System.out.println(" Do you want to enter a new book?: ");
                answer = keyboard.nextLine();
            }
            else if (answer.equalsIgnoreCase("n") || (answer.equalsIgnoreCase("no"))) {
                System.out.println("Thanks you for entering books to database");
                            break;}
            else {
                System.out.println("You did not enter the right answer.");
                System.out.println(" Do you want to enter a new book?: ");
                answer = keyboard.nextLine();

            }
        }

        //print all the books in the array list
        System.out.println("All the books:");

        //enhanced for loop allows you to simplify code by with a for-loops
        //that visit each element of an array/collection easily (without using indexes)
        //Example: https://blogs.oracle.com/corejavatechtips/using-enhanced-for-loops-with-your-classes
        for (ArrayListBookDB book : booklist) {
            System.out.print(book.getAuthor());
            System.out.println();
            System.out.print(book.getTitle());
            System.out.println();
            System.out.print(book.getsku());
            System.out.println();
        }

    }
}