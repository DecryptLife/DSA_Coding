import java.util.HashMap;

public class micro1 {

    public static void main(String[] args) {
        
        System.out.println(countWords("Hello, World! Hello, World"));
    
    }

    public static HashMap<String,Integer> countWords(String sentence){

        String[] str = sentence.split("[\\. ,!]");
        HashMap<String, Integer> map = new HashMap<>();
        for(int i=0;i<str.length;i++){

            String s = str[i];
            s = s.toLowerCase();

            if(map.containsKey(s)){
                map.put(s, map.get(s)+1);
            }
            else{
                map.put(s, 1);
            }
        }

        return map;
    }
}
