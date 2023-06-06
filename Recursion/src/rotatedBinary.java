public class rotatedBinary {

    static int search(int[] arr, int target)
    {
        return helper(arr, target, 0, arr.length-1);
    }

    static int helper(int[] arr, int target, int start, int end)
    {
        int mid =start + (end - start)/2;

        if(arr[mid] == target)
            return mid;

        if(arr[start] <= arr[mid])
        {
            if(arr[start] >= target && arr[mid] <= target)
                return helper(arr, target, start, mid+1);
            else
                return helper(arr, target, mid+1, end);
        }

        if(arr[mid] >= target && arr[mid] <= end)
        {
            return helper(arr,target,mid+1, end);
        }

        return helper(arr, target, start,mid-1);
    }
    public static void main(String[] args) {

        int[] arr = {5,6,1,2,3,4};

        System.out.println("Element found at: " + search(arr,6));
    }
}
