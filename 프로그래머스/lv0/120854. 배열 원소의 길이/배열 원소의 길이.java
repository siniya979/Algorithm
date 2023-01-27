class Solution {
    public int[] solution(String[] strlist) {
        return Arrays.stream(strlist).mapToInt(String::length).toArray();
    }
}

/*
 int[] answer = new int[strlist.length];
        for(int i = 0; i < strlist.length; i++){
            answer[i] = strlist[i].length();
        }
        return answer;
*/
