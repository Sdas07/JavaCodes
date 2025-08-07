import java.util.*;

public class Armstrong {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n,p,s=0;
        System.out.println("Enter Your Number: ");
        n=sc.nextInt();
        for(int i=n;i>0;i=i/10){
            p=i%10;
            s=(int)Math.pow(p,3)+s;
        }
        if (n==s) {
            System.out.println(n+" is an Armstrong Number.");
        }else{
            System.out.println(n+" is not an Armstrong Number.");
        }
        sc.close();
    }
}
