public class selectionSort {

    static int[] sort(int[] arr)
    {
        int start = 0;
        int end = arr.length-1;

        return helper(arr, start, end, 0);
    }

    static int[] helper(int[] arr, int start, int end, int pos)
    {
        if(end == 0)
            return arr;


        if(start < end)
        {
            if(arr[start] > arr[pos])
                pos = start;

            return helper(arr, start+1, end, pos);
        }
        else
        {
            int temp = arr[pos];
            arr[pos] = arr[end];
            arr[end] = temp;
            return helper(arr, 0, end-1,0);
        }
    }

    public static void main(String[] args) {
        int[] arr= { 10,8,100,2,7,3};

        int[] sorted = sort(arr);

        for(Integer ele: sorted)
            System.out.print(ele+" ");

        System.out.println();
    }
}
