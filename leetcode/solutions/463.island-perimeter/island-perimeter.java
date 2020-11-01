class Solution {
    public int islandPerimeter(int[][] grid) {
        int res = 0;
        for (int row = 0; row < grid.length; row++) {
            for (int col = 0; col < grid[0].length; col++) {
                if (grid[row][col] == 1) {
                    res += calculateEdge(grid, row, col);
                }
            }
        }
        return res;
    }

    public int calculateEdge(int[][] grid, int row, int col) {
        int res = 0;
        if (row == 0) res++;
        if (col == 0) res++;
        if (row == grid.length - 1) res++;
        if (col == grid[0].length - 1) res++;
        if (row > 0 && grid[row - 1][col] == 0) res++;
        if (row < grid.length - 1 && grid[row + 1][col] == 0) res++;
        if (col > 0 && grid[row][col - 1] == 0) res++;
        if (col < grid[0].length - 1 && grid[row][col + 1] == 0) res++;
        return res;
    }
}