public class contiguousArr {


    public static boolean checkC(int[] arr, int n, int k){

        for(int i = 0; i<arr.length;){

            if(arr[i] == n){
                int steps = checkCont(arr, i,n,k);
                if(steps == 0)
                    return true;
                else
                    i = i + (k - steps);
            }
            else
                i++;
        }

        return false;
    }

    public static int checkCont(int[] arr, int index, int val, int count){

        if(index +  count > arr.length)
            return count;

        for(int i = index; i< i+count;i++){
            if(arr[i] != val)
                return count;
            count--;
            val++;
        }

        return 0;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,2,3,2,4,5,6};
        int n = 2;
        int k = 4;

        if(checkC(arr,n,k))
            System.out.println("Contiguous array");
        else
            System.out.println("Not contiguous array");
    }
}
