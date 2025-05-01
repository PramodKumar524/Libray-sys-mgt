

import java.util.Scanner;

public class LibraryManagementSystem {
    public static void main(String[] args) {
        Library library = new Library();
        Scanner sc = new Scanner(System.in);
        int choice = 0;

        while (choice != 5) {
            System.out.println("\n--- Library Menu ---");
            System.out.println("1. Add Book");
            System.out.println("2. Display Books");
            System.out.println("3. Issue Book");
            System.out.println("4. Return Book");
            System.out.println("5. Exit");
            System.out.print("Choice: ");
            
            String input = sc.nextLine();
            if (input.matches("[1-5]")) {
                choice = Integer.parseInt(input);
            } else {
                System.out.println("Invalid input. Enter a number between 1-5.");
                continue;
            }

            switch (choice) {
                case 1:
                    System.out.print("Enter Book Title: ");
                    String title = sc.nextLine();
                    System.out.print("Enter Author Name: ");
                    String author = sc.nextLine();
                    library.addBook(title, author);
                    break;
                case 2:
                    library.showBooks();
                    break;class Student {
                        private String name;
                        private String id;

                        public Student(String name, String id) {
                            this.name = name;
                            this.id = id;
                        }

                        public String getDetails() {
                            return "Issued by " + name + " (ID: " + id + ")";
                        }
                    }
                case 3:
                    System.out.print("Enter Book Title to Issue: ");
                    String issueTitle = sc.nextLine();
                    System.out.print("Enter Student Name: ");
                    String studentName = sc.nextLine();
                    System.out.print("Enter Student ID: ");
                    String studentId = sc.nextLine();
                    Student student = new Student(studentName, studentId);
                    library.issueBook(issueTitle, student);
                    break;
                case 4:
                    System.out.print("Enter Book Title to Return: ");
                    String returnTitle = sc.nextLine();
                    library.returnBook(returnTitle);
                    break;
                case 5:
                    System.out.println("Thank you for using the Library Management System!");
                    break;
            }
        }

       
    }
}
