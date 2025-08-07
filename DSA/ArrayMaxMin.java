import java.util.Scanner;

public class ArrayMaxMin {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a[]=new int[10];
        System.out.println("Enter the size of the Array: ");
        int size = sc.nextInt();
        System.out.println("Enter elements in the Array: ");
        for(int i=0;i<size;i++) {
            a[i]=sc.nextInt();
        }

        int max=a[0];
        int min=a[0];

        System.out.println("The Elements in the Array: ");
        for(int i=0;i<size;i++) {
            System.out.print(a[i]+" ");
            if (a[i]>max) max=a[i];
            else if(a[i]<min) min=a[i]; 
            }
        System.out.println("\nMaximum Element: "+max);
        System.out.println("Minimum Element: "+min);
        sc.close();
    }
}
