package com;

public class Main {
    public static void main(String[] args) {
        System.out.println(null instanceof Book);
//        Book x = new Book("one");
//        Book y = new Book("one");
//        Book z = new Book("one");
//
//        //reflexive
//        System.out.println("reflexive");
//        System.out.println(x.equals(x));
//        System.out.println("");
//        //symmetric
//        System.out.println("symmetric");
//        System.out.println(x.equals(y));
//        System.out.println(y.equals(x));
//        System.out.println("");
//        //transitive
//        System.out.println("transitive");
//        System.out.println(x.equals(y));
//        System.out.println(y.equals(z));
//        System.out.println(x.equals(z));
//        System.out.println("");
//        //consistent
//        System.out.println("consistent");
//        System.out.println(x.equals(y));
//        System.out.println(x.equals(y));
//        System.out.println(x.equals(y));
//        System.out.println(x.equals(y));
//        System.out.println(x.equals(y));
//        System.out.println("");
//        //not null
//        System.out.println("not null");
//        System.out.println(x.equals(null));//false
//        System.out.println("");
    }
}

class Book {
    String title;

    public Book(String title) {
        this.title = title;
    }

    @Override
    public boolean equals(Object object) {
        if (object instanceof Book) {
            return object != null && this.title.equals(((Book) object).title);
        }
        return false;
    }



   /* @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;

        Book book = (Book) object;

        return title != null ? title.equals(book.title) : book.title == null;
    }*/

}