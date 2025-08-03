import java.util.*;
public class Automorphic {
    public static String CheckAutomorphic(int a){
        int sq=a*a;
        int lastdigit=sq%10;
        if (a==lastdigit) {
            return " is an Automorphic Number";
        }else{
            return " is not an Automorphic Number";
        }
    }
    public static void main(String[] args) {
      Scanner sc= new Scanner(System.in);
      System.out.println("Enter the Number: ");
      int num=sc.nextInt();
      String result=CheckAutomorphic(num);
      System.out.println(num+result);
      sc.close();  
    }
}
