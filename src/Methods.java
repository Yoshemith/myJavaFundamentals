public class Methods {

    public static void main(String[] args) {
        for (String arg : args) {
            System.out.println(arg);
        }

        addTwoNumbers(5 , 5);
    }

    public static void addTwoNumbers(int n1, int n2) {
        System.out.println(n1 + n2);
    }
}
