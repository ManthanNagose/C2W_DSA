import java.util.*;
public class MaxUptoIndex {

    static int getMax(int arr[], int k){
        int maxi = Integer.MIN_VALUE;
        for(int i=0; i<k; i++){
            if( arr[i] > maxi)
                maxi = arr[i];
        }
        return maxi;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[] {3,4,5,1,2,7,9,8};

        System.out.println("Enter input Index: ");
        int k = sc.nextInt();
        int max = getMax(arr, k);

        System.out.println("Max element upto given index is : " + max);

    }
}
