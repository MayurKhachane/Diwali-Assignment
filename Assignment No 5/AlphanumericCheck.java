public class AlphanumericCheck {
    public static boolean isAlphanumeric(String str) {
        return str.matches("^[a-zA-Z0-9]+$");
    }

    public static void main(String[] args) {
        String s1 = "Hello123";
        String s2 = "Hello_123";

        System.out.println(s1 + " is alphanumeric? " + isAlphanumeric(s1)); 
        System.out.println(s2 + " is alphanumeric? " + isAlphanumeric(s2)); 
    }
}
