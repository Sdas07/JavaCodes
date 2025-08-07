public class NaturalnumRecursion {
    public static int Natural(int num){
        if (num == 1) {
            return 1;
        }
        return num+ Natural(num-1);
    }
    public static void main(String[] args) {
        int num = 5;
        int result = Natural(num);
        System.out.println ("Sum of "+ num + " is: " + result);
    }
}
