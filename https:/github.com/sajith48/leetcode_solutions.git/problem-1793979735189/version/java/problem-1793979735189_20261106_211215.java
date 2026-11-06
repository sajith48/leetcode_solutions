// Last updated: 11/6/2026, 9:12:15 PM
1class Solution {
2    public int maxProduct(int n) {
3        List<Integer> al = new ArrayList<>();
4        while(n!=0){
5            al.add(n%10);
6            n/=10;
7        }
8        Collections.sort(al);
9        
10        int size = al.size();
11        return al.get(size - 1) * al.get(size - 2);
12    }
13}