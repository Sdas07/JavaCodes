import java.util.*;
public class Neon{
    public static String CheckNeon(int a){
        int sq = a*a;
        int k,sum=0;
        for(int i=sq;i>0;i=i/10){
            k= i%10;
            sum+=k;
        }
        if (a==sum) {
            return " is a Neon Number.";
        }else{
            return " is not a Neon Number.";
        }
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the Number: ");
        int num = sc.nextInt();
        String result=CheckNeon(num);
        System.out.println(num+result);
        sc.close();
    }
}
