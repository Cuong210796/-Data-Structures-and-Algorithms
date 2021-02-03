package com.company;

import java.util.Arrays;

public class Letcode733 {

    static boolean[][] daDuyet;
    static int nRow, nCol;

    static public void DFS(int[][] image, int i, int j, int oldColor, int newColor){
        // Xét dk hợp lệ
        if (i < 0 || i >= nRow || j < 0 || j >= nCol){
            return;
        }
        // Chi xét các điểm chưa được duyệt
        if (daDuyet[i][j] == true || image[i][j] != oldColor){
            return;
        }
        // Đổi màu
        image[i][j] = newColor;
        // Đã duyệt
        daDuyet[i][j] = true;
        //Đệ quy đến các đỉnh kề
        DFS(image, i + 1, j, oldColor, newColor);
        DFS(image, i - 1, j, oldColor, newColor);
        DFS(image, i , j + 1, oldColor, newColor);
        DFS(image, i, j - 1, oldColor, newColor);

    }

    static public int[][] floodFill(int[][] image, int sr, int sc, int newColor) {
        nRow = image.length;
        nCol = image[0].length;

        daDuyet = new boolean[nRow][nCol];
        int oldColor = image[sr][sc];
        DFS(image, sr, sc, oldColor, newColor);

        return image;
    }

    public static void main(String[] args) {
        int[][] image = {{1,1,1},{1,1,0},{1,0,1}};
        System.out.println(Arrays.deepToString(floodFill(image, 1, 1, 2)));
    }
}
