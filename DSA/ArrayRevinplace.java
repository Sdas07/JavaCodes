import java.util.Scanner;

public class ArrayRevinplace {
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
        int i = 0;
        int j = size - 1;
        while(i < j) {
            int temp = a[i];
            a[i] = a[j];
            a[j] = temp;
            i++;
            j--;
        }
        System.out.println("\nAfter reverse the Array is: ");
        for(int k=0;k<size;k++) {
            System.out.print(a[k]+" ");
        }

        sc.close();
    }
}
