import java.util.Arrays;
import java.util.Comparator;

public class no_overlap_interval {

    public static int eraseOverlapIntervals(int[][] intervals) {

        Arrays.sort(intervals, new Comparator<int[]>(){

            public int compare(int[] a, int[] b)
            {
                return a[0] - b[0];
            }
        });

        int count =  0;
        int[] prev = intervals[0];
        for(int i=1;i<=intervals.length -1;i++){

            // storing the first and second element
            int[] curr = intervals[i];

            // check if starts are same
            if(prev[0] == curr[0] || prev[1] > curr[0] ){
                // first bigger end
                if(prev[1] > curr[1])
                    prev = curr;
                count += 1;
            }
            else
            {
                // all good proceed, make curr the prev one
                prev = curr;
            }
        }

        return count;

    }

    public static void main(String[] args) {
        int[][]  intervals = {
            {1,2},{2,3},{3,4},{1,2},
        };

        System.out.println(eraseOverlapIntervals(intervals));
    }
}
