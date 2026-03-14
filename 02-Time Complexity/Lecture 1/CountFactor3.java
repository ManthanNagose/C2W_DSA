class Factor{
    int countFactor(int num){
        int count = 0; 
        for(int i=1; i<=num/i; i++){
            if(num % i == 0){
                if( i == num/i)
                    count ++;
                else{
                    count += 2;
                }
            }
        }
        return count;
    }
}
public class CountFactor3 {
    public static void main(String[] args) {
        Factor obj = new Factor();
        int factorCount = obj.countFactor(100);
        System.out.println("Total factor are : " + factorCount);    
    }
}
