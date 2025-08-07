import java.util.Scanner;

public class ArraySum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a[]=new int[10];
        System.out.println("Enter the size of the Array: ");
        int size = sc.nextInt();
        System.out.println("Enter elements in the Array: ");
        for(int i=0;i<size;i++) {
            a[i]=sc.nextInt();
        }
        int sum=0;
        System.out.println("The Elements in the Array: ");
        for(int i=0;i<size;i++) {
            System.out.print(a[i]+" ");
            sum +=a[i]; 
        }
        System.out.println("\nSum of the Elements: "+sum);
        sc.close();
    }
}