package arrays;

/**
 *有两种特殊字符。第一种字符可以用一比特0来表示。第二种字符可以用两比特(10 或 11)来表示。但是00不能表示字符
 *
 * 现给一个由若干比特组成的字符串。问最后一个字符是否必定为一个一比特字符。给定的字符串总是由0结束。
 *
 * 来源：力扣（LeetCode）
 * 根据题意：0为一个字符 11和10也是一个字符。要满足最后一个是由0构成的字符而不是11或者10
 * 那么从头部开始进行遍历，遇到0 则是单个字符 指针(start加1)移动一个。如果遇到了1，则不管下一个是0还是1bit都会被1吃掉构成11或10的字符
 * 那么指针跳两步(start加2)。
 * 何时结束循环？
 * 当start大于或等于数组长度减一时，则跳出循环
 * 当start等于时 说明指针是到达了最后一位
 * 当大于时，说明前一位是1，指针跳了两个 导致大于就不合题意了。
 */
public class isOneBitCharacter {
    static  int [] bits=new int[]{1,0,1,0,1,0,1,1,1,0};
    public  static void main(String [] args){
        System.out.println(bit(bits));
    }
    public static boolean bit(int [] bits){
        int start=0;
        while (start<bits.length-1){
            if (bits[start]==0){
                start++;
            }else {
                start+=2;
            }
        }
        return start==bits.length-1;
    }
}
