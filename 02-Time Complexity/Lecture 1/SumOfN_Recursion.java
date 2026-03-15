public class SumOfN_Recursion {
    static int sum = 0;
    static void sumOfNElements(int Num){
        if(Num == 0)
            return;
        sumOfNElements(Num-1);
        sum += Num;
        System.out.println(sum);
    }

    public static void main(String[] args) {
        sumOfNElements(10);
    }
}
