public class binarysearch {

    public static void main(String[] args) {
        int arr[] = {1,4,5,6,7,20,33,45,60,80,95};
        int ele = 33;

        int pos = binSearch(arr,ele,0,arr.length-1);

        if(pos == -1)
            System.out.println("Element not found");
        else
            System.out.println("Element found at: "+pos);
    }

    static int binSearch(int[] arr,int ele, int lb, int  ub)
    {
        int mid = (ub + lb)/2;
        if(arr[mid] == ele)
        {
            return mid;
        }

        if(arr[mid] > ele)
        {
            return binSearch(arr, ele, lb, mid);
        }
        else
        {
            return binSearch(arr,ele,mid,ub);
        }


    }
}
