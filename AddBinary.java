class Solution {
    public String addBinary(String a, String b) {
        int x = Integer.parseInt(a,2);
        int y = Integer.parseInt(b,2);
        int p = x+y;
        return Integer.toBinaryString(p);
        
    }
}
