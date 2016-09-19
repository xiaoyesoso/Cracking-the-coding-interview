import java.util.*;

public class Transform {
    public int[][] transformImage(int[][] mat, int n) {
        // write code here
        for(int layer = 0 ;layer < n/2 ;++layer)
        {
            int first = layer;
            int last = n - 1 - layer;
            for(int i = first ; i < last ;++i)//最后一个元素不用移动
            {
                int offset = i - first;
                int top = mat[first][i];
                mat[first][i] = mat[last-offset][first];
                mat[last-offset][first] = mat[last][last-offset];
                mat[last][last-offset] = mat[i][last];
                mat[i][last] = top;
            }
        }
        return mat;
    }
}
