public class Main {
    public static void main(String[] args) {
        Input input = new Input();
        boolean isRunning = true;

        while (isRunning) {
            String purpose = input.getPurposeInput();
            switch (purpose) {
                case "1":
                    // Add a new item
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
