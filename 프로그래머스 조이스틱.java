class Solution {
    public int solution(String name) {
        int answer = 0;
        int cost = name.length() - 1;
        for(int i = 0; i < name.length(); i++) {
            char dst = name.charAt(i);
            int count = 0;
            
            if(dst != 'A') {
                count = min(dst);
            }
            answer += count;
            
            int nextIndex = i + 1;
            while(nextIndex < name.length() && name.charAt(nextIndex) == 'A') {
                nextIndex++;
            }
            cost = Math.min(cost, (i * 2) + name.length() - nextIndex);
        }
        answer += cost;
        return answer;
    }
    int min(char dst) {
        return Math.min(dst - 'A', ('Z' - 'A' + 1) - (dst - 'A'));
    }
}
