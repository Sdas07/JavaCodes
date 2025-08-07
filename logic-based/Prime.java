import java.util.*;
public class Prime {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int c=0;
        System.out.println("Enter the Number: ");
        int num=sc.nextInt();
        for(int i = 1;i<=num;i++){
            if (num % i == 0) {
                c++;
            }
        }
        if (c==2) {
            System.out.println(num+" is a Prime Number");
        }else{
            System.out.println(num+" is not a Prime Number");
        }
        sc.close();
    }
}
