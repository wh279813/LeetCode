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
                    for (int j = (int)ht[tempChar]; j >= (int)ht[tempChar] - i + len; j--)
                    {
                        ht.Remove(charArray[j]);
                        len = len - (int)ht[tempChar] + 1;
                    }
                }
            }
                return maxLength;
        }

        public int GetLarger(int a, int b)
        {
            if (a > b)
                return a;
            else
                return b;
        }