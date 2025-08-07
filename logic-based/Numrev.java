import java.util.*;
public class Numrev {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rev;
        int newnum=0;
        System.out.println("Enter the Number: ");
        int num=sc.nextInt();
        for(int i =num;i>0;i=i/10){
            rev=i%10;
            newnum=newnum*10+rev;
        }
        System.out.println(newnum);
        sc.close();
    }
}
