package Task2;

//Создать класс Book, сделать 3 поля и соответствующие методы.
// Необходимо реализовать замыкание анонимного класса и лямбда-выражения

interface Books {
    void print();

}

public class Book {
    private static String name = "Book name";
    private static String author = "Author name";
    private static int pages = 400;



    public static void main(String[] args) {
        Books books = () -> {
            System.out.println(name);
            System.out.println(author);
            System.out.println(pages);
        };
        books.print();


    }
}

