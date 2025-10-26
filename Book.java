package library;

public class Book {
    private Title title;
    private Author author;
    private Availability availability;
    private Price price;

    public Book(Title title, Author author, Availability availability, Price price) {
        this.title = title;
        this.author = author;
        this.availability = availability;
        this.price = price;
    }

    public void displayBookDetails() {
        System.out.println("Title     : " + title.getName());
        System.out.println("Author    : " + author.getAuthorName());
        System.out.println("Available : " + (availability.isAvailable() ? "Yes" : "No"));
        System.out.println("Price     : ₹" + price.getAmount());
        System.out.println("-----------------------------------");
    }
}
