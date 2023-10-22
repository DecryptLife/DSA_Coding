import java.util.ArrayList;
import java.util.List;
import java.util.TreeSet;

public class pushPop {
    
    public static List<Long> solution(List<String> operations, List<Integer> x){
        List<Long> results = new ArrayList<>();
        TreeSet<Integer> maxmin = new TreeSet<>();

        for(int i=0; i<operations.size();i++){
            int val = x.get(i);

            if(operations.get(i).equals("push")) maxmin.add(val);
            else maxmin.remove(val);

            long prod = (long) maxmin.first() * maxmin.last();
            results.add(prod);
        }

        return results;
    }
    public static void main(String[] args) {
        List<String> operations = new ArrayList<>();
        operations.add("push");
        operations.add("push");
        operations.add("push");
        operations.add("pop");

        List<Integer> x =  new ArrayList<>();
        x.add(1);
        x.add(2);
        x.add(3);
        x.add(1);

        System.out.println(solution(operations,x));
    }
}
