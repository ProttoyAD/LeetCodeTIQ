package DayTwo;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Solution solution=new Solution();
        System.out.println(solution.lengthOfLongestSubstring("umvejcuuk"));

    }
}

class Solution {
    public int lengthOfLongestSubstring(String s) {
        int ans=1;
        if (s.equals("")){
            ans=0;
        }
        else {
            char[] string = new char[s.length()];
            for (int i = 0; i < s.length(); i++) {
                string[i] = s.charAt(i);
            }
            for (int i = 0; i < string.length; i++) {
                int count = 1;
                ArrayList my = new ArrayList();
                my.add(string[i]);
                for (int j = i + 1; j < string.length; j++) {
                    if (!my.contains(string[j])) {
                        if (string[i] != string[j]) {
                            count++;
                            if (count > ans) {
                                ans = count;
                            }
                            my.add(string[j]);
                        }
                    } else {
                        break;

                    }

                }
            }

        }
       return ans;
    }
}