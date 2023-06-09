package sort;

import java.util.ArrayList;
import java.util.Arrays;

public class mergeSort {


    static int[] sort(int[] arr)
    {
        if(arr.length == 1)
            return arr;

        int mid = arr.length/2;

        int[] left = sort(Arrays.copyOfRange(arr,0,mid));
        int[] right = sort(Arrays.copyOfRange(arr,mid,arr.length));

        return merge(left,right);

    }

    public static int[] merge(int[] first, int[] second)
    {
        int[] sort = new int[first.length + second.length];

        int i = 0;
        int j = 0;
        int k = 0;

        while(i< first.length && j <second.length)
        {
            if(first[i] <= second[j])
            {
                sort[k] = first[i];
                i++;
            }
            else
            {
                sort[k] = second[j];
                j++;
            }
            k++;
        }

        while(i < first.length)
        {
            sort[k] = first[i];
            i++;
            k++;
        }

        while(j<second.length)
        {
            sort[k] = second[j];
            j++;
            k++;
        }

        return sort;

    }

    public static void main(String[] args) {

        int[] arr = {8,3,4,12,5,6};

        int[] sort  = sort(arr);

        for(int ele: sort)
        {
            System.out.print(ele+" ");
        }

        System.out.println();
    }
}
