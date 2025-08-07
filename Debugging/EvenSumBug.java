import java.util.ArrayList;
public class EvenSumBug {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(2);
        numbers.add(5);
        numbers.add(8);
        numbers.add(3);
        numbers.add(10);

        int sum = 0;
        for (int i = 1; i <= numbers.size(); i++) {
            if (numbers.get(i) % 2 == 0) {
                sum += numbers.get(i);
            }
        }

        System.out.println("Sum of even numbers: " + sum);
    }
}
