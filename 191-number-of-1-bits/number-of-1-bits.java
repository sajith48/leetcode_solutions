class Solution {
    public int hammingWeight(int n) {
        // Convert the integer into a binary string
        String binaryString = Integer.toBinaryString(n);
        
        // Count the '1' 
        int count = 0;
        for (int i = 0; i < binaryString.length(); i++) {
            if (binaryString.charAt(i) == '1') {
                count++;
            }
        }
        return count;
    }
}
