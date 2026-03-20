public class MoveNegPos {

    static void moveNegPos(int[] arr) {
        int end = arr.length - 1;

        for (int i = 0; i <= end; ) {
            if (arr[i] < 0) {
                i++;
            } else {
                int temp = arr[i];

                for (int j = i + 1; j <= end; j++) {
                    arr[j - 1] = arr[j];
                }

                arr[end] = temp;
                end--;
            }
        }
    }

    static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }

    public static void main(String[] args) {
        int[] arr = { -12, 11, -13, -5, 6, -7, 5, -3, -6 };

        moveNegPos(arr);
        printArray(arr);
    }
}