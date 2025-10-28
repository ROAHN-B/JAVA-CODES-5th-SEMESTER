class Media {
    protected String title;

    public Media(String title) {
        this.title = title;
    }

    public void displayDetails() {
        System.out.println("Title: " + title);
    }
}

class Book extends Media {
    private String author;

    public Book(String title, String author) {
        super(title);
        this.author = author;
    }

    @Override
    public void displayDetails() {
        System.out.println("Book Title: " + title);
        System.out.println("Author: " + author);
    }
}

class Movie extends Media {
    private String director;

    public Movie(String title, String director) {
        super(title);
        this.director = director;
    }

    @Override
    public void displayDetails() {
        System.out.println("Movie Title: " + title);
        System.out.println("Director: " + director);
    }
}

public class PolymorphismDemo {
    public static void main(String[] args) {
        
        Media[] mediaLibrary = new Media[2];
        mediaLibrary[0] = new Book("The Great Gatsby", "F. Scott Fitzgerald");
        mediaLibrary[1] = new Movie("Inception", "Christopher Nolan");

        System.out.println("--- Demonstrating Polymorphism ---");

        for (Media item : mediaLibrary) {
            item.displayDetails();
            System.out.println("--------------------");
        }
    }
}
