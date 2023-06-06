import java.util.ArrayList;

public class linearMultiple {

    static ArrayList<Integer> findAll(int[] arr, int ele)
    {
        ArrayList<Integer> occ = new ArrayList<>();
        return helper(arr, ele, 0,occ);
    }

    static ArrayList<Integer> findAll2(int[] arr, int ele)
    {
        return helper2(arr, ele, 0);
    }

    static ArrayList<Integer> helper(int[] arr, int ele, int index, ArrayList<Integer> occ)
    {
        if(index == arr.length)
            return occ;

        if(arr[index] == ele)
            occ.add(index+1);

        return helper(arr, ele, index+1, occ);

    }

    static ArrayList<Integer> helper2(int[] arr, int ele, int index)
    {
        ArrayList<Integer> list = new ArrayList<>();

        if(index == arr.length)
            return list;

        if(arr[index] == ele)
            list.add(index);

        ArrayList<Integer> ansFromBelow = helper2(arr, ele,index+1);

        list.addAll(ansFromBelow);
        return list;

    }



    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,5,6,7,8};

        System.out.println("Element found at: "+findAll2(arr, 5));
    }
}
