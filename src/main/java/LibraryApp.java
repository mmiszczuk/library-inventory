public class LibraryApp {
    Input input = new Input();
    boolean isRunning = true;

    // Main loop of the program
    public void run() {
        while (isRunning) {
            String purpose = input.getPurpose();
            switch (purpose) {
                case "1":
                    // Manage books
                    String choice = input.getChoiceBooks();
                    switch (choice) {
                        case "1":
                            // Add a new book
                            FileManager.store(input.getBookInfo());
                            break;
                        case "2":
                            // Remove an item
                            FileManager.removeBook(input.getBookId());
                            break;
                        case "3":
                            // Search for an item
                            System.out.println("Search results:\n" + FileManager.searchBooks());
                            break;
                        case "4":
                            // Borrow a book
                            FileManager.borrowBook(input.borrowPromptBook(), input.borrowPromptMember());
                            break;
                        case "5":
                            // Return a book
                            FileManager.returnBook(input.getBookId());
                            break;
                        case "6":
                            // Display all items
                            System.out.println("All items in the library:\n \n" + FileManager.readBooks());
                            break;
                        default:
                            // Invalid input
                            System.out.println("Invalid input. Please try again.");
                    }
                    break;
                case "2":
                    // Manage members
                    String Choice = input.getChoiceMembers();
                    switch (Choice) {
                        case "1":
                            // Add a new member
                            FileManager.store(input.getMemberInfo());
                            break;
                        case "2":
                            // Remove a member
                            FileManager.removeMember(input.getMemberName());
                            break;
                        case "3":
                            // Search for a member
                            System.out.println("Search results:\n" + FileManager.searchMembers());
                            break;
                        case "4":
                            // Display all members
                            System.out.println("All members in the library:\n \n" + FileManager.readMembers());
                            break;
                        default:
                            // Invalid input
                            System.out.println("Invalid input. Please try again.");
                    }
                    break;
                case "3":
                    // Exit the program
                    isRunning = false;
                    System.out.println("Exiting the program.");
                    break;
                default:
                    System.out.println("Invalid input. Please try again.");
            }



        }
    }
}
