class Solution {
    public int minAddToMakeValid(String s) {
        int answer = 0;
        int balance = 0;
        
        for(int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if(c == '(') {
                balance += 1;
            } else {
                balance -= 1;
            }
            
            if(balance == -1) {
                answer++;
                balance++;
            }
        }
        
        return answer + balance;
    }
}