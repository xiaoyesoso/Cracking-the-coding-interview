import java.util.*;

public class Same {
    public boolean checkSam(String stringA, String stringB) {
        // write code here
            if(stringA.length() != stringB.length())
            return false;
        int [] charhash = new int[256];
        char [] str = stringA.toCharArray();
        for(char c : str)
        {
            ++charhash[c];
        }
        for(int i = 0 ;i < stringB.length();++i)
        {
            if(--charhash[(int)stringB.charAt(i)] < 0)
                return false;
        }
        return true;
    }
}
