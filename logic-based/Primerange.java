import java.util.*;
public class Primerange {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the upper limit of the range: ");
        int num = sc.nextInt();
        System.out.println("From 1 to "+num+" the Prime Numbers are: ");
        for(int i=1;i<=num;i++){
            int c=0;
            for(int j=1;j<=i;j++ ){
                if (i%j==0) {
                    c++;
                }
            }
            if (c==2) {
                    System.out.println(i);
                }
        }
        sc.close();
    }
}
