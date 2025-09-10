package TopKElements;

public class CheckMinHeap {
    public static boolean isMinHeap(int[] arr) {
        int n = arr.length;

        for(int i = 0; i <= (n - 2) / 2; i++) {
            int left = 2 * i + 1;
            int right = 2 * i + 2;

            if(left < n && arr[i] > arr[left]) {
                return false;
            }

            if(right < n && arr[i] > arr[left]) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int[] arr = {10, 15, 20, 17, 25};
        int[] arr2 = {10, 5, 20, 15};

        System.out.println(isMinHeap(arr));
        System.out.println(isMinHeap(arr2));
    }
}
