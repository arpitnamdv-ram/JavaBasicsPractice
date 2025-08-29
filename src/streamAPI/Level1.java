package streamAPI;

import java.util.Arrays;
import java.util.List;

public class Level1 {
    public static void main(String[] args) {
        // Question 1
        //
        //Case: You have a list of product prices. You need to print out the prices of all products that are more than $50.
        //
        //Input: List<Integer> prices = Arrays.asList(45, 60, 20, 80, 55, 30);
        //
        //Output: 60, 80, 55 (Each on a new line).

        List<Integer> prices = Arrays.asList(45, 60, 20, 80, 55, 30);
        prices.stream().filter(n -> n> 50).forEach(System.out::println);

        //Question 2
        //
        //Case: From a list of customer IDs (integers), you need to get the count of all IDs that are greater than 1000.
        //
        //Input: List<Integer> ids = Arrays.asList(987, 1024, 1500, 999, 2048);
        //
        //Output: 3

        List<Integer> ids = Arrays.asList(987, 1024, 1500, 999, 2048);

        System.out.println(ids.stream().filter(id -> id>1000).count());

        //Question 3
        //
        //Case: You have a list of string representations of numbers. You need to convert them to integers and then calculate their sum.
        //
        //Input: List<String> numberStrings = Arrays.asList("10", "20", "30", "40");
        //
        //Output: 100

        List<String> numberStrings = Arrays.asList("10", "20", "30", "40");

        numberStrings.stream().map(Integer::parseInt).forEach();


    }
}

