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
}
