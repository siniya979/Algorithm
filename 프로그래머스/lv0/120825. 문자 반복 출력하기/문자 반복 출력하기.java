import java.util.ArrayList;
import java.util.List;

class Solution {
    public String solution(String my_string, int n) {
        
        String answer = "";
        List<String> str = new ArrayList<>();
        
        for(int i = 0; i < my_string.length(); i++) {
            for(int j = 0; j<n; j++) {
                str.add(String.valueOf(my_string.charAt(i)));
            }
        }
        
        for(String a : str) {
            answer += a;
        }
        
        return answer;
    }
}