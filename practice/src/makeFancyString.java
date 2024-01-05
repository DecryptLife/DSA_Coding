class Solution {
    public String makeFancyString(String s) {
        int count = 1;
        char curr = s.charAt(0);
        // Stack<Character> stack = new Stack<Character>();
        String result = ""+s.charAt(0);

        for(int i =1 ;i<s.length();i++){
            char ch = s.charAt(i);

            if(ch == curr){
                count++;
                if(count < 3) result += ch;
            }
            else{
                count = 1;
                curr = ch;
                result += ch;
            }
        }
        return result;
        
    }
}