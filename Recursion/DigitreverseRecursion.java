//❓ Problem 4: Reverse Printing of Digits (Using Recursion)
//🔸 Statement:
//Write a Java program that takes a number n and prints its digits in reverse order using recursion.


public class DigitreverseRecursion {
    public static void Digitrev(int num){
        if (num < 1) {
            return;
        }
        System.out.println(num%10);
        Digitrev(num/10);
    }
    public static void main(String[] args) {
        int num = 1234;
        System.out.println(num+" in reverse digit order");
        Digitrev(num);
        
    }
}
