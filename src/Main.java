//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Book book = new Book("The Great Life", 20.0, "Fahad Alkarani");
        Movie movie = new Movie("The Happiness", 15.0, "Ahmed Altamimi");

        // book
        System.out.println("Book Title: " + book.getName());
        System.out.println("Book Price: $" + book.getPrice());
        System.out.println("Book Author: " + book.getAuthor());
        System.out.println("Book Discount: " + book.getDiscount() + "%");

        //  movie
        System.out.println("\nMovie Title: " + movie.getName());
        System.out.println("Movie Price: $" + movie.getPrice());
        System.out.println("Movie Director: " + movie.getDirector());
        System.out.println("Movie Discount: " + movie.getDiscount() + "%");




//Movable
        MovablePoint point = new MovablePoint(6, 8, 1, 1);


        System.out.println("Initial Position:");
        System.out.println("X: " + point.getX());
        System.out.println("Y: " + point.getY());
        System.out.println("X Speed: " + point.getxSpeed());
        System.out.println("Y Speed: " + point.getySpeed());

        // Move the point
        point.moveRight();
        point.moveUp();

        // Print new position after movement
        System.out.println("\nNew Position After Movement:");
        System.out.println("X: " + point.getX());
        System.out.println("Y: " + point.getY());

        }
    }
