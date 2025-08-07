public class DigitproductRecursion {
    public static int Digitproduct(int num){
        if (num < 1) {
            return 1;
        }
        int k = num % 10;
        num = num / 10;
        return k * Digitproduct(num);
    }
    public static void main(String[] args) {
        int num = 25;
        int product = Digitproduct(num);
        System.out.println("The product of the digits of the number "+num+" is: "+product);
    }
}
