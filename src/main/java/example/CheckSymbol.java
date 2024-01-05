package example;

public class CheckSymbol {
    private static final String CHECK = "^[a-zA-Z0-9]*$";

    public static void main(String[] args) {
        System.out.println("abc_123".matches(CHECK));
        System.out.println("ABC_123".matches(CHECK));
        System.out.println("AbC_234".matches(CHECK));
    }

}
