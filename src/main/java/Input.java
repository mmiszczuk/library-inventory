import java.util.Scanner;

public class Input {
    Scanner myScanner = new Scanner(System.in);
    // Get the purpose of the program from the user
    public String getPurpose() {
        System.out.print("Input the following numbers to: \n [1] Add a new item \n [2] Remove an item \n [3] Search for an item \n [4] Display all items \n [5] Exit the program \n");
        String userInput = myScanner.nextLine();
        return userInput;
    }
    // Get book information from the user
    public String getBookTitle() {
        System.out.print("Input the title of the book: ");
        String userInput = myScanner.nextLine();
        return userInput;
    }
    // Get book information from the user
    public String getBookAuthor() {
        System.out.print("Input the author of the book: ");
        String userInput = myScanner.nextLine();
        return userInput;
    }
    // Get book information from the user
    public int getBookYear() {
        System.out.print("Input the year of the book: ");
        String userInput = myScanner.nextLine();
        return Integer.parseInt(userInput);
    }
    // Get book information from the user
    public int getBookID() {
        System.out.print("Input the ID of the book: ");
        String userInput = myScanner.nextLine();
        return Integer.parseInt(userInput);
    }
    // Get book information from the user and return a Book object
    public Book getBookInfo() {
        String title = getBookTitle();
        String author = getBookAuthor();
        int year = getBookYear();
        return new Book(title, author, year);
    }
    // Get the search type from the user
    public int getSearchType() {
        System.out.print("Input the following numbers to search by: \n [1] Title \n [2] Author \n [3] Year \n [4] ID \n");
        String userInput = myScanner.nextLine();
        return Integer.parseInt(userInput);
    }
    // Get the name of the member from the user
    public String getMemberName() {
        System.out.print("Input the name of the member: ");
        String userInput = myScanner.nextLine();
        return userInput;
    }
    // Get the phone number of the member from the user
    public int getMemberPhoneNumber() {
        System.out.print("Input the phone number of the member: ");
        String userInput = myScanner.nextLine();
        return Integer.parseInt(userInput);
        }

}
