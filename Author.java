public class LibraryManagementSystem {

    public static void main(String[] args) {

        Book book1 = new Book(
                new Title("Java Programming"),
                new Author("John Doe"),
                new Availability(true),
                new Price(450)
        );

        Book book2 = new Book(
                new Title("Data Structures"),
                new Author("Mark Smith"),
                new Availability(false),
                new Price(550)
        );

        book1.displayBookDetails();
        book2.displayBookDetails();
    }
}
