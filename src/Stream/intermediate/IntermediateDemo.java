package Stream.intermediate;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class IntermediateDemo {
    static void main() {
        List<Book> books = Arrays.asList(
                new Book("The Silent Garden", 15.99, "Fiction", 2019),
                new Book("Cosmic Wonders", 22.99, "Anime", 2020),
                new Book("Manga", 17.99, "Fiction", 2021),
                new Book("JJK", 33.99, "Fiction", 2025),
                new Book("Death Note", 15.5, "Fiction", 2009),
                new Book("Physics", 88, "Fiction", 2000)
        );

        //filter book cheaper than 30

        Stream<Book> s1 = books.stream().filter((s) -> s.price < 20);
        s1.forEach(System.out::println);

        // book title in upper case

        Stream<String> titleUpperCase = books.stream()
                .map((book) -> book.title.toUpperCase());
        titleUpperCase.forEach(System.out::println);

        // sorting books by Publication date

        Stream<Book> sortBooksByYear = books.stream()
                .sorted(Comparator.comparingInt(book -> book.publishedYear));
        sortBooksByYear.forEach(System.out::println);

        // display on only three book

        Stream<Book> firstThreeBooks = books.stream().limit(3);
        firstThreeBooks.forEach(System.out::println);


        // skip the first 2 books
        System.out.println("skip ");
        Stream<Book> skipTwoBooks = books.stream().skip(2);
        skipTwoBooks.forEach(System.out::println);


        //total cost of all books in book store
        double total = books.stream()
                .mapToDouble((s)->s.price)
                .reduce(0,(acc,num)->acc+num);

        System.out.println(total);


        // collect books titled in list
        List<String>titles=books.stream().map(book->book.title).collect(Collectors.toList());
        System.out.println(titles);

        //Grouping books by category

        System.out.println("Category");

        Map<String,List<Book>> byCategory=books.stream()
                .collect(Collectors.groupingBy(bookStringFunction));
        byCategory.forEach((category,bookList)->{
            System.out.println(category);
            bookList.forEach(System.out::println);
        });
    }
    static Function<Book,String>bookStringFunction=new Function<Book, String>() {
        @Override
        public String apply(Book book) {
            return book.getCategory();
        }
    };
}
