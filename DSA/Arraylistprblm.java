import java.util.ArrayList;
public class Arraylistprblm {
    public static void main(String[] args) {
        ArrayList<Integer> numList = new ArrayList<>();
        
        numList.add(15);
        numList.add(25);
        numList.add(10);
        numList.add(5);
        numList.add(90);

        System.out.println("Number List: ");
        for(Integer numListsInteger : numList) {
            System.out.print(numListsInteger+" ");
        }
        int max=numList.get(0);
        for(int i=0;i<numList.size();i++) {
            if (max<numList.get(i)) {
                max=numList.get(i);
            }
        }
        System.out.println("\nLargest number in the List: "+max);

    }
}
