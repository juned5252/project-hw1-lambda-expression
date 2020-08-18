package lambdaexpression.iterator;

import java.util.HashMap;
import java.util.Map;

public class IterateUsingLambda {
    public static void main(String[] args) {
        Map<String, Integer> itemPrice = new HashMap<>();
        itemPrice.put("lambda.expression.anonymous.Laptop", 1200);
        itemPrice.put("iPhone", 650);
        itemPrice.put("AndroidPhone", 500);
        itemPrice.put("TV", 700);
        itemPrice.put("Monitor", 450);

		// Iterate without using Lambda
		 for (Map.Entry<String, Integer> entry : itemPrice.entrySet()) {
		     System.out.println("Item Name: " + entry.getKey() + " and Price: " + entry.getValue());
		 }

        System.out.println("\nIteration on Map using Lambda expression ");
        // Please Implement Lambda Iteration on itemPrice map
        itemPrice.entrySet().stream().forEach(item -> System.out.println(item.getKey() + ": $" + item.getValue()));
    }
}
