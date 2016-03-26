import java.util.*;

public class Different {
   public boolean checkDifferent(String iniString) {
        if (iniString.length() > 3000)
            return false;
        long tem = 0;
        for (int i = 0; i < iniString.length(); ++i) {
            int val = iniString.charAt(i) - 'a';
            if ((tem & (1 << val)) > 0) {
                return false;
            }
            tem |= (1 << val);
        }
        return true;
    }
}
