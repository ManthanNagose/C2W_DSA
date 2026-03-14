class Factors{
    int countFactor(int num){
        int count= 0;
        for(int i=1; i<= num/2; i++){
            count ++;
        }
        return count+1;
    }
}
public class CountFactor2 {
    public static void main(String[] args) {
        Factors obj = new Factors();
        int factorCount = obj.countFactor(100);
        System.out.println("Total factor are : " + factorCount);    
    }
}
