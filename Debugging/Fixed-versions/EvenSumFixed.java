/*
Program Name: EvenSumFixed.java

Objective:
To calculate the sum of all even numbers in an ArrayList of integers.

Original Bug:
for (int i = 1; i <= numbers.size(); i++) {

}
- Problem 1: Starts from index 1, so skips first element.
- Problem 2: i <= size causes IndexOutOfBoundsException.

Fix Applied:
for (int i = 0; i < numbers.size(); i++) {
    
}

Output:
Sum of even numbers: 20

Summary:
- Index in arrays/ArrayLists starts at 0.
- Always loop from i = 0 to i < list.size() to avoid errors.
*/


import java.util.ArrayList;
public class EvenSumFixed {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(2);
        numbers.add(5);
        numbers.add(8);
        numbers.add(3);
        numbers.add(10);

        int sum = 0;
        for (int i = 0; i < numbers.size(); i++) {
            if (numbers.get(i) % 2 == 0) {
                sum += numbers.get(i);
            }
        }

        System.out.println("Sum of even numbers: " + sum);
    }
}
