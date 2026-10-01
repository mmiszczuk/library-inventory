public class LibraryApp {
    Input input = new Input();
    boolean isRunning = true;

    public void run() {
        while (isRunning) {
            String purpose = input.getPurpose();
            switch (purpose) {
                case "1":
                    // add a new book
                    FileManager.store(input.getBookInfo());
                    break;
                case "2":
                    // Remove an item
                    break;
                case "3":
                    // Search for an item
                    break;
                case "4":
                    // Display all items
                    break;
                case "5":
                    isRunning = false;
                    System.out.println("Exiting the program.");
                    break;
                default:
                    System.out.println("Invalid input. Please try again.");
            }
        }
    }
}
