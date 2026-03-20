
public class PeakElement {

    static void getPeak(int arr[]){
        for(int i=1; i<arr.length-1; i++){
            if( arr[i-1] < arr[i] && arr[i] > arr[i+1] ){
                System.out.println(arr[i]);
            }
        }
    }

    public static void main(String[] args) {
        int arr[] = new int[]{10, 20, 15, 2, 23, 90, 67};

        getPeak(arr);
    }
}
