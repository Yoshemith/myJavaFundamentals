import java.util.*;

public class ManipulatingCollections {

    public static void main(String[] args) {
        List<String> firstList = new ArrayList<>();
        firstList.add("one");
        firstList.add("two");
        firstList.add("three");
        firstList.add("four");
        firstList.add("five");

        for (String s: firstList) {
            System.out.println(s);
        }

        Collections.sort(firstList);

        for (String s: firstList) {
            System.out.println(s);
        }

        List<Book> books = new ArrayList<>();
        books.add(new Book("The stranger", "Albert Camus", 15.99));
        books.add(new Book("1984", "George Orwell", 29.99));
        books.add(new Book("Normal People", "Sally Rooney", 29.99));

        Collections.sort(books);

        for (Book b: books) {
            System.out.println(b);
        }

        Map<Integer, Book> bookMap = new HashMap<>(); //The KEY has to be an object and the object must implement the hashcode method.
        bookMap.put(11, new Book("The stranger", "Albert Camus", 15.99));
        bookMap.put(3, new Book("1984", "George Orwell", 29.99));
        bookMap.put(27, new Book("Normal People", "Sally Rooney", 29.99));

        //If we put a new element into the Hashmap with a KEY previously entered
        //The new element will override the previous one.
        //Ex. this one below will definitely override the Book '1984' that is up there.
        //bookMap.put(3, new Book("Some Other Book", "Some Other Author", 29.99));

        System.out.println(bookMap.size());
        Book foundBook = bookMap.get(11);
        System.out.println(foundBook);

        //Here you can get the set of keys in the bookMap
        Set<Integer> keys = bookMap.keySet();
        for (Integer k: keys) {
            //and thanks to the set of keys we can loop through every book
            System.out.println(bookMap.get(k));
        }

        //If we want the list of books, well we can get it with .values() and then we can loop through it
        var values = bookMap.values();
        for (Book b: values) {
            System.out.println(b);
        }

        //If we want to sort the list of books
        List<Book> bookList = new ArrayList<>(bookMap.values());
        Collections.sort(bookList);

        //Method to remove an element of the Map, by using the KEY.
        bookMap.remove(3);

        //Just like the list.of() method there's a map.of() method that works in a similar way
        // this one returns an immutable Map
        Map<Integer, String> myMap= Map.of(1, "one", 2, "two");


    }

}
