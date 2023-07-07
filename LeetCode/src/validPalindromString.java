public class validPalindromString {

        public boolean isPalindrome(String s) {
            int left = 0;
            int right = s.length() - 1;

            s = s.toLowerCase();

            char start;
            char end;

            while(left < right)
            {
                start =  s.charAt(left);
                end =  s.charAt(right);


                if(((int)start >= 97 && (int) start <= 122)||((int)start >= 48 && (int) start <= 57))
                {
                    if(((int)end >= 97 && (int) end <= 122)||((int)end >= 48 && (int) end <= 57))
                    {
                        if(start != end)
                            return false;
                        else
                        {
                            left += 1;
                            right -= 1;
                        }
                    }
                    else
                        right -= 1;
                }
                else
                {
                    left += 1;
                }
            }
            return true;
        }

}
