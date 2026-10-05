import java.util.Scanner;

public class Input {
    Scanner myScanner = new Scanner(System.in);
    public String getPurpose() {
        System.out.print("Input the following numbers to: \n [1] Add a new item \n [2] Remove an item \n [3] Search for an item \n [4] Display all items \n [5] Exit the program \n");
        String userInput = myScanner.nextLine();
        return userInput;
    }
    public String getBookTitle() {
        System.out.print("Input the title of the book: ");
        String userInput = myScanner.nextLine();
        return userInput;
    }
    public String getBookAuthor() {
        System.out.print("Input the author of the book: ");
        String userInput = myScanner.nextLine();
        return userInput;
    }
    public int getBookYear() {
        System.out.print("Input the year of the book: ");
        String userInput = myScanner.nextLine();
        return Integer.parseInt(userInput);
    }
    public Book getBookInfo() {
        String title = getBookTitle();
        String author = getBookAuthor();
        int year = getBookYear();
        return new Book(title, author, year);
    }
    public int SearchType() {
        System.out.print("Input the following numbers to search by: \n [1] Title \n [2] Author \n [3] Year \n");
        String userInput = myScanner.nextLine();
        return Integer.parseInt(userInput);
    }

}
