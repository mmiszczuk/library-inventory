import java.io.File;

public class LibraryApp {
    Input input = new Input();
    boolean isRunning = true;

    // Main loop of the program
    public void run() {
        while (isRunning) {
            String purpose = input.getPurpose();
            switch (purpose) {
                case "1":
                    // Add a new book
                    FileManager.store(input.getBookInfo());
                    break;
                case "2":
                    // Remove an item
                    FileManager.removeBook(input.getBookID());
                    break;
                case "3":
                    // Search for an item
                    System.out.println("Search results:\n" + FileManager.searchBooks());
                    break;
                case "4":
                    // Display all items
                    System.out.println("All items in the library:\n \n" + FileManager.readBooks());
                    break;
                case "5":
                    // Exit the program
                    isRunning = false;
                    System.out.println("Exiting the program.");
                    break;
                default:
                    // Invalid input
                    System.out.println("Invalid input. Please try again.");
            }
        }
    }
}
