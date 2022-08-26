public class ArraysOfObjects {

    public static void main(String[] args) {
        int[] numbers = {1,2,3};
        //int x = null; //primitive types cannot be null.

        Book[] books = new Book[10];
        books[4] = new Book("A good read", "Yoshe Castel", 19.99);

        Book myBook;
        myBook = new Book("A good read Part 2", "Yoshe Castel", 29.99);
        //myBook = null; // classes types can be null.

        if (myBook != null) {
            System.out.println(myBook.getTitle());
        }

        //We cannot use .equals() because .equals() is calling a method on this variable.
        //But if the variable doesn't exist, if it hasn't got an object there (as in this case)
        //then there's no object ot call that method on, which means that would give us an exception.
        /*if (myBook.equals(nu) {
            System.out.println(myBook.getTitle());
        }*/

        books[5] = myBook;
        books[8] = new Book("Of mice and men", "Geral Truman", 9.99);
        books[7] = new Book("Pride and prejudice", "Jane Austen", 19.99);

        for (int i = 0; i < books.length; i++) {
            if (books[i] != null)
                System.out.println(books[i].getTitle());
        }

        for (Book book: books) {
            if (book != null) {
                System.out.println(book.getTitle());
            }
        }

    }
}
