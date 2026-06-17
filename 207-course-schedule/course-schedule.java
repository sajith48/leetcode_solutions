class Solution {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        ArrayList<ArrayList<Integer>> graph = new ArrayList<>();
        for(int i=0;i<numCourses;i++){
            graph.add(new ArrayList<>());
        }
        int[] indegree = new int[numCourses];
        for(int[]edge : prerequisites){
            int u = edge[0];
            int v = edge[1];
            graph.get(u).add(v);
            indegree[v]++;
        }  
        Queue<Integer> q = new LinkedList<>();
        for(int i=0;i<numCourses;i++){
            if(indegree[i]==0)q.offer(i);
        }
        int count=0;
        while(!q.isEmpty()){
            int curr = q.poll();
            count++;
            for(int nbr : graph.get(curr)){
                indegree[nbr]--;
                if(indegree[nbr]==0)q.offer(nbr);
            }
        }
        return count==numCourses;
    }
}