/*
Library Management System
Scenario -1
Design a simplified library system that manages different types of library items (books, magazines, and DVDs) and tracks how each item behaves when borrowed or returned. The system should be extensible so new item types can be added later without breaking existing code.
Requirements
•Create an abstract class LibraryItem with common attributes such as title, itemId, and isAvailable.
•LibraryItem should define an abstract method getLoanPeriod() since each item type has a different borrowing duration.
•Create subclasses Book, Magazine, and DVD that inherit from LibraryItem and implement getLoanPeriod() with their own values.
•Define an interface Borrowable with methods borrowItem() and returnItem().
•Only Book and DVD should implement Borrowable (Magazines are reference-only and cannot be borrowed).
•Create a Librarian class that can hold a list of LibraryItem objects and print details of all items.
OOP Concepts to Apply
•Abstraction - LibraryItem hides common structure, exposes only what subclasses must define.
•Inheritance - Book, Magazine, DVD extend LibraryItem.
•Interface - Borrowable defines a contract only some classes fulfill.
•Class & Object - Librarian manages multiple LibraryItem objects.
Deliverables
•Class diagram showing the hierarchy and interface relationship.
•Working code (any OOP language) demonstrating borrowing a Book and a DVD, and attempting (and rejecting) borrowing a Magazine. 
 */



abstract class LibraryItem {

    String title;
    int itemId;
    boolean isAvailable;

    LibraryItem(String title, int itemId) {
        this.title = title;
        this.itemId = itemId;
        isAvailable = true;
    }

    abstract int getLoanPeriod();

    void display() {
        System.out.println("Title: " + title);
        System.out.println("ID: " + itemId);
        System.out.println("Available: " + isAvailable);
        System.out.println("Loan Period: " + getLoanPeriod() + " days");
    }
}


interface Borrowable {

    void borrowItem();

    void returnItem();
}


class Book extends LibraryItem implements Borrowable {

    Book(String title, int itemId) {
        super(title, itemId);
    }

    int getLoanPeriod() {
        return 14;
    }

    public void borrowItem() {
        if (isAvailable) {
            isAvailable = false;
            System.out.println(title + " borrowed.");
        }
    }

    public void returnItem() {
        isAvailable = true;
        System.out.println(title + " returned.");
    }
}


class Magazine extends LibraryItem {

    Magazine(String title, int itemId) {
        super(title, itemId);
    }

    int getLoanPeriod() {
        return 0;
    }
}


class DVD extends LibraryItem implements Borrowable {

    DVD(String title, int itemId) {
        super(title, itemId);
    }

    int getLoanPeriod() {
        return 7;
    }

    public void borrowItem() {
        if (isAvailable) {
            isAvailable = false;
            System.out.println(title + " borrowed.");
        }
    }

    public void returnItem() {
        isAvailable = true;
        System.out.println(title + " returned.");
    }
}


class Librarian {

    void display(LibraryItem item) {
        item.display();
    }
}


public class Library {

    public static void main(String[] args) {

        Book b = new Book("Java Programming", 101);
        Magazine m = new Magazine("Tech Today", 102);
        DVD d = new DVD("Avengers", 103);

        Librarian l = new Librarian();

        l.display(b);
        System.out.println();

        l.display(m);
        System.out.println();

        l.display(d);
        System.out.println();


        System.out.println("Borrowing:");

        b.borrowItem();
        d.borrowItem();

        System.out.println();

        System.out.println("Magazine cannot be borrowed.");
        
        System.out.println();

        System.out.println("Returning:");

        b.returnItem();
        d.returnItem();
    }
}