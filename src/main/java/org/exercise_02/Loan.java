package org.exercise_02;
import java.util.Date;

// attriubutes
public class Loan {
private String book;
private String member;
private Date dueDate;

// methods
    public Loan(String book, String Member, Date dueDate){
        this.book = book;
        this.member = member;
        this.dueDate = dueDate;
    }
    public Date getDueDate(){
        return dueDate;
    }
}
