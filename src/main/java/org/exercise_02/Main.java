package org.exercise_02;

import java.util.Date;

public class Main {
    public static void main(String[] args) {

        Book book1 = new Book("Book 1 ", "Author 1 ", "ISBN1" );
        Book book2 = new Book("Book 2 ", "Author 2 ", "ISBN2" );

        Member member1 = new Member("Priscilla");

        Library library = new Library();


        library.addBook(book1);
        library.addBook(book2);

        library.registerMember(member1);

        member1.borrowBook(book1);
        member1.borrowBook(book2);

        member1.returnBook(book1);

        library.issueLoan(book2, member1, new Date());


    }
}
