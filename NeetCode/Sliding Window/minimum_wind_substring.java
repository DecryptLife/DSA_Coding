class minimum_window_substring {

    public boolean check(Map<Character, Integer> mpt, Map<Character, Integer> mps ){

        for(Map.Entry<Character, Integer> entry: mpt.entrySet()){
            if(!mps.containsKey(entry.getKey()) || mps.get(entry.getKey()) < entry.getValue()){
                return false;
            }
        }

        return true;
    }
    public String minWindow(String s, String t) {

        Map<Character, Integer> mpt = new HashMap<>();

        Map<Character, Integer> mps = new HashMap<>();

       for(char ch: t.toCharArray()){
           mpt.put(ch, mpt.getOrDefault(ch,0)+1);
       }

       int i=0;int j=0;
       String str = "";
       int ans = Integer.MAX_VALUE;

       while(j<s.length()){
           char ch = s.charAt(j);

           if(mpt.containsKey(ch)){
               if(mps.isEmpty()){
                   i=j;
               }
               mps.put(ch, mps.getOrDefault(ch,0)+1);
           }

           if(j-i+1 >= t.length()){
               if(check(mpt, mps)){
                   if(ans > j- i + 1){
                       str = s.substring(i,j+1);
                       ans = j-i+1;
                   }
                   mps.clear();
                   i = i+1;
                   i = j;
                   continue;
               }
           }

           j++;
       }

       return str;
    }
}