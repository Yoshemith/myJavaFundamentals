public class MemoryManagement {

    public static void main(String[] args) {

        String allNumbers = "";
        for (int i = 1; i < 10; i++) {
            //Here Java is creating a new object every single time, which is inefficient
            allNumbers += " " + i;
        }
        //At this point we have 10 objects, which 9 of them are ready to garbage collection
        //But already made our code inefficient

        System.out.println(allNumbers);

        //By using StringBuilder we get a temporary object that lets us manipulate its content.
        StringBuilder allNumbersSB = new StringBuilder();

        for (int i = 1; i < 10; i++) {
            //In each iteration is the same object
            allNumbersSB.append(" ");
            allNumbersSB.append(i);
        }
        //It's still the same object, there's no garbage collection

        System.out.println(allNumbersSB.toString());

    }

}
