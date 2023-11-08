class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        
        List<List<String>> res = new ArrayList<>();

        HashMap<String, List<String>> hash = new HashMap<>();
        int count  = 0;

        for(int i=0;i<strs.length;i++){
            String s = strs[i];

            char[] sch = s.toCharArray();

            Arrays.sort(sch);
            String sorted = new String(sch);
            
            if(!hash.containsKey(sorted)) hash.put(sorted, new ArrayList<>());

            hash.get(sorted).add(s);
        }

        return new ArrayList<>(hash.values());
    }
}