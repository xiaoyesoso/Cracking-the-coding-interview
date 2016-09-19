import java.util.*;

public class Clearer {
    public int[][] clearZero(int[][] mat, int n) {
        // write code here
        boolean[] row = new boolean[mat.length];
        boolean[] column = new boolean[mat[0].length];
        for(int i = 0 ;i < mat.length;++i)
        {
            for(int j = 0 ;j < mat[0].length;++j)
            {
                if(mat[i][j] == 0)
                {
                    row[i] = column[j] = true;
                }
            }
        }
        
        for(int i = 0 ;i < mat.length;++i)
        {
            for(int j = 0 ;j < mat[0].length;++j)
            {
                if(mat[i][j] !=0 && (row[i] || column[j])) mat[i][j] = 0;
            }
        }
        return mat;
    }
}
