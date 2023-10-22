public class students {

    public static int findMin(int[] points, int threshold){

        int min = points[0];
        int courses = 1;
        int slow = 0;
        int fast = 0;
        for(int i=1;i<points.length;){
            // slow = points[i+1] - min;
            // fast = points[i+2] - min;
            slow = points[i] - min;
            if(i+1 < points.length ) fast = points[i+1];
            if(slow >= threshold || fast >= threshold)
            {
                return courses+1;
            }
            else{
                i = i+2;
                courses+=1;
            }
        }

        return points.length;
    }

    public static void main(String[] args) {
        int[] points = {1,2,3};
        int threshold =2;

        System.out.println(findMin(points, threshold));

    }
}
