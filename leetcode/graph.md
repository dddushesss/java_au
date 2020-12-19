+ [Course Schedule](#course-schedule)
<....>
## Course Schedule
https://leetcode.com/problems/course-schedule
```java
class Solution {
    public boolean canFinishUtil(int numCourses, ArrayList<Integer>[] adj, int[] indegree) {
        //base case
        boolean is0 = false;
        boolean areAllNegative = true;
        for (int i = 0; i < numCourses; i++) {
            if (indegree[i] == 0) is0 = true;
            if (indegree[i] >= 0) areAllNegative = false;
        }
        if (areAllNegative)
            return true;
        if (!is0)
            return false;

        for (int i = 0; i < numCourses; i++) {
            if (indegree[i] < 0) continue;
            if (indegree[i] == 0) {
                indegree[i] = -1;
                for (int neighbor : adj[i]) {
                    indegree[neighbor]--;
                }
            }
        }
        return canFinishUtil(numCourses, adj, indegree);
    }

    public boolean canFinish(int numCourses, int[][] prerequisites) {

        ArrayList<Integer>[] adj = new ArrayList[numCourses];

        int[] indegree = new int[numCourses];
        for (int i = 0; i < numCourses; i++) adj[i] = new ArrayList<Integer>();
        for (int[] edge : prerequisites) {
            //edge[1] --> edge[0]
            adj[edge[1]].add(edge[0]);
            indegree[edge[0]]++;
        }
        return canFinishUtil(numCourses, adj, indegree);
    }
}
```