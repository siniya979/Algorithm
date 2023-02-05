class Solution {
    public int solution(int hp) {
        int ants [] = {5,3,1};
        int answer = 0;
        for(int ant : ants){
            if(ant > hp)
                continue;
            answer += hp / ant; 
            hp %= ant;
        }
        
        return answer;
    }
}