class Solution {
    public double separateSquares(int[][] squares) {
        double low = Double.MAX_VALUE;
        double high = -Double.MAX_VALUE;
        double totalArea = 0.0;

        // Precalculate total overlapping-area (summed normally)
        for (int[] sq : squares) {
            double y = sq[1];
            double l = sq[2];

            low = Math.min(low, y);
            high = Math.max(high, y + l);

            totalArea += l * l;   // area of each square, overlaps counted multiple times
        }

        double target = totalArea / 2.0;

        // Binary search for Y-coordinate
        for (int iter = 0; iter < 80; iter++) {
            double mid = (low + high) / 2.0;
            double area = areaBelow(mid, squares);

            if (area < target) {
                low = mid;
            } else {
                high = mid;
            }
        }

        return (low + high) / 2.0;
    }

    private double areaBelow(double Y, int[][] squares) {
        double sum = 0.0;

        for (int[] sq : squares) {
            double y = sq[1];
            double l = sq[2];

            if (Y <= y) {
                // line is below square
                continue;
            } else if (Y >= y + l) {
                // full area counted
                sum += l * l;
            } else {
                // partial cut
                sum += (Y - y) * l;
            }
        }

        return sum;
    }
}
