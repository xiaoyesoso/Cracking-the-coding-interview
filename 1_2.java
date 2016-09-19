import java.util.*;

public class Reverse {
    public String reverseString(String iniString) {
        // write code here
         int len = iniString.length();
        StringBuffer sb = new StringBuffer(iniString);
        for(int i = 0 , j = len -1;i < j ;++i ,--j)
        {
            char tem = sb.charAt(i);
            sb.setCharAt(i, sb.charAt(j));
            sb.setCharAt(j, tem);
        }
        return sb.toString();
    }
}
