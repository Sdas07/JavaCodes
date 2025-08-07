import java.util.ArrayList;
public class ContainsBug {
    public static void main(String[] args) {
        ArrayList<String> fruits = new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Mango");

        String target = "mango";

        if (fruits.contains(target)) {
            System.out.println("Fruit found!");
        } else {
            System.out.println("Fruit not found!");
        }
    }
}
