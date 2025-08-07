import java.util.Scanner;

public class ArrayDuplicatecheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a[]=new int[10];

        System.out.println("Enter the size of the Array: ");
        int size = sc.nextInt();

        System.out.println("Enter elements in the Array: ");
        for(int i=0;i<size;i++) {
            a[i]=sc.nextInt();
        }

        System.out.println("The Array is: ");
        for(int i=0;i<size;i++) {
            System.out.print(a[i]+" ");
        }
        boolean foundDuplicate = false;
        System.out.println("\nDuplicate elements are: ");
        for(int i=0;i<size;i++) {
            for(int j=i+1;j<size;j++) {
                if(a[i]==a[j]) {
                System.out.print(a[i]+" ");
                foundDuplicate = true;
                break;
            }
        }
    }
    if (!foundDuplicate) {
        System.out.println("No Duplicates found!");
    }    

    sc.close();
    }
}
