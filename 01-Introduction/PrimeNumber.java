class CheckPrimeNum {
    int num;
    CheckPrimeNum(int num){
        this.num = num;
    }

    boolean checkPrime (){
        int count=0;
        for (int i=1; i<=num; i++){
            if(num % i ==0){
                count++;
            }
        }

        if(count > 2){
            return false;
        }
        return true;
    }
}


public class PrimeNumber{
    public static void main(String[] args){
        CheckPrimeNum obj = new CheckPrimeNum(1);
        if(obj.checkPrime()){
            System.out.println("Entered number is prime");
        }else{
            System.out.println("Entered number is not prime");
        }

    }
}