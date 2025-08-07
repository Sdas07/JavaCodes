public class DigitaddRecursion {
    public static int Digitadd(int num){
        if (num < 1) {
            return 0;
        }
        int k = num % 10;
        num = num / 10;
        return k + Digitadd(num);
    }
    public static void main(String[] args) {
        int num = 12345;
        int sum = Digitadd(num);
        System.out.println("The sum of the digits of the number "+num+" is: "+sum);
    }
}
