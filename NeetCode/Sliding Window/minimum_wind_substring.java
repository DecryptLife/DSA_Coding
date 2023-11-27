class Solution {

   
    public String minWindow(String s, String t) {

        Map<Character, Integer> mpt = new HashMap<>();

        Map<Character, Integer> mps = new HashMap<>();

       for(char ch:t.toCharArray()){
           mpt.put(ch, mpt.getOrDefault(ch,0)+1);
       }

       int i =0; int j=0;
       int have = 0; int need = mpt.size();
       int min = Integer.MAX_VALUE;
       String str = "";
       while(j<s.length()){
           char ch = s.charAt(j);

           if(mpt.containsKey(ch)){
               mps.put(ch, mps.getOrDefault(ch,0)+1);

               if(mps.get(ch).equals(mpt.get(ch))){ 
                   have++;
                }
           }

           while(have == need){
               char left = s.charAt(i);
               if(j-i+1 < min){
                    min = j-i +1;
                    str = s.substring(i,j+1); 
               }
               if(mpt.containsKey(left)){

                   mps.put(left, mps.get(left)-1);
                   if(mps.get(left) < mpt.get(left)){ 
                         have--;
                    }
               }
               i++;
           }

           j++;

       }

       return str;
    }
}