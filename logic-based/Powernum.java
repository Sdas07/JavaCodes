import java.util.*;
public class Powernum {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter how many powers of 2 you want to print: ");
        int n = sc.nextInt();

        
        for(int i=0;i<n;i++){
            int result = (int) Math.pow(2, i);
            System.out.println("2^"+i+" = "+result);
        }
        sc.close();
    }
}