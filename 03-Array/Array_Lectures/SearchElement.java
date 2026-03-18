import java.util.*;
public class SearchElement {
    static int searchElement(int arr[], int k){
        for(int i=0; i<arr.length; i++){
            if(arr[i] == k)
                return i;
        }
        return -1;
    }
    public static void main(String args []){
        Scanner sc = new Scanner(System.in);
        int arr[] = new int []{13, 6, 3, 31, 42, 61, 21, 12, 1, 16};

        System.out.println("Enter the element to search: ");
        int k = sc.nextInt(); 

        int ans = searchElement(arr, k);

        if( ans == -1){
            System.out.println("Element is not present in the given array.");
        }else{
            System.out.println("Element is present at index " + ans );
        }
    }      
}
