public class linearSrch {

    public static int search(int[] arr,int num)
    {
        return helper(arr,num, 0);
    }
    static int helper( int[] arr, int num, int index)
    {
        if(index == arr.length)
            return -1;

        if(arr[index] == num)
            return index;
        else
            return helper(arr, num, index+1);
    }
    public static void main(String[] args) {
        int[] arr = {3,6,4,84,32,65};

        if(search(arr,65) != -1)
            System.out.println("Element found at: "+(search(arr,65)+1));
        else
            System.out.println("Element not present in array");
    }
}
