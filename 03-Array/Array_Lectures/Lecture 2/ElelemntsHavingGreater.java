public class ElelemntsHavingGreater {

    static int getElementsHavingGreater(int arr[]){

        // Time Complexity = O(N^2)

        int counter = 0;
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr.length; j++){
                if(arr[j] > arr[i]){
                    counter++;
                    break;
                }
            }
        }
        return counter;
    }

    static int countEle(int arr[]){

        // Time Complexity = O(N)
        
        int maxi = arr[0];
        for (int i=0; i<arr.length; i++){
            if(arr[i] > maxi)
                maxi = arr[i];
        }

        int count = 0;
        for (int i=0; i<arr.length; i++){
            if(arr[i] == maxi)
                count++;
        }
        return (arr.length - count);
    }


    public static void main(String[] args) {
        int arr[] = new int[]{2,5,1,4,8,0,8,1,3,8};

        int ans = getElementsHavingGreater(arr);
        System.out.println(ans);

        int ans2 = countEle(arr);
        System.out.println(ans2);
    }    
}
