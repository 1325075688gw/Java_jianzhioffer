package com.biggw.niuke;


public class 判断路径中是否有单词 {
    public static void main(String[] args) {
        判断路径中是否有单词 obj = new 判断路径中是否有单词();
        char[] matrix = "ABCESFCSADEE".toCharArray();
        int rows = 3;
        int cols = 4;
        char[] str = "ATYEHD".toCharArray();
        boolean b = obj.hasPath(matrix, rows, cols, str);
        System.out.println(b);
    }


    public boolean hasPath(char[] matrix, int rows, int cols, char[] str) {
        if (rows == 0 || cols == 0) {
            return false;
        }
        boolean[] visited = new boolean[matrix.length];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                int index = 0;
                if (func(matrix.clone(), index, i, j, rows, cols, visited, str)) {
                    return true;
                }
            }
        }
        return false;
    }

    public boolean func(char[] matrix, int index, int i, int j, int rows, int cols, boolean[] visited, char[] str) {
        // 这儿应该为列，而不是行
        int cur = i * cols + j;
        if (i < 0 || i >= rows || j < 0 || j >= cols || visited[cur] || matrix[cur] != str[index]) {
            return false;
        }

        if (index == str.length - 1) {
            return true;
        }

        visited[cur] = true;
        boolean a = func(matrix, index+1, i + 1, j, rows, cols, visited, str);
        boolean b = func(matrix, index+1, i - 1, j, rows, cols, visited, str);
        boolean c = func(matrix, index+1, i, j + 1, rows, cols, visited, str);
        boolean d = func(matrix, index+1, i, j - 1, rows, cols, visited, str);

        if (a || b || c || d) {
            return true;
        }
        // 走过的路我们要还原，因为我们再一次路径中，撞到墙了，可以回头，转向继续走，过一会还可以走这个地方
        visited[cur] = false;
        return false;
    }
}
