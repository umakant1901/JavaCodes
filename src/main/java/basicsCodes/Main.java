package basicsCodes;

import DSA.sorting.BubbleSortingCode;
import DSA.sorting.InsertionSortingCode;
import DSA.sorting.MergeSortingCode;
import DSA.sorting.SelectSortingCode;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world...!");

        int[] arr= {4,6,2,5,1,9,3};

        System.out.println("Before Sort");
        for(int ele:arr)
        {
            System.out.print(ele+" ");
        }

        MergeSortingCode msc=new MergeSortingCode();


        System.out.println();
        System.out.println("After Sort");


        for(int ele:msc.mergeSort(arr,0,arr.length-1))
        {
            System.out.print(ele+" ");
        }



//        System.out.println("Before Sorting...!");
//        for(int ele:arr)
//        {
//            System.out.print(ele+" ");
//        }
//
//        System.out.println();
//        InsertionSortingCode isc=new InsertionSortingCode();
//        System.out.println("After Sorting");
//        for(int ele: isc.getSortingByInsertionSort(arr))
//        {
//            System.out.print(ele+" ");
//        }




//        System.out.println("Before sorting...!");
//
//        for (int ele:arr)
//        {
//            System.out.print(ele+" ");
//        }
//        System.out.println();
//        SelectSortingCode ssc=new SelectSortingCode();
//        System.out.println("After sorting...!");
//        for (int ele: ssc.getSortingBySelectSort(arr))
//        {
//            System.out.print(ele+" ");
//        }






//        for(int ele:arr)
//        {
//            System.out.print(ele +" , ");
//        }
//        System.out.println();
//        BubbleSortingCode bsc=new BubbleSortingCode();
//        System.out.println("After sorting...!");
//        for(int sortedEle: bsc.getBubbleSortedArray(arr))
//        {
//            System.out.print(sortedEle +" , ");
//        }
    }
}
