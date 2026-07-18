// Last updated: 7/18/2026, 9:25:42 PM
class Solution {
    public int countGoodSubstrings(String s) {
        HashMap<Character,Integer> hm = new HashMap<>();
        int l=0;
        int count=0;
        for(int i=0;i<s.length();i++){
            hm.put(s.charAt(i),hm.getOrDefault(s.charAt(i),0)+1);
            if(i-l+1==3){
                if(hm.size()==3){
                    count++;
                }
                hm.put(s.charAt(l),hm.getOrDefault(s.charAt(l),0)-1);
                if(hm.get(s.charAt(l))==0)hm.remove(s.charAt(l));
                l++;
            }
        }
            return count;
    }
}