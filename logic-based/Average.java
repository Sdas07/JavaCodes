import java.util.*;
public class Average {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter how many numbers average u want: ");
        int n= sc.nextInt();

        int sum=0;
        System.out.println("Enter the Numbers: ");
        for(int i=1;i<=n;i++){
            int num =sc.nextInt();
            sum+=num;
        }
        double Avg=(double) sum / n;
        System.out.println("The Average of "+n+" numbers is: "+Avg);
        sc.close();
    }
}
