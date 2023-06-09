package subsets;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class subsetNoRec {

    static List<List<Integer>> subset(int[] arr)
    {
        List<List<Integer>> list= new ArrayList<>();

        list.add(new ArrayList<>());
        for(int num: arr)
        {
            int n = list.size();

            for(int i=0;i<n;i++)
            {
                List<Integer> subset = new ArrayList<>(list.get(i));
                subset.add(num);
                list.add(subset);

            }
        }

        return list;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3};

        System.out.println(subset(arr));
    }
}
