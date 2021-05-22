+ [Shortest Path in Binary Matrix](#shortest-path-in-binary-matrix/submissions)
<....>
## Shortest Path in Binary Matrix
https://leetcode.com/problems/shortest-path-in-binary-matrix/submissions

```java
class Solution {
    public int shortestPathBinaryMatrix(int[][] grid) {
        int tr = grid.length - 1;
        int tc = grid[0].length - 1;
        if (grid[0][0] == 1 || grid[tr][tc] == 1) return -1;
        class QItem {
            final int row;
            final int col;
            final int dist;

            public QItem(int row, int col, int dist) {
                this.row = row;
                this.col = col;
                this.dist = dist;
            }
        }


        Queue<QItem> queue = new LinkedList<>();
        queue.add(new QItem(0, 0, 1));

        boolean[][] visited = new boolean[grid.length][grid[0].length];
        visited[0][0] = true;

        while (!queue.isEmpty()) {
            QItem x = queue.remove();

            if (x.row == tr && x.col == tc) return x.dist;

//             move west
            if (isValid(x.row - 1, x.col, grid, visited)) {
                queue.add(new QItem(x.row - 1, x.col, x.dist + 1));
                visited[x.row - 1][x.col] = true;
            }
//             move east
            if (isValid(x.row + 1, x.col, grid, visited)) {
                queue.add(new QItem(x.row + 1, x.col, x.dist + 1));
                visited[x.row + 1][x.col] = true;
            }
//             move south
            if (isValid(x.row, x.col + 1, grid, visited)) {
                queue.add(new QItem(x.row, x.col + 1, x.dist + 1));
                visited[x.row][x.col + 1] = true;
            }
//             move north
            if (isValid(x.row, x.col - 1, grid, visited)) {
                queue.add(new QItem(x.row, x.col - 1, x.dist + 1));
                visited[x.row][x.col - 1] = true;
            }
//             move north east
            if (isValid(x.row + 1, x.col - 1, grid, visited)) {
                queue.add(new QItem(x.row + 1, x.col - 1, x.dist + 1));
                visited[x.row + 1][x.col - 1] = true;
            }
//             move south east
            if (isValid(x.row + 1, x.col + 1, grid, visited)) {
                queue.add(new QItem(x.row + 1, x.col + 1, x.dist + 1));
                visited[x.row + 1][x.col + 1] = true;
            }
//             move south west
            if (isValid(x.row - 1, x.col + 1, grid, visited)) {
                queue.add(new QItem(x.row - 1, x.col + 1, x.dist + 1));
                visited[x.row - 1][x.col + 1] = true;
            }
//             move north west
            if (isValid(x.row - 1, x.col - 1, grid, visited)) {
                queue.add(new QItem(x.row - 1, x.col - 1, x.dist + 1));
                visited[x.row - 1][x.col - 1] = true;
            }
        }
        return -1;
    }

    private static boolean isValid(int x, int y, int[][] grid, boolean[][] visited) {
        return x >= 0 && y >= 0 && x < grid.length
                && y < grid[0].length && grid[x][y] == 0
                && !visited[x][y];
    }
}
```