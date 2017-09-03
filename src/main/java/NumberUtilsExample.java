import org.apache.commons.lang3.math.NumberUtils;

public class NumberUtilsExample {

    public static void main(String[] args) {

        int array[] = new int[] { 5, 3, 10, 2, 6, 8, 15 };


        System.out.println("Maximum Value in the array: "
                + NumberUtils.max(array));

        System.out.println("Maximum Value in the array: "
                + NumberUtils.min(array));

        String number = "123a";
        System.out.println("The String " + number + " is a valid number: " + NumberUtils.isNumber(number));
    }
}
