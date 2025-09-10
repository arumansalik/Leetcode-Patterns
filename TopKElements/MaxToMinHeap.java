package TopKElements;

public class MaxToMinHeap {
    public static void convertToMinHeap(int[] arr) {
        int n = arr.length;

        for(int i = n / 2 - 1; i >= 0; i--) {
            minHeapify(arr, n, i);
        }
    }

    public static void minHeapify(int[] arr, int n, int i) {
        int smallest = i;
        int left = i * 2 + 1;
        int right = i * 2 + 2;

        if(left < n && arr[left] < arr[smallest]) {
            smallest = left;
        }

        if(right < n && arr[right] < arr[smallest]) {
            smallest = right;
        }

        if(smallest != i) {
            int temp = arr[i];
            arr[i] = arr[smallest];
            arr[smallest] = temp;

            minHeapify(arr, n, smallest);
        }
    }

    public static void main(String[] args) {
        int[] minHeap = {9, 8, 5, 7, 3, 2, 4, 6, 1, 0};

        System.out.println("Original Min Heap:");
        printArray(minHeap);

        convertToMinHeap(minHeap);

        System.out.println("Converted Max Heap");
        printArray(minHeap);
    }

    private static void printArray(int[] arr) {
        for (int x : arr) System.out.print(x + " ");
        System.out.println();
    }
}