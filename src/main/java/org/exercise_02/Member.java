package org.exercise_02;

import java.util.ArrayList;
import java.util.List;

public class Member {
    // 1. attributes with a list for books
    private String memberName;
    private List<Book> borrowedBooks;

    public Member(String memberName) {
        this.memberName = memberName;
        this.borrowedBooks = new ArrayList<>();
    }

    public void borrowBook(Book book) {
        if (book.isAvailable()) {
            borrowedBooks.add();
            book.setAvailable(false);

            System.out.println(memberName + " has borrewed: " + book.getBookInfo() + ".");
        } else {
            System.out.println("The book " + book.getBookInfo() + " is not available.");
        }

    }

    public void returnBook(Book book) {
        if (borrowedBooks.contains(book)) {
            borrowedBooks.remove(book);
            book.setAvailable(true);
            System.out.println(memberName + " has returned " + book.getBookInfo() + ".");
        } else {
            System.out.println(memberName + " did not borrow " + book.getBookInfo() + ".");
        }


    }

}




