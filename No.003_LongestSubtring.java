public static int GetLongestSubString(String inputStr)
        {
            char[] charArray = inputStr.toCharArray();  //把string转为char[]，方便操作
            Hashtable ht = new Hashtable();         //用hashtable存储遍历到的临时最大不重复的子字符串
            int maxLength = 0;                      //最大的子字符串储存在maxLength 
            int len = 0;                            //当然遍历到的不重复子串的长度为len
            char tempChar;                          
            for (int i = 0; i < charArray.length; i++)      //遍历整个输入的字符串
            {
                tempChar = charArray[i];
                if (!ht.containsKey(tempChar))             //如果当前字符不在hashtable中
                {
                    ht.put(tempChar,i);                    //加入到hashtable 
                    len++;                                 //当前不重复子串的长度+1
                }            
                else                                       //当遍历到的字符已经存在于hashtable中
                {                                         
                    maxLength = GetLarger(maxLength, len);               //把已经得到的len的长度和max之间的较大值放入maxLength
                    for (int j = (int)ht.get(tempChar); j >=  i - len; j--)  //！关键点：从当前子串（开始到有重复的那个字符），删除掉
                    {
                        ht.remove(charArray[j]); 
                    }
                    len = ht.size() + 1;                                  //删除掉之后len有了新的长度，即hashtable长度额外加1(当前的i)
                    ht.put(charArray[i],i);                              //讲当前的字符存入hashtable中
                }
            }
             maxLength = GetLarger(maxLength, len);                      //遍历完之后，获得一个len和maxLength的较大值
             return maxLength;
        }

        public static int GetLarger(int a, int b)                               //获得两个int的较大值
        {
            if (a > b)
                return a;
            else
                return b;
        }    
