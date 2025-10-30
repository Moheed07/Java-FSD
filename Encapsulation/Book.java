class Book {
    String title;
    int pages;
    
    //Standard constructor
    public Book(String title, int pages) {
        this.title = title;
        this.pages = pages;
    }

    //Copy constructor
    public Book(Book another) {
        this.title = another.title;
        this.pages = another.pages;
    }

    public void display() {
        System.out.println("Book: " + title + ", Pages: " + pages);
    }
}
