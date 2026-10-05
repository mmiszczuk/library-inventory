import java.io.File;
import java.io.IOException;
import java.io.FileWriter;

public class FileManager {
    static private String fileName = "books.txt";
    public static void store(Book book) {
        makeFile();
        File file = new File(fileName);
        try {
            java.io.FileWriter writer = new java.io.FileWriter(file, true);
            writer.write(book.toString() + "\n");
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
    public static void makeFile() {
     // ensures that the file exists, if not creates it
        File file = new File(fileName);
        if (!file.exists()) {
            try {
                file.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
    public String read() {
        makeFile();
        StringBuilder content = new StringBuilder();

        Input input = new Input();
        int searchType = input.SearchType();
        switch (searchType) {
            case 1:
                // Search by title
                String title = input.getBookTitle();
                try {
                    java.util.Scanner scanner = new java.util.Scanner(new File(fileName));
                    while (scanner.hasNextLine()) {
                        String line = scanner.nextLine();
                        if (line.contains(title)) {
                            content.append(line).append("\n");
                        }
                    }
                    scanner.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
                return content.toString();
            case 2:
                // Search by author
                String author = input.getBookAuthor();
                try {
                    java.util.Scanner scanner = new java.util.Scanner(new File(fileName));
                    while (scanner.hasNextLine()) {
                        String line = scanner.nextLine();
                        if (line.contains(author)) {
                            content.append(line).append("\n");
                        }
                    }
                    scanner.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
                return content.toString();
            case 3:
                // Search by year
                int year = input.getBookYear();
                try {
                    java.util.Scanner scanner = new java.util.Scanner(new File(fileName));
                    while (scanner.hasNextLine()) {
                        String line = scanner.nextLine();
                        if (line.contains(String.valueOf(year))) {
                            content.append(line).append("\n");
                        }
                    }
                    scanner.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
                return content.toString();
            default:
                System.out.println("Invalid search type. Please try again.");


            }
        return content.toString();
    }
}
