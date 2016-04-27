 public int GetLongestSubString(string inputStr)
        {
            char[] charArray = inputStr.ToArray();
            Hashtable ht = new Hashtable();
            int maxLength = 0;
            int len = 0;
            char tempChar;
            for (int i = 0; i < charArray.Length; i++)
            {
                tempChar = charArray[i];
                if (!ht.ContainsKey(tempChar))
                {
                    ht.Add(tempChar,i);
                    len++;
                }            
                else
                {
                    maxLength = GetLarger(maxLength, len);
                    for (int j = (int)ht[tempChar]; j >=  i - len; j--)
                    {
                        ht.Remove(charArray[j]);
                    }
                    len = ht.Count + 1;
                    ht.Add(charArray[i],i);
                }
            }
             maxLength = GetLarger(maxLength, len);
             return maxLength;
        }

        public int GetLarger(int a, int b)
        {
            if (a > b)
                return a;
            else
                return b;
        }
