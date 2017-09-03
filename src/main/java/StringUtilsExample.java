import org.apache.commons.lang3.StringUtils;

public class StringUtilsExample {

    public static void main(String[] args) {

        testWhiteSpaceAndCompare();
        //testStringReverse();
        //testContains();
        //testLetterCase();

    }

    private static void testWhiteSpaceAndCompare() {
        String str = "Hello World";
        str = StringUtils.deleteWhitespace(str); // to remove all white spaces
        System.out.println("Without White space: " + str);
        System.out.println("Difference is: " + StringUtils.difference("Hello", str));

        if(StringUtils.equals(str, "HelloWorld")) {
            System.out.println("null safe!");
        }

    }

    private static void testStringReverse() {
        String test = "Hello World";
        String reverse = StringUtils.reverse(test);
        System.out.println("Reverse of " + test + " is " + reverse);

        String toReverse = "192.168.0.1";
        System.out.println("Reversed with delimiter " + StringUtils.reverseDelimited(toReverse, '.'));
    }

    private static void testContains() {
        String test = "Hello World";
        // Note: contains method is already present in String class itself but
        // containsIgnoreCase is not present
        if (StringUtils.containsIgnoreCase(test, "hello")) {
            System.out.println("String is present");
        }

        if (StringUtils.containsNone(test, "abc")) {
            System.out.println("The string does not contain letters a,b,c.");

        }

        if (StringUtils.containsWhitespace(test)) {
            System.out.println("The String Contains White space");
        }


    }

    private static void testLetterCase() {
        String test = "hello";
        if (StringUtils.isAllLowerCase(test)) {
            System.out.println("All the letters are in lower case");
        }

        if (StringUtils.isAllUpperCase(test)) {
            System.out.println("All the letters are in upper case");
        }
    }

    private static void testJoin(){
        String[] numbers = {"one", "two", "three"};
        System.out.println(StringUtils.join(numbers, ","));
    }


}
