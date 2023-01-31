class Solution {
    public int solution(int[] array, int height) {
        int answer = 0;
        for(int student : array){
            if(student > height)
                answer++;
        }
        return answer;
    }
}