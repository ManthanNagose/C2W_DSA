public class ProductOfElements {
    static int getSumOfElements(int arr[]){
        int product = 1;
        for(int i=0; i<arr.length; i++){
            product *= arr[i];
            System.out.println(product);
        }
        return product;
    }

    public static void main(String[] args) {
        int arr[] = new int[]{-5, -4, -3, -2, -1 , 1, 2, 3, 4, 5, 6};

        int product = getSumOfElements(arr);
        System.out.println("Product of all elements in an array are: "+ product );
    }
}
