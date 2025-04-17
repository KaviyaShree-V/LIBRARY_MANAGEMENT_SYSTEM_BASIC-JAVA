# Library Management System

## Overview
The **Library Management System** is a Java-based application designed for managing library operations. It facilitates both user and librarian functionalities such as logging in, searching for books, borrowing books, viewing books, adding/removing books, and adding/removing students or librarians.

This system is intended to provide a simple interface for managing and interacting with the library's books and users in a console environment.

## Features

### For Users:
- **Login**: Users can log in with their name and ID.
- **Search Books**: Users can search for books by name or author.
- **View Books**: Users can view all available books in the library.
- **Borrow Books**: Users can borrow books by providing their details and selecting the number of books.
- **Return/Renew Books**: After borrowing, users must return or renew the books within a set period.

### For Librarians:
- **Login**: Librarians can log in with their name and ID.
- **Add/Remove Books**: Librarians can add new books to the library or remove unwanted/old books.
- **Add/Remove Students or Librarians**: Librarians can manage user records by adding or removing students and other librarians.

## Technologies Used
- Java (JDK 8 or above)
- Object-Oriented Programming (OOP)

## Class Descriptions

### 1. **CommonActions**:
   - Manages user and librarian actions related to book borrowing and searching.
   - Key Methods:
     - `login()`: Allows users to log in with their name and ID.
     - `searchBooks()`: Allows users to search for books by their name.
     - `borrowBooks()`: Handles the borrowing process by taking user details.
     - `viewAllBooks()`: Displays all books in the library.
     - `viewBooks()`: Allows users to search for and view specific books.

### 2. **LibrarianActions**:
   - Manages librarian-specific actions, including adding/removing books, managing users (students/librarians), and handling login for librarians.
   - Key Methods:
     - `librarianLogin()`: Allows librarians to log in.
     - `addBooks()`: Adds new books to the library.
     - `removeBooks()`: Removes books from the library.
     - `addStudents()`: Adds students to the system.
     - `addLibrarians()`: Adds new librarians to the system.

### 3. **Library**:
   - Contains data about the available books and users.
   - Manages the collection of books and users in the system.
   - Key Methods:
     - `getBook()`: Returns the list of books in the library.
     - `getDetails()`: Returns the list of user or librarian details.

### 4. **Book**:
   - Represents a book in the library.
   - Attributes:
     - `name`: Name of the book.
     - `author`: Author of the book.
     - `isbn`: ISBN number of the book.
     - `edition`:
