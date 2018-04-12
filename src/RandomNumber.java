
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class RandomNumber {
    public static void main(String[] args) {
    	
    	Scanner sc = new Scanner(System.in);
    	System.out.println("Enter the position of the smallest number required: ");
    	int smallestNumber = sc.nextInt();
    	
        List<Integer> numbers = new ArrayList<Integer>();
        for (int i = 0; i < 500; i++) {
            numbers.add((int) (Math.random() * 500));
        }
        System.out.println("my list is  :");
        numbers.forEach(System.out::println);
        Set<Integer> numberSet = new HashSet<Integer>(numbers);
        if (smallestNumber > numberSet.size()) {
        	System.err.println("choose a smallest number");
        	System.exit(1);
        }
        System.out.println(smallestNumber + "th smallest number in the list is " + new ArrayList(numberSet).get(smallestNumber-1));
       
    }
}