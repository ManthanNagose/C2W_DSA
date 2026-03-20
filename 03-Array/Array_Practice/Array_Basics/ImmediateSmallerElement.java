// immediate smaller element : if while iterating if just right side element is found as smaller replace te i index number to that , and if the number is greater make the i index to -1

public class ImmediateSmallerElement {
    static void getImmSmallELe(int arr[]){

        for(int i=0; i<arr.length-1; i++){
            if(arr[i] > arr[i+1])
                arr[i] = arr[i+1];
            else if(arr[i] < arr[i+1]){
                arr[i] = -1;
            }
        }
        arr[arr.length-1] = -1;

        System.out.println("Output array : ");

        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }

    }
    public static void main(String[] args) {
        int arr[] = new int[]{5, 6, 2, 3, 1, 7};

        getImmSmallELe(arr);
    }
}
