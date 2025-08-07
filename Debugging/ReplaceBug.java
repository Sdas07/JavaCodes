import java.util.ArrayList;
public class ReplaceBug {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        names.add("Sohom");
        names.add("Ankit");
        names.add("Ravi");

        names.set(3, "Rahul");

        System.out.println("Updated List: " + names);
    }
}
