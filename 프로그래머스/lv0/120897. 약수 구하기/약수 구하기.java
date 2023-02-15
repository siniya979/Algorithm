import java.util.ArrayList;
import java.util.List;
class Solution {
    public List<Integer> solution(int n) {
        List<Integer> answer = new ArrayList();
        answer.add(1);
        for(int i=2; i<=n; i++){
            if(n%i == 0)
                answer.add(i);
        }
        return answer;
    }
}