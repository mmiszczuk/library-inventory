import java.util.Scanner;

public class Input {
    Scanner myScanner = new Scanner(System.in);
    // Get the purpose of the program from the user
    public String getChoiceBooks() {
        System.out.print("Input the following numbers to: \n [1] Add a new item \n [2] Remove an item \n [3] Search for an item \n [4] Borrow a book \n [5] Return a book \n [6] Display all items \n");
        String userInput = myScanner.nextLine();
        return userInput;
    }
    // Get the purpose of the program from the user
    public String getChoiceMembers() {
        System.out.print("Input the following numbers to: \n [1] Add a new member \n [2] Remove a member \n [3] Search for a member \n [4] Display all members \n");
        String userInput = myScanner.nextLine();
        return userInput;
    }
    // Get the purpose of the program from the user
    public String getPurpose() {
        System.out.print("Input the following numbers to: \n [1] Manage books \n [2] Manage members \n [3] Exit the program \n");
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
    public int getBookId() {
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
    // Get the ID of the member from the user
    public int getMemberId() {
        System.out.print("Input the ID of the member: ");
        String userInput = myScanner.nextLine();
        return Integer.parseInt(userInput);
    }
    // Get member information from the user and return a Member object
    public Member getMemberInfo() {
        String name = getMemberName();
        int phoneNumber = getMemberPhoneNumber();
        return new Member(name, phoneNumber);
    }
    public int borrowPromptBook() {
        boolean continuePrompt = true;
        while (continuePrompt) {
            System.out.print("Do you know the ID of the book you want to borrow? [y/n]: ");
            String userInput = myScanner.nextLine();
            if (userInput.equalsIgnoreCase("y")) {
                return getBookId();
            } else if (userInput.equalsIgnoreCase("n")) {
                try {
                    System.out.println("Search results:\n" + FileManager.searchBooks());
                    return getBookId();
                } catch (Exception e) {
                    System.out.println(e.getMessage());
                }
            } else {
                System.out.println("Invalid input. Please try again.");
            }
        }
        return -1;
    }
    public int borrowPromptMember() {
        boolean continuePrompt = true;
        while (continuePrompt) {
            System.out.print("Do you know the ID of the member who wants to borrow the book? [y/n]: ");
            String userInput = myScanner.nextLine();
            if (userInput.equalsIgnoreCase("y")) {
                return getMemberId();
            } else if (userInput.equalsIgnoreCase("n")) {
                try {
                    System.out.println("Search results:\n" + FileManager.searchMembers());
                    return getMemberId();
                } catch (Exception e) {
                    System.out.println(e.getMessage());
                }
            } else {
                System.out.println("Invalid input. Please try again.");
            }
        }
        return -1;
    }

}
