import java.util.Scanner;

public class Input {
    Scanner myScanner = new Scanner(System.in);
    public String getPurposeInput() {
        System.out.print("Input the following numbers to: \n [1] Add a new item \n [2] Remove an item \n [3] Search for an item \n [4] Display all items \n [5] Exit the program \n");
        String userInput = myScanner.nextLine();
        return userInput;
    }

}
