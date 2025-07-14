package LIBRARY_MANAGEMENT;

class Book {
    private String title;
    private String author;
    private boolean isIssued;
    private Student issuedTo; 

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
        this.isIssued = false;
        this.issuedTo = null;
    }

    public String getTitle() {
        return title;
    }

    public boolean isIssued() {
        return isIssued;
    }

    public void issue(Student student) {
        isIssued = true;
        issuedTo = student;
    }

    public void returnBook() {
        isIssued = false;
        issuedTo = null;
    }

    @Override
    public String toString() {
        if (isIssued) {
            return title + " by " + author + " (Issued) - " + issuedTo.getDetails();
        }
        return title + " by " + author + " (Available)";
    }
}
