/**
 * OPTIMAL
 * TC - O(n)
 * AS - O(n)
 */
class Solution {
    public String addBinary(String s1, String s2) {
        int n = s1.length();
        int m = s2.length();
        int p1 = n-1;
        int p2 = m-1;
        int carry = 0;
        StringBuilder sb = new StringBuilder();
        
        while(p1 >= 0 || p2 >= 0 || carry == 1){
            int bit1 = (p1 >= 0) ? s1.charAt(p1)-'0' : 0;
            int bit2 = (p2 >= 0) ? s2.charAt(p2)-'0' : 0;
            int result = bit1+bit2+carry;
            
            sb.append(result%2);
            carry = result/2;
            
            p1--;
            p2--;
        }
        
        p1 = sb.length()-1;
        
        while(p1 >= 0 && sb.charAt(p1) == '0'){
            sb.deleteCharAt(p1);
            p1--;
        }
        
        return sb.reverse().toString();
    }