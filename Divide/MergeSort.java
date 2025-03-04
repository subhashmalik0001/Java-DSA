
public class MergeSort {

    public static void printArr(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void mergeSort(int arr[], int si, int ei) {
        if (si >= ei) {
            return;
        }

        int mid = si + (ei - si) / 2;
        mergeSort(arr, si, mid); // left
        mergeSort(arr, mid + 1, ei); // right
        merge(arr, si, mid, ei);
    }

    public static void merge(int arr[], int si, int mid, int ei) {
        int temp[] = new int[ei - si + 1];
        int i = si; // starting index for the left part
        int j = mid + 1; // starting index for the right part
        int k = 0; // index for the temporary array

        // Merge both halves into temp[]
        while (i <= mid && j <= ei) {
            if (arr[i] < arr[j]) {
                temp[k] = arr[i];
                i++;
            } else {
                temp[k] = arr[j];
                j++; // FIX: Ensure j is incremented
            }
            k++;
        }

        // Copy remaining elements of the left half
        while (i <= mid) {
            temp[k++] = arr[i++];
        }

        // Copy remaining elements of the right half
        while (j <= ei) {
            temp[k++] = arr[j++];
        }

        // Copy sorted elements back to the original array
        for (k = 0, i = si; k < temp.length; k++, i++) {
            arr[i] = temp[k];
        }
    }

    public static void main(String[] args) {
        int arr[] = {6, 3, 9, 5, 2, 8};
        mergeSort(arr, 0, arr.length - 1);
        printArr(arr);
    }
}
