public class PrintAllElements {

    static void printArray(int arr[]){

        for(int i=0; i<arr.length; i++){
            System.out.println(arr[i]);
        }
    }
    public static void main(String[] args) {
        int arr[] = new int[] {5, 6, 2, 3, 1, 9};
        
        printArray(arr);
    }
}

// Time complexity = O(N)
// Space complexity = O(1)
