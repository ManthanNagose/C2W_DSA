import java.util.Scanner;

public class LeftMaxArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int arr[] = new int[] {-3,6,2,4,5,2,8,-9,3,1};
        int arr2[] = new int[arr.length];
        int maxi = Integer.MIN_VALUE;
        
        for(int i=0; i<arr.length; i++){
            if(arr[i] > maxi)
                maxi = arr[i];
            arr2[i] = maxi;
        }

        for(int i=0; i<arr2.length; i++){
            System.out.println(arr2[i]);
        }

    }
}
