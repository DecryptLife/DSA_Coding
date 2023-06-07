public class bubblesort {

    public static int[] sort(int[] arr)
    {
        int start = 0;
        int end = arr.length;

        return helper(arr, start, end);
    }

    static int[] helper(int[] arr, int start, int end)
    {
        if(end == 0)
            return arr;

        if(start >= arr.length-1)
        {
            return helper(arr, 0, end-1);
        }

        if(arr[start] > arr[start+1]) {
            int temp = arr[start];
            arr[start] = arr[start + 1];
            arr[start + 1] = temp;
        }

        return helper(arr, start+1, end);
    }


    public static void main(String[] args) {
        int[] arr = {21,24,3,100,7,8,9};

        int[] sorted  = sort(arr);
        System.out.println("Array after sorting: ");

        for(Integer ele: sorted)
        {
            System.out.print(ele+" ");
        }

        System.out.println();

    }
}
