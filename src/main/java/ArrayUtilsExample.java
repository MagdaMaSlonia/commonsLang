import org.apache.commons.lang3.ArrayUtils;

import java.util.Map;

public class ArrayUtilsExample {

    public static void main(String[] args) {
        String[][] countries = {{"India", "New Delhi"},
                {"United States", "New York"},
                {"United Kingdom", "London"},
                {"Netherland", "Amsterdam"},
                {"Japan", "Tokyo"},
                {"France", "Paris"}};


        // Convert array to map
        Map<Object, Object> countryCapitals = ArrayUtils.toMap(countries);
        System.out.println("Capital of India is " + countryCapitals.get("India"));
        System.out.println("Capital of United States is " + countryCapitals.get("United States"));

        int[] numbers = new int[]{2, 3, 1, 5, 6, 7, 8};
        System.out.println("7 is present in the array: " + ArrayUtils.contains(numbers, 7));
        System.out.println("9 is present in the array: " + ArrayUtils.contains(numbers, 9));


        System.out.println("Original array: " + ArrayUtils.toString(numbers));
        ArrayUtils.reverse(numbers);
        System.out.println("Reverse of the array: " + ArrayUtils.toString(numbers));
    }

}
