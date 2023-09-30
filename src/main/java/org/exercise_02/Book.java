package org.exercise_02;

public class Book {
    //1. create Attributes
    private String title;
    private String author;
    private Long ISBN;

    // 2. Create method book
    public Book (String t, String a, Long i){
        // 3. estabelecer parametros para os atributos. Usar "this".
        this.title = t;
        this.author = a;
        this.ISBN = i;
    }

    // 3. criar getter metodo para imprimir os info (sobre o produto)

public void getBookInfo(){
    System.out.println("Title: " + title);
    System.out.println("Author: " + author);
    System.out.println("ISBN: " + ISBN);
}

    // 4. create metodo para saber se o livro está disponível.

}
