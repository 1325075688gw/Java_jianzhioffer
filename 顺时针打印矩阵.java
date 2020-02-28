package com.biggw.niuke;

import com.sun.source.tree.ReturnTree;

import java.util.ArrayList;

public class 顺时针打印矩阵 {
    public static void main(String[] args) {

    }

    public ArrayList<Integer> printMatrix(int[][] matrix) {
        ArrayList<Integer> arrayList = new ArrayList<>();


        if (matrix == null || matrix.length == 0 || (matrix[0].length)==0) {
            return arrayList;
        }

        int row = matrix.length;
        int col = matrix[0].length;

        int up = 0;
        int down = row-1;
        int left = 0;
        int right = col-1;

        while (true) {
            for (int i = left; i < right+1; i++) {
                arrayList.add(matrix[up][i]);
            }
            up++;
            if (up>down) break;
            for (int i = up; i < down+1; i++) {
                arrayList.add(matrix[i][right]);
            }
            right--;
            if (right<left) break;

            for (int i = right; i >= left; i--) {
                arrayList.add(matrix[down][i]);
            }
            down--;
            if (down<up) break;

            for (int i = down; i >= up; i--) {
                arrayList.add(matrix[i][left]);
            }
            left++;
            if (left>right) break;
        }
        return arrayList;
    }
}
