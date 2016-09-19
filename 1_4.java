class Solution {
public:
    void replaceSpace(char *str,int length) {
            if(length > 0)
        {
            int space_count = 0;
            int i;
            for (i = 0;i < length;++i)
            {
                if(str[i] == ' ')
                {
                    ++ space_count;
                }
            }
            int left = i ,right = i + space_count * 2;
            while(left >= 0)
            {
                if(str[left] == ' ')
                {
                    str[right--] = '0';
                    str[right--] = '2';
                    str[right--] = '%';
                    -- left;
                }
                else
                {
                    str[right--] = str[left--];
                }
            }
        }
    }
};
