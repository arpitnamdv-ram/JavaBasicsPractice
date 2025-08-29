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


    }
}

