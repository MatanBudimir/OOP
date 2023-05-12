package exceptions;

public class ExceptionalMethod {
    private static void exceptionalMethod(String[] input) {
        String result = "";
        for (String string : input) {
            try {
                String upper = string.toUpperCase();
                try {
                    result += upper.toCharArray()[0];
                } catch (ArrayIndexOutOfBoundsException ex) {
                    System.out.println("Array out of index");
                }
            } catch (NullPointerException ex) {
                System.out.println("Null pointer");
            }
        }
    }
}
