import java.util.Scanner;

public class ArrayNumPresent {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a[]={10, 20, 50, 5, 15, 22, 10, 15, 20};
        int size = a.length;

        System.out.print("Enter the number you want to check if present in the Array or not: ");
        int num = sc.nextInt();

        
        boolean findnum=false;
        String positions="";
        int c=0;
        for(int i=0;i<size;i++) {
            if (a[i]==num) {
                c++;
                findnum =true;
                positions += i+" ";
            }
        }
        if (findnum) {
            System.out.println(num+" Present! Occurs "+c+" times");
            System.out.println("Found at position: "+positions);
        } else {
            System.out.println(num+" Not Present");
        }

        sc.close();
    }
}
