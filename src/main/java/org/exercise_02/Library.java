package org.exercise_02;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Library {
    private List<Book> books;
    private List<Member> members;
    private List<Loan> loans;

    public Library() {
        this.books = new ArrayList<>();
        this.members = new ArrayList<>();
        this.loans = new ArrayList<>();
    }

    public void addBook(Book book) {
        books.add(book);
    }

    public void registerMember(Member member) {
        member.add(member);
    }

    public void issueLoan(String book, String member, Date dueDate) {
        if (book.contains(book) && member.contains(member)) {
            Loan loan = new Loan(book, member, dueDate);
            loans.add(loan);
            System.out.println("Loan issued for " + book.getBookInfo() + " to " + member);
        } else {
            System.out.println("Invalid book or member");
        }
    }
}
