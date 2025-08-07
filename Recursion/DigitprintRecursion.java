//❓ Problem 4: Printing of Digits (Using Recursion)
//🔸 Statement:
//Write a Java program that takes a number n and prints its digits in ascending order using recursion.


public class DigitprintRecursion {
    public static void Digitprint(int num){
        if (num < 1) {
            return;
        }
        int k = num%10;
        Digitprint(num/10);
        System.out.println(k+" ");
    }
    public static void main(String[] args) {
        int num = 1234;
        System.out.println(num+" in Ascending digit order");
        Digitprint(num);
    }
}
