package Ej2;

public class Main {
    public static void main(String[] args) {
        Book book_1 = new Book("George Orwell", "1984", 1984, 11000);
        Book book_2 = new Book("Peter Thiel", "From Zero to One");
        Book book_3 = new Book();

        System.out.println("Book: " + book_1.toString());
        System.out.println("Book: " + book_2.toString());
        System.out.println("Book: " + book_3.toString());
    }
}
