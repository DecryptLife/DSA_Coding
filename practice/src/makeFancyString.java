class Solution {
    public String makeFancyString(String s) {
        int count = 0;
        char curr = ' ';
        // Stack<Character> stack = new Stack<Character>();
        String result = "";

        for(int i =0 ;i<s.length();i++){
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