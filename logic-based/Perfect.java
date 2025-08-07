import java.util.*;

public class Perfect {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n,s=0;
        System.out.println("Enter Your Number: ");
        n=sc.nextInt();
        for(int i=1;i<n;i++){
            if (n%i==0) {
                s+=i;
            }
        }
        if (n==s) {
            System.out.println(n+" is a Perfect Number.");
        }else{
            System.out.println(n+" is not a Perfect Number.");
        }
        sc.close();
    }
}
