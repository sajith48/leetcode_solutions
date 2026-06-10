class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
       List<List<Integer>> result = new ArrayList<>();
       findcom(0,result,target,candidates,new ArrayList<>());
       return result; 
    }
    public void  findcom(int index,List<List<Integer>>result,int target,int[]candidates,List<Integer>current){
        if(target==0){
            result.add(new ArrayList<>(current));
            return;
        }
        if(index==candidates.length || target<0)return;
        if(candidates[index]<=target){
            current.add(candidates[index]);
            findcom(index,result,target-candidates[index],candidates,current);
            current.remove(current.size()-1);
        }
        findcom(index+1,result,target,candidates,current);
    }
}