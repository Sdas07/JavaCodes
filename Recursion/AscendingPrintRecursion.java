//❓ Problem:
//Write a Java program using recursion that prints numbers from 1 to n.


public class AscendingPrintRecursion {
    public static void Ascend(int num){
        if (num < 1) {
            return ;
        }
        Ascend(num-1);
        System.out.print(num+" ");
    }
    public static void main(String[] args) {
        int num=5;
        System.out.print("Print from 1 to " + num + ": ");
        Ascend(num);
    }
}

