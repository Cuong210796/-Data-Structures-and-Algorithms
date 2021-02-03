package com.company;

public class Letcode200 {

    private static boolean[][] daDuyet;

    public static void duyetDFS(int i, int j, char[][] grid){
        // xét hợp lệ
        int nRow = grid.length;
        int nCol = grid[0].length;
        if (i < 0 || i >= nRow || j< 0 || j >= nCol){
            return;
        }
        if (daDuyet[i][j] == true || grid[i][j] == '0'){
            return;
        }

        // đánh dấu đã duyệt [i][j]

        daDuyet[i][j] = true;
        duyetDFS(i+1,j,grid);
        duyetDFS(i-1,j,grid);
        duyetDFS(i,j+1,grid);
        duyetDFS(i,j-1,grid);
    }

    static public int numIslands(char[][] grid) {
        int nRow = grid.length;
        int nCol = grid[0].length;
        int count = 0;
        daDuyet = new boolean[nRow][nCol];
        for (int i = 0; i < nRow; i++) {
            for (int j = 0; j < nCol ; j++) {
                if (grid[i][j] == '1' && daDuyet[i][j] == false){
                    count++;
                    duyetDFS(i,j,grid);
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
      char[][]  grid = {
                {'1', '1', '1', '1', '0'},
                {'1', '1', '0', '1', '0'},
                {'0', '0', '1', '0', '0'},
                {'0', '0', '0', '1', '1'},
                };
        System.out.println(numIslands(grid));
    }
}
