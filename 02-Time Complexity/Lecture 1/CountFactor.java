// 100 iterations that is N iterations

class Factor{
    int countFactor(int num){
        int count =0; 
        for(int i=1; i<=num; i++){
            if(num % i == 0)
                count ++;
        }
        return count;
    }
}

public class CountFactor {
    public static void main(String[] args) {
        Factor obj = new Factor();
        int factorCount = obj.countFactor(100);
        System.out.println("Taotal factor are : " + factorCount);    
    }
}
