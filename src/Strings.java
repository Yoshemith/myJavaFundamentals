public class Strings {

    public static void main(String[] args) {
        String name = "Sandra Burnside";
        int space = name.indexOf(" ");
        System.out.println(space);
        String surname = name.substring(space + 1);
        System.out.println(surname);
        boolean evenLength = surname.length() % 2 == 0;
        System.out.println(evenLength);
        String day = "Monday";
        //concatenation in java
        String greeting = String.format("Hello %s, today is %s.", name, day);
        System.out.println(greeting);

        printColors();
    }

    private static void printColors() {
        String colors = "Blue, Orange, White, Red, Purple.";
        String[] colorsArray = colors.split(", ");
        for (String color: colorsArray) {
            System.out.println(color);
        }
    }
}
