public class peak_idx_mountain {

        public static int peakIndexInMountainArray(int[] arr) {

            if(arr.length < 3)
                return -1;



            int length = arr.length-1;
            int index = -1;
            int max = Math.max(arr[0], arr[length]);

            for(int i=1;i<=arr.length/2; i++)
            {
                if(max < Math.max(arr[i],arr[length-i]))
                {
                    max = Math.max(arr[i],arr[length - i]);
                    if(arr[i] > arr[length - i])
                        index = i;
                    else
                        index = length - i;
                }
            }

            return index;
        }

    public static void main(String[] args) {

            int[] arr = {0,10,5,2};

        System.out.println(peakIndexInMountainArray(arr));
    }
}
