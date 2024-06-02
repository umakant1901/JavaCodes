package DSA.sorting;

public class MergeSortingCode {
    /*
    The Merge Sort algorithm is a sorting algorithm that is based on
    the Divide and Conquers paradigm.
    In this algorithm, the array is initially divided into
    two equal halves and then they are combined in a sorted manner.

    Here's how it works:

    Divide: The input array is repeatedly divided into halves until
    each half contains only one element. This is the base case of the recursion.

    Conquer: Once the array is divided into single-element halves,
    they are considered sorted.

    Combine: The sorted halves are then merged back together
     by comparing the elements from each half
     and placing them in the correct order into a new array.
     This process of merging ensures that the resulting array is sorted.
     */
    public int[] mergeSort(int[] arr, int l, int r) {
        if (l < r) {
            // Find the middle point to divide the array into two halves
            int m = (l + r) / 2;

            // Call mergeSort for each half recursively
            mergeSort(arr, l, m);
            mergeSort(arr, m + 1, r);

            // Merge the sorted halves
            merge(arr, l, m, r);


        }return arr;
    }

    static int[] merge(int[] arr, int l, int m, int r) {
        // Sizes of two subarrays to be merged
        int n1 = m - l + 1;
        int n2 = r - m;

        // Create temporary arrays
        int[] L = new int[n1];
        int[] R = new int[n2];

        // Copy data to temporary arrays L[] and R[]
        for (int i = 0; i < n1; ++i)
            L[i] = arr[l + i];
        for (int j = 0; j < n2; ++j)
            R[j] = arr[m + 1 + j];

        // Merge the temporary arrays
        int i = 0, j = 0;
        int k = l;
        while (i < n1 && j < n2) {
            if (L[i] <= R[j]) {
                arr[k] = L[i];
                i++;
            } else {
                arr[k] = R[j];
                j++;
            }
            k++;
        }

        // Copy remaining elements of L[] if any
        while (i < n1) {
            arr[k] = L[i];
            i++;
            k++;
        }

        // Copy remaining elements of R[] if any
        while (j < n2) {
            arr[k] = R[j];
            j++;
            k++;
        }
        return arr;
    }
}
