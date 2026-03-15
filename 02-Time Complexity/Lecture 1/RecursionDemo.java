public class RecursionDemo {
    static int x = 1;
    static void PrintNum (int Num){
        System.out.println(x++);
        if( x <= Num){
            PrintNum(Num);
        }
    }

    public static void main(String[] args) {
        PrintNum(10);
    }
}
