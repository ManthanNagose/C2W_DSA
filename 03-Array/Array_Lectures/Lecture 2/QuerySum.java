import java.util.*;

public class QuerySum {
    static void getQuerySum(int arr[], int query ){

        Scanner sc = new Scanner(System.in);

        for(int i=0; i<query; i++){
            System.out.println("Enter the starting index and ending index: ");
            int startIdx = sc.nextInt();
            int endIdx = sc.nextInt();
            
            int sum = 0;
            for(int j=startIdx; j<=endIdx; j++){
                sum += arr[j];
            }
            System.out.println("Sum is : " + sum);
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int arr[] = new int[]{-3,6,2,4,2,8,-9,3,1};

        System.out.println("Enter the number of queries: ");
        int query = sc.nextInt();

        getQuerySum(arr, query);
        
    }
    
}
