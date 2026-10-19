import java.io.File;
import java.io.IOException;

public class FileManager {
    private static String booksFileName = "books.txt";
    private static String membersFileName = "members.txt";

    // Store a book in the file with an index number
    public static void store(Book book) {
        makeFile(booksFileName);
        int nextIndex = getLineCount(booksFileName) + 1;
        File file = new File(booksFileName);
        try {
            java.io.FileWriter writer = new java.io.FileWriter(file, true);
            writer.write(nextIndex + ", " + book.toString() + "\n");
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void store(Member member) {
        makeFile(membersFileName);
        int nextIndex = getLineCount(membersFileName) + 1;
        File file = new File(membersFileName);
        try {
            java.io.FileWriter writer = new java.io.FileWriter(file, true);
            writer.write(nextIndex + ", " + member.getName() + ", " + member.getPhoneNumber() + "\n");
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    // Get the number of lines in the file
    public static int getLineCount(String fileName) {
        makeFile(fileName);
        int lines = 0;
        try {
            java.util.Scanner scanner = new java.util.Scanner(new File(fileName));
            while (scanner.hasNextLine()) {
                scanner.nextLine();
                lines++;
            }
            scanner.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return lines;
    }

    // Create the file if it doesn't exist
    public static void makeFile(String fileName) {
        File file = new File(fileName);
        if (!file.exists()) {
            try {
                file.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
    // Search for a book in the file based on user input and return the results as a string
    public static String searchBooks() {
        makeFile(booksFileName);
        StringBuilder content = new StringBuilder();

        Input input = new Input();
        int searchType = input.getSearchType();
        switch (searchType) {
            case 1:
                // Search by title
                String title = input.getBookTitle();
                try {
                    java.util.Scanner scanner = new java.util.Scanner(new File(booksFileName));
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
                    java.util.Scanner scanner = new java.util.Scanner(new File(booksFileName));
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
                    java.util.Scanner scanner = new java.util.Scanner(new File(booksFileName));
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
            case 4:
                // Search by ID
                int id = input.getBookID();
                try {
                    java.util.Scanner scanner = new java.util.Scanner(new File(booksFileName));
                    while (scanner.hasNextLine()) {
                        String line = scanner.nextLine();
                        if (line.startsWith(String.valueOf(id) + ",")) {
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
    // Read the contents of the books file and return it as a string
    public static String readBooks() {
        String allBooks = "";
        makeFile(booksFileName);
        try {
            java.util.Scanner scanner = new java.util.Scanner(new File(booksFileName));
            while (scanner.hasNextLine()) {
                allBooks += scanner.nextLine() + "\n";
            }
            scanner.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return allBooks;
    }
    // Remove a book from the file based on its ID
    public static void removeBook(int id) {
        makeFile(booksFileName);
        StringBuilder content = new StringBuilder();
        int newIndex = 1;
        try {
            java.util.Scanner scanner = new java.util.Scanner(new File(booksFileName));
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                if (!line.startsWith(String.valueOf(id) + ",")) {
                    // Get everything starting from the first comma: ", Title, Author, Year"
                    String restOfLine = line.substring(line.indexOf(","));
                    content.append(newIndex).append(restOfLine).append("\n");
                    newIndex++;
                }
            }
            scanner.close();
            java.io.FileWriter writer = new java.io.FileWriter(new File(booksFileName));
            writer.write(content.toString());
            writer.close();
            System.out.println("Book #" + id + " removed successfully.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static void removeMember(String name) {
        makeFile(membersFileName);
        StringBuilder content = new StringBuilder();
        int newIndex = 1;
        try {
            java.util.Scanner scanner = new java.util.Scanner(new File(membersFileName));
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                if (!line.contains(name)) {
                    // Get everything starting from the first comma: ", Name, PhoneNumber"
                    String restOfLine = line.substring(line.indexOf(","));
                    content.append(newIndex).append(restOfLine).append("\n");
                    newIndex++;
                }
            }
            scanner.close();
            java.io.FileWriter writer = new java.io.FileWriter(new File(membersFileName));
            writer.write(content.toString());
            writer.close();
            System.out.println("Member " + name + " removed successfully.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static String searchMembers() {
        makeFile(membersFileName);
        StringBuilder content = new StringBuilder();

        Input input = new Input();
        System.out.print("Input the name of the member: ");
        String name = input.myScanner.nextLine();
        try {
            java.util.Scanner scanner = new java.util.Scanner(new File(membersFileName));
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                if (line.contains(name)) {
                    content.append(line).append("\n");
                }
            }
            scanner.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return content.toString();
    }
    public static String readMembers() {
        String allMembers = "";
        makeFile(membersFileName);
        try {
            java.util.Scanner scanner = new java.util.Scanner(new File(membersFileName));
            while (scanner.hasNextLine()) {
                allMembers += scanner.nextLine() + "\n";
            }
            scanner.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return allMembers;
    }
}
