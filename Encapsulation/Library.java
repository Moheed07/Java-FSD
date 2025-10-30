public class Library {
    public static void main(String[] args) {
        Book originalBook = new Book("Java Fundamentals", 300);
        originalBook.display();

        Book copiedBook = new Book(originalBook);
        copiedBook.display();

        //Changing the copied book
        copiedBook.pages = 350;

        System.out.println("After modifying the copied book:");
        copiedBook.display();
        originalBook.display(); // Original book remains unchanged
    }
}
