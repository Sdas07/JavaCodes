import java.util.*;
public class Buzz{
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        int n;
        System.out.println("Enter the number: ");
        n=sc.nextInt();
        if (n%7 == 0 || n/10 == 7) {
            System.out.println(n+" is a Buzz Number.");
        }else{
            System.out.println(n+" is not a Buzz Number.");
        }
        sc.close();
    }
}