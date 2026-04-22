class Solution{
    public int[] findPeakGrid(int[][] mat){
        int n=mat.length-1;
        int m=mat[0].length-1;
        int row=0;
        int col=0;

        do{
            if(row==0&&col==0){
                if((n==0||mat[0][0]>mat[1][0])&&(m==0||mat[0][0]>mat[0][1])){
                    return new int[]{0,0};
                }
            }else if(row==n&&col==0){
                if((n==0||mat[n][0]>mat[n-1][0])&&(m==0||mat[n][0]>mat[n][1])){
                    return new int[]{n,0};
                }
            }else if(row==0&&col==m){
                if((n==0||mat[0][m]>mat[1][m])&&(m==0||mat[0][m]>mat[0][m-1])){
                    return new int[]{0,m};
                }
            }else if(row==n&&col==m){
                if((n==0||mat[n][m]>mat[n-1][m])&&(m==0||mat[n][m]>mat[n][m-1])){
                    return new int[]{n,m};
                }
            }else if(row==0){
                if((n==0||mat[0][col]>mat[1][col])&&(col==m||mat[0][col]>mat[0][col+1])&&mat[0][col]>mat[0][col-1]){
                    return new int[]{0,col};
                }
            }else if(col==0){
                if((row==n||mat[row][0]>mat[row+1][0])&&(row==0||mat[row][0]>mat[row-1][0])&&mat[row][0]>mat[row][1]){
                    return new int[]{row,0};
                }
            }else{
                if(mat[row][col]>mat[row-1][col]&&(row==n||mat[row][col]>mat[row+1][col])&&mat[row][col]>mat[row][col-1]&&(col==m||mat[row][col]>mat[row][col+1])){
                    return new int[]{row,col};
                }
            }
            col++;
            if(col>m){
                col=0;
                row++;
            }
        }while(row<=n);
        return new int[]{-1,-1};
    }
}