public class Variables2 {

    public static void main(String[] args) {
        //primitive types
        //It's good practice to use primitive types instead of class version (the versions below)
        int a = 1;
        double b = 2.54;

        //Effectively the same thing, but slightly different
        //This version is a class.
        //When we work with a class version we can see a set methods by using a1.methodName()
        //You can convert those values or do oher things.
        // Example: a1.doubleValue => convert to double.  a1.toString => convert to string, etc.
        //PD: These versions require more a bit more memory than the primitive types
        Integer a1 = 1;
        Double b2 = 2.54; //This is translated like this --> Double b2 = new Double(2.54);
    }

}
