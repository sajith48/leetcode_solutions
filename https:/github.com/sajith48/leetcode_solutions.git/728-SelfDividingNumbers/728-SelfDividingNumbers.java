// Last updated: 7/18/2026, 9:27:09 PM
class Solution {
    public boolean isSelf(int n){
        int temp = n;
        while(temp!=0){
            int d = temp%10;
            if(d==0 || n%d!=0)return false;
            temp/=10;
        }
        return true;
    }
    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> al = new ArrayList<>();
        for(int i=left; i<=right;i++){
            if(isSelf(i))al.add(i);
        }
        return al;
    }
}