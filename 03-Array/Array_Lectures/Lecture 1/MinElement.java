import java.util.*;

public class MinElement {
    static int mini = Integer.MAX_VALUE;

    static int getMinElement(int arr[]){
        for(int i=0; i<arr.length; i++){
            if( arr[i] < mini)
                mini = arr[i];
        }
        return mini;
    }

    public static void main(String args []){
        Scanner sc = new Scanner(System.in);
        int arr[] = new int []{13, 6, 3, 31, 42, 61, 21, 12, 1, 16};

        
        int maxi = getMinElement(arr);
        System.out.println("Maximum eleent in given array is: " + maxi);
    }
}

