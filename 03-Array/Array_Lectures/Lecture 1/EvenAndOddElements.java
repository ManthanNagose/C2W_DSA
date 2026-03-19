public class EvenAndOddElements {

    static int getEvenElements(int arr[]){
        int countEven = 0;

        for(int i=0; i<arr.length; i++){
            if(arr[i] % 2 == 0)
                countEven ++;
        }
        return countEven;
    }

    static int getOddElements(int arr[]){
        int countOdd = 0;

        for(int i=0; i<arr.length; i++){
            if(arr[i] % 2 != 0)
                countOdd ++;
        }
        return countOdd;
    }

    public static void main(String[] args) {
        int arr[] = new int[]{ 1, 2, 3, 4, 5};

        int even = getEvenElements(arr);
        int odd = getOddElements(arr);
        System.out.println("even number elemenets are : " + even);
        System.out.println("Odd number elemenets are : " + odd);
    }
}
