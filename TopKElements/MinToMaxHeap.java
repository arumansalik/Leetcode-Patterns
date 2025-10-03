package TopKElements;

public class MinToMaxHeap {
    public static void convertToMaxHeap(int[] arr) {
        int n = arr.length;

        for(int i = n / 2 - 1; i >= 0; i--) {
            maxHeapify(arr, n, i);
        }
    }

    public static void maxHeapify(int[] arr, int n, int i) {
        int largest = i;
        int left = i * 2 + 1;
        int right = i * 2 + 2;

        if(left < n && arr[left] > arr[largest]) {
            largest = left;
        }

        if(right < n && arr[right] > arr[largest]) {
            largest = right;
        }

        if(largest != i) {
            int temp = arr[i];
            arr[i] = arr[largest];
            arr[largest] = temp;

            maxHeapify(arr, n, largest);
        }
    }

    public static void main(String[] args) {
        int[] minHeap = {1, 3, 5, 7, 9, 2, 4, 6, 8, 0};

        System.out.println("Original Min Heap:");
        printArray(minHeap);

        convertToMaxHeap(minHeap);

        System.out.println("Converted Max Heap");
        printArray(minHeap);
    }

    private static void printArray(int[] arr) {
        for (int x : arr) System.out.print(x + " ");
        System.out.println();
    }
}