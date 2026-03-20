// leader element is that whose right side elements are all smaller than it

public class LeaderElements {

    static void getLeaderElements(int arr[]){

        int maxi = Integer.MIN_VALUE;

        for(int i=0; i<arr.length; i++){

            for(int j=i; j<arr.length; j++){

                if( arr[i] < arr[j])
                    maxi = arr[j];

            }

            if( maxi == arr[i])
                System.out.println(arr[i]);

        }
        System.out.println(arr[arr.length -1]);
    }

    public static void main(String[] args) {
        int arr[] = new int[]{16, 17, 4, 3, 5, 2};

        getLeaderElements(arr);

    }
}
