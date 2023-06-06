public class arraySorted {

//    static boolean isSorted(int[] arr)
//    {
//        for(int i=0;i<arr.length-1;i++)
//        {
//            if(arr[i] > arr[i+1])
//                return false;
//        }
//
//        return true;
//    }

    static boolean isSorted(int[] arr)
    {

        return helper(arr,0);
    }

    static boolean helper(int[] arr, int pos)
    {
        if(pos == arr.length - 1)
            return true;

        if(arr[pos] > arr[pos+1])
            return false;
        else
            return helper(arr, pos+1);
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,7,8,10,9};

        System.out.println("Array Sorted? "+ isSorted(arr));
    }
}
