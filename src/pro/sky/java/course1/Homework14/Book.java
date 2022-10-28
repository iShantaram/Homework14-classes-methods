package pro.sky.java.course1.Homework14;

import java.util.Objects;

public class Book {
    private final String name;
    private final Author author;
    private int yearOfPublishing;
    Book(String name, Author author, int yearOfPublishing) {
        this.name = name;
        this.author = author;
        this.yearOfPublishing = yearOfPublishing;
    }
    Book(String name, Author author) {
        this(name, author, 0);
    }
    @Override
    public String toString() {
        return "Книга " + this.getName() + ", автор " + this.getAuthor() +
                ", год издания " + this.getYearOfPublishing();
    }
    /**
     * Книги считаются равными, если у них одно название и один автор, нам не важен год издания
     */
    @Override
    public boolean equals(Object obj) {
        if (getClass().equals(obj.getClass())) {
            return this.name.equals(((Book) obj).name) && this.author.equals(((Book) obj).author);
        } else return false;
    }
    @Override
    public int hashCode() {
        return Objects.hash(name, author, yearOfPublishing);
    }
    public String getName() {
        return "\"" + name + "\"";
    }
    public Author getAuthor() {
        return author;
    }
    public int getYearOfPublishing() {
        return yearOfPublishing;
    }
    public void setYearOfPublishing(int year) {
        this.yearOfPublishing = year;
    }
}
