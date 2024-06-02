package DSA.sorting;

public class SelectSortingCode {

    /* In-place Sorting: An in-place sorting algorithm uses constant space
    for producing the output (modifies the given array only).
    It sorts the list only by modifying the order of the elements within the list.

    Internal Sorting: Internal Sorting is when all the data is placed in
    the main memory or internal memory. In internal sorting,
    the problem cannot take input beyond its size.

    Def: In this, one element compare with other element & find the minimum element
    index value and in end values swap between selected values.


    Selection Sort vs. Bubble Sort: While both selection sort and bubble sort have
    the same time complexity, selection sort typically performs fewer swaps,
     making it more efficient in practice,
     especially when swapping elements is expensive.
     */
    public int[] getSortingBySelectSort(int[] arr) {

        for(int i=0;i<arr.length-1;i++)
        {
            int minIndex =i;

            for(int j=i+1;j<arr.length;j++)
            {
                // Find the index of the minimum element in the remaining array
                if(arr[j]<arr[minIndex])
                {
                    minIndex=j;
                }

            }
            // Swap the minimum element with the first element of the unsorted array
            int temp=arr[minIndex];
            arr[minIndex]=arr[i];
            arr[i]=temp;


        }

        return arr;
    }

}
