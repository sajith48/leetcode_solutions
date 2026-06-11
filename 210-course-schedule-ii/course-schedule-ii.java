class Solution {
    public int[] findOrder(int numCourses, int[][] prerequisites) {
        ArrayList<ArrayList<Integer>> graph = new ArrayList<>();
        for (int i = 0; i < numCourses; i++) {
            graph.add(new ArrayList<>());
        }
        
        int[] indegree = new int[numCourses];
        for (int[] pre : prerequisites) {
            int u = pre[0];
            int v = pre[1];
            graph.get(v).add(u);
            indegree[u]++;
        }
        
        ArrayList<Integer> ans = new ArrayList<>();
        Queue<Integer> q = new LinkedList<>(); 
        
        for (int i = 0; i < numCourses; i++) {
            if (indegree[i] == 0) q.offer(i);
        }
        
        while (!q.isEmpty()) {
            int curr = q.poll();
            ans.add(curr);
            for (int nbr : graph.get(curr)) {
                indegree[nbr]--;
                if (indegree[nbr] == 0) q.offer(nbr);
            }
        }
        
        if (ans.size() != numCourses) return new int[0];
        int[] arr = new int[ans.size()]; 
        for (int i = 0; i < ans.size(); i++) {
            arr[i] = ans.get(i); 
        }
        
        return arr;
    }
}
