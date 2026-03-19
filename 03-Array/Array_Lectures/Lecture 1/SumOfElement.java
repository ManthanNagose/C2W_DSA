public class SumOfElement {
    static int getSumOfElements(int arr[]){
        int sum = 0;
        for(int i=0; i<arr.length; i++){
            sum += arr[i];
        }
        return sum;
    }

    public static void main(String[] args) {
        int arr[] = new int[]{-5, -4, -3, -2, -1, 0 , 1, 2, 3, 4, 5, 6};

        int sum = getSumOfElements(arr);
        System.out.println("Sum of all elements in an array are: "+ sum );
    }
}
