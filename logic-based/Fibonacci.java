import java.util.*;
public class Fibonacci {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the upper limit: ");
        int n=sc.nextInt();

        int a=0,b=1;
        System.out.println("Fibonacci series: ");
        for(int i=0;i<=n;i++){
            System.out.print(a+" ");
            int next=a+b;
            a=b;
            b=next;
        }
        sc.close();
    }
}

// 0 1 1 2 3 5 8
// n+(n+1)=n