package arrays;

/**
 * 9.10日 求最大回文长度
 */
public class longestPalindrome {
    static String Palindrome="a";

    public static void main(String[] args) throws Exception {
       function(Palindrome);
    }
    public static String function(String palindrome){
        char left;//字符串左边的值
        char right;//右边的值
        int max=0;//初始化最大长度
        boolean flag;//跳出while的标志
        Character res1= palindrome.charAt(0);
         String res=palindrome;
        if (palindrome.length()==1) {
            System.out.println(palindrome);
            return palindrome;
        }
        for (int i=0;i<palindrome.length();i++){
            //最开始将  int ii=i;放到这个位置。 里层的while循环 改变了 ii的值 。
            // 当内层循环下一次执行时， ii的值是上次while循环的值
            for (int j=i+1;j<palindrome.length();j++){
                // jj ii相当于两个指针
                int jj=j;
                int ii=i;
                flag=true;
                //当字符串左边的值 等于右边的值时，才满足字符串是个回文的基本条件
                    while (palindrome.charAt(j)==palindrome.charAt(i) && (ii <= jj)&&flag){
                        //两个指针到达同一位置或者相邻时 则该字串是个回文串，即可计算字串长度
                        if ((ii == jj - 1) | (ii == jj)) {
                            if ((j-i+1)>max) {
                                res= palindrome.substring(i, j+1);
                                max = j - i + 1;
                            }
                            flag=false;
                        }
                        // 指针移动
                            ii++;
                            jj--;
                    }
            }
        }
        System.out.println(res);
        return res;
    }

}
