package com.biggw.niuke;

public class 机器人运动范围 {
    int count;

    public int movingCount(int threshold, int rows, int cols)
    {
        if (threshold == 0) {
            return 1;
        }

        boolean[] visited = new boolean[rows*cols];

        func(threshold, 0,0,rows, cols, visited);
        return count;
    }

    public int func(int threshold, int i,int j,int rows, int cols, boolean[] visited){
        if (i<0||i>=rows||j<0||j>=cols||sum(i)+sum(j)>threshold||visited[i*cols+j]){
            return 0;
        }
        // 这一个题我们不需要返回重新走，所以不需要将visited重置为原来的值
        visited[i*cols+j]=true;
        count++;
        int a = func(threshold, i+1,j,rows,cols,visited);
        int b = func(threshold, i-i,j,rows,cols,visited);
        int c = func(threshold, i,j+1,rows,cols,visited);
        int d = func(threshold, i,j-1,rows,cols,visited);
        return a+b+c+d;
    }

    public int sum(int i) {
        int tmp = 0;
        do {
            tmp += i%10;
        }while ((i=i/10) >0);
        return tmp;
    }
}
