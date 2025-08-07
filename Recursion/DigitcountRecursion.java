public class DigitcountRecursion {
    public static int Digitcount(int num){
        if (num < 1) {
            return 0;
        }
        return 1 + Digitcount(num/10);
    }
    public static void main(String[] args) {
        int num = 45629;
        int result = Digitcount(num);
        System.out.println("There are "+result+" digits in the number "+num);
    }
}
