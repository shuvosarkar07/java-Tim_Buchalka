public class ParsingValue {

    public static void main(String[] args) {
        try {
            int number = Integer.parseInt("abc");     // int is now a Object so can't access Integer methods
        } catch (NumberFormatException e) {
            System.out.println("Invalid number format: " + e.getMessage());
        }


        String numString = "1234";                      // already a Object
        Integer num = Integer.parseInt(numString);      // using wrapper class I convert it to a Object

        System.out.println(num.getClass());
        System.out.println(numString.getClass());

    }

    
}
