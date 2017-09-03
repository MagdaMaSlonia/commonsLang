import org.apache.commons.lang3.RandomStringUtils;

public class RandomStrinUtilsExample {

    public static void main(String[] args) {

        // To create a random String of alpha numeric characters of length 5
        System.out.println(RandomStringUtils.randomAlphanumeric(5));
        // to create random alphabetic characters
        System.out.println(RandomStringUtils.randomAlphabetic(5));
        // to create random numeric characters
        System.out.println(RandomStringUtils.randomNumeric(5));

    }

}
