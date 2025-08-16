public class Krishna {
    public static void main(String[] args) {
        String  num = "krishna";
        String  num1 = "kuppam";
        if (num.compareTo(num1) > 0) {
            System.err.println(" num is greater than num1");
        }
        else if (num.compareTo(num1) == 0) {
            System.err.println(" num is equal to num1");
        }
        else if (num.compareTo(num1) < 0) {
            System.err.println(" num is less than num1");
        }
        else {
            System.err.println(" This should never happen");
        }
    }
}