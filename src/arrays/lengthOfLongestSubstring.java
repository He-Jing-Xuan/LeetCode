package arrays;

import java.util.HashMap;

/**
 * 无重复字符的最长子串
 * 给定一个字符串，请你找出其中不含有重复字符的 最长子串 的长度。
 *
 * 示例 1:
 *
 * 输入: "abcabcbb"
 * 输出: 3
 * 解释: 因为无重复字符的最长子串是 "abc"，所以其长度为 3。
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/longest-substring-without-repeating-characters
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 *
 */
public class lengthOfLongestSubstring
{
    static String  s="abcacaccddbcbb";
    public static void main(String[] args) {
    System.out.println(function(s));
    }
    /**
     * 滑动窗口
     */
   public static int function(String s){
       if (s.length()==0) return 0;
       //用于存 字母和字母所在的下标
       HashMap<Character,Integer> map=new HashMap<>();
       //不重复的最长字符串的长度
       int maxLong=0;
       //字串最 左边 所在的下表 位子
       int left=0;
       //循环遍历字符串
       for(int i=0;i<s.length();i++){
           //当map中包含这个字符时，重新设置left的值
           if (map.containsKey(s.charAt(i))){
               //map.get(s.charAt(i))+1 下一个字符的下标
               left=Math.max(left,map.get(s.charAt(i))+1);
           }
           //把字符和下标放入map中，若已存在 则将其覆盖。
           map.put(s.charAt(i),i);
           // 取最大的字符串长度
           maxLong=Math.max(maxLong,i-left+1);
       }
          return maxLong;
       }
   }

