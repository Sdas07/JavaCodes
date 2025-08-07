import java.util.*;
public class Palindrome {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n,a,s=0;
        System.out.println("Enter your number: ");
        n=sc.nextInt();
        for(int i=n;i>0;i=i/10){
            a=i%10;
            s=s*10+a;
        }
        if (n==s) {
            System.out.println(n+" is a Palindrome Number.");
        }else{
            System.out.println(n+" is not a Palindrome Number.");
        }
        sc.close();

    }    
}
