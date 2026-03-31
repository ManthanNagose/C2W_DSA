
public class EquilibriumIndex {
    
    static int getEquilibriumIndex(int arr[]){
        
        /*
        int i=0;
        int j = arr.length - 1;
        int rightSum = 0;
        int leftSum = 0;
        while ( i < j){
            rightSum += arr[j];
            leftSum += arr[i];

            System.out.println("Rightsum : " + rightSum);
            System.out.println("leftSum : " + leftSum);
            System.out.println();
            if(leftSum < rightSum)
                i++;
            else if( leftSum > rightSum)
                j--;
            else if( leftSum == rightSum)
                return i;
        }
        return -1;
        */

        int rightSum = 0;
        for(int i=0; i<arr.length; i++){
            rightSum += arr[i];
        }
        System.out.println("rightSum is : " + rightSum);
        
        int leftSum = 0;
        
        for(int i=0; i<arr.length; i++){
            leftSum += arr[i];
            if( leftSum == rightSum )
                return i;
        }
        System.out.println("LeftSum is : " + leftSum);

        return -1;
    }

    public static void main(String[] args) {
        int arr[] =  new int[] {-7,1,5,2,-4,3,0};

        int ans = getEquilibriumIndex(arr);

        System.out.print("Answer is : " + ans);
    }
}
