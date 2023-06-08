import java.util.Arrays;

public class mergeSort2 {

    static void sort(int[] arr,int start, int end )
    {
        if(end-start== 1)
            return;

        int mid = (start+end)/2;

        sort(arr,start,mid);
        sort(arr,mid,end);

        mergeInPlace(arr,start,mid,end);

    }

    public static void mergeInPlace(int[] arr, int start, int mid, int end)
    {
        int[] sort = new int[end-start];

        int i = start;
        int j = mid;
        int k = 0;

        while(i< mid && j <end)
        {
            if(arr[i] <= arr[j])
            {
                sort[k] = arr[i];
                i++;
            }
            else
            {
                sort[k] = arr[j];
                j++;
            }
            k++;
        }

        while(i < mid)
        {
            sort[k] = arr[i];
            i++;
            k++;
        }

        while(j<end)
        {
            sort[k] = arr[j];
            j++;
            k++;
        }

        for(int m =0 ; m < sort.length;m++)
        {
            arr[start+m] = sort[m];

        }


    }
    public static void main(String[] args) {
        int[] arr = {9,4,10,12,22,38,1};

        sort(arr,0,arr.length);

        System.out.println(Arrays.toString(arr));
    }
}
