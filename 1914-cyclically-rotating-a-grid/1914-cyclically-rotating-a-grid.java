class Solution {
    public int[][] rotateGrid(int[][] grid, int k) {
        int m = grid.length, n = grid[0].length;
        int layers = Math.min(m, n) / 2;

        for (int layer = 0; layer < layers; layer++) {
            // Collect elements of this layer
            List<Integer> ring = new ArrayList<>();
            int top = layer, left = layer, bottom = m - layer - 1, right = n - layer - 1;

            // top row
            for (int j = left; j <= right; j++) ring.add(grid[top][j]);
            // right column
            for (int i = top + 1; i <= bottom; i++) ring.add(grid[i][right]);
            // bottom row
            for (int j = right - 1; j >= left; j--) ring.add(grid[bottom][j]);
            // left column
            for (int i = bottom - 1; i > top; i--) ring.add(grid[i][left]);

            // Rotate the ring
            int len = ring.size();
            int shift = k % len;
            List<Integer> rotated = new ArrayList<>();
            rotated.addAll(ring.subList(shift, len));
            rotated.addAll(ring.subList(0, shift));

            // Put rotated values back
            int idx = 0;
            for (int j = left; j <= right; j++) grid[top][j] = rotated.get(idx++);
            for (int i = top + 1; i <= bottom; i++) grid[i][right] = rotated.get(idx++);
            for (int j = right - 1; j >= left; j--) grid[bottom][j] = rotated.get(idx++);
            for (int i = bottom - 1; i > top; i--) grid[i][left] = rotated.get(idx++);
        }

        return grid;
    }
}
