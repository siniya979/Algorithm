class Solution {
    public int solution(int[] sides) {
        
        for(int i=0; i<sides.length; i++) {
			for(int j=i+1; j<sides.length; j++) {
				if(sides[i] < sides[j]) {
					int tmp = sides[i];
					sides[i] = sides[j];
					sides[j] = tmp;
				}
			}
		}
        
        return sides[0]<sides[1]+sides[2]?1:2;
    }
}
