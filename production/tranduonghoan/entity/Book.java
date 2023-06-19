package entity;

import statics.Specialization;

public class Book {
    private static int AUTO_ID = 10000;
    private int id;
    private String name;
    private String author;
    private Specialization specialization;
    private String localTimeBook;

    public Book() {
        this.id = AUTO_ID;
        AUTO_ID++;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public Specialization getSpecialization() {
        return specialization;
    }

    public void setSpecialization(Specialization specialization) {
        this.specialization = specialization;
    }

    public String getLocalTimeBook() {
        return localTimeBook;
    }

    public void setLocalTimeBook(String localTimeBook) {
        this.localTimeBook = localTimeBook;
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", author='" + author + '\'' +
                ", specialization=" + specialization +
                ", localTimeBook='" + localTimeBook + '\'' +
                '}';
    }
}
