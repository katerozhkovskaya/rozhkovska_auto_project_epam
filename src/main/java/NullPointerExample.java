public class NullPointerExample {

    public static void main(String[] args) {

        String inputString = null;
        String result = stringConcat(inputString);
        System.out.println(result);
    }

    public static String stringConcat(String s) {

        return s.concat("abc");
    }
}
