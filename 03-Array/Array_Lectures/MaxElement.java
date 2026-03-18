import java.util.*;
public class MaxElement {
    static int maxi = Integer.MIN_VALUE;

    static int getMaxElement(int arr[]){
        for(int i=0; i<arr.length; i++){
            if( arr[i] > maxi)
                maxi = arr[i];
        }
        return maxi;
    }

    public static void main(String args []){
        Scanner sc = new Scanner(System.in);
        int arr[] = new int []{13, 6, 3, 31, 42, 61, 21, 12, 1, 16};

        int maxi = getMaxElement(arr);
       System.out.println("Maximum eleent in given array is: " + maxi);
    }
}
