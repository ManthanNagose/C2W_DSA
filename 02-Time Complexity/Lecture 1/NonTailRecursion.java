public class NonTailRecursion {
    
    static void PrintNum (int Num){
        if(Num == 0)
            return;
        PrintNum(--Num);
        System.out.println(Num);
    }

    public static void main(String[] args) {
        PrintNum(10);
    }
}
