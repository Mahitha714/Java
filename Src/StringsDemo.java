public class StringsDemo {

    public static void main(String[] args) {

        String name = "Mahitha";

        System.out.println("Original: " + name);

        // length
        System.out.println("Length: " + name.length());

        // uppercase
        System.out.println("Uppercase: " + name.toUpperCase());

        // lowercase
        System.out.println("Lowercase: " + name.toLowerCase());

        // character at index
        System.out.println("Character at index 2: " + name.charAt(2));

        // contains check
        System.out.println("Contains 'hi': " + name.contains("hi"));

        // replace
        System.out.println("Replace a -> X: " + name.replace("a", "X"));

        // compare
        String another = "Mahitha";
        System.out.println("Equals another: " + name.equals(another));
    }
}