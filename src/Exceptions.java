import java.net.URI;
import java.net.URISyntaxException;
import java.time.LocalDate;

public class Exceptions {

    public static void dividing(int denominator) {
        System.out.println(17 / denominator);
    }

    public static void createURI() {
        try {
            URI uri = new URI("-https://www.google.com");
            System.out.println("The uri was created");
        }
        catch (URISyntaxException e) {
            throw new IllegalArgumentException();
        }
        catch (Exception e) {
            System.out.println("The exception was caught");
        }
        finally {
            System.out.println("This is in the finally block");
        }
        System.out.println("This code is after try-catch");
    }

    public static void createURIv2() throws URISyntaxException {
        URI uri = new URI("-https://www.google.com");
    }

    public static void main(String[] args) throws URISyntaxException {
//        Integer[] integerArray = new Integer[] {1,2,3,4,5};
//        System.out.println(integerArray[5]);

//        LocalDate today = null;
//        if (today != null)
//            System.out.println(today.getMonth());
//
//        String hello = "hello"; //will throw an exception, bit if we put '123' it won't
//        Double value = Double.valueOf(hello);

        try {
            User user = new User("Matt", 21);
            User user2 = new User("Sally", -21);
        } catch (InvalidAgeException e) {
            e.printStackTrace();
        }

        createURI();

        createURIv2();

        System.out.println("This is still printing");

    }

}
