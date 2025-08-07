import java.util.Scanner;

public class ArrayRev {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a[]=new int[10];
        System.out.println("Enter the size of the Array: ");
        int size = sc.nextInt();
        System.out.println("Enter elements in the Array: ");
        for(int i=0;i<size;i++) {
            a[i]=sc.nextInt();
        }

        System.out.println("The Elements in the Array: ");
        for(int i=0;i<size;i++) {
            System.out.print(a[i]+" ");
        }

        System.out.println("\nReverse of the Array: ");
        for(int i=size-1;i>=0;i--) {
            System.out.print(a[i]+" ");
        }
        sc.close();
    }
}
