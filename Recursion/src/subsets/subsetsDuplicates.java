package subsets;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class subsetsDuplicates {

    static List<List<Integer>> subsetsDup(int[] arr)
    {
        Arrays.sort(arr);
        List<List<Integer>> list= new ArrayList<>();
        list.add(new ArrayList<>());

        int start =0;
        int end = 0;

        for(int i=0;i<arr.length;i++)
        {
            start = 0;

            if(i > 0 && arr[i] == arr[i-1])
            {
                start = end+1;
            }
            end = list.size()+1;

            int n = list.size();

            for(int j=start;j<n;j++)
            {
                List<Integer> subset = new ArrayList<>(list.get(j));
                subset.add(arr[i]);
                list.add(subset);

            }
        }

        return list;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,3};

        System.out.println(subsetsDup(arr));
    }
}
