package Ej2;

public class Book {
    String author;
    String title;
    int publish_year;
    int price;

    public Book(String author, String title, int publish_year, int price) {
        this.author = author;
        this.title = title;
        this.publish_year = publish_year;
        this.price = price;
    }

    public Book(String author, String title) {
        this.author = author;
        this.title = title;
        this.publish_year = 2000;
        this.price = 9999;
    }

    public Book() {
        this.author = "Unknown";
        this.title = "Unknown";
        this.publish_year = 9999;
        this.price = 9999;
    }

    @Override
    public String toString() {
        return "Book{" +
                "author='" + author + '\'' +
                ", title='" + title + '\'' +
                ", publish_year=" + publish_year +
                ", price=" + price +
                '}';
    }
}
