package DSA.sorting;

public class BubbleSortingCode {

    /*In-place Sorting :An in-place sorting algorithm uses constant space
     for producing the output (modifies the given array only).
     It sorts the list only by modifying the order of the elements within the list.

     Internal Sorting: Internal Sorting is when all the data is placed
     in the main memory or internal memory.
     In internal sorting, the problem cannot take input beyond its size.

     Stable sorting: When two same data appear in the same order
      in sorted data without changing their position is called stable sort.

    Def: in this, one element take and compare with all values one by one,
    every time once value minimum , swap at that time.

     */

    public int[] getBubbleSortedArray(int []array)
    {
        int size=array.length;
        for(int i=0;i<size-1;i++)
        {
            for(int j=0;j<(size-i-1);j++)
            {
                if(array[j]>array[j+1])
                {
                    int temp=array[j];
                    array[j]=array[j+1];
                    array[j+1]=temp;

                }
            }


        }

        return array;
    }

}
