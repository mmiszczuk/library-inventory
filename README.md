# Library Inventory

A simple Java console application for managing library inventory.

## Project Structure

```text
Library-inventory/
├── .gitignore
├── pom.xml
├── README.md
├── sample_books.txt               # Sample dataset of 50 books
├── sample_members.txt             # Sample dataset of 10 library members
└── src/
    └── main/
        └── java/
            ├── Book.java          # Represents a book with title, author, and year
            ├── FileManager.java   # Handles file I/O (storing, reading, searching, and removing)
            ├── Input.java         # Handles user input and CLI menu prompts
            ├── LibraryApp.java    # Manages application menu loop and user actions
            ├── Main.java          # Application entry point
            └── Member.java        # Represents library members with name and ID
```

## Features

- **Add a Book:** Prompts for title, author, and publication year, and saves the book with an auto-incrementing ID to `books.txt`.
- **Remove a Book:** Removes a book by its ID and automatically re-indexes the remaining books so there are no gaps.
- **Search Books:** Search the inventory by Title, Author, Year, or ID.
- **Display All Books:** Lists all books currently stored in the library inventory.
- **Sample Data:** Includes `sample_books.txt` (50 books) and `sample_members.txt` (10 members) to easily populate `books.txt` and `members.txt`.

## Current Status

This is my first Java project and I'm slowly learning through this project.
