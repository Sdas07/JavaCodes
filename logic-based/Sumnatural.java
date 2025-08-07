import java.util.*;
public class Sumnatural {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum =0;
        System.out.println("Enter the number of Natural number u want: ");
        int n = sc.nextInt();
        
        for(int i=1;i<=n;i++){
            sum+= i;
        }
        System.out.println("The Sum of first "+n+" Natural numbers is "+sum);
        sc.close();
    }
}
