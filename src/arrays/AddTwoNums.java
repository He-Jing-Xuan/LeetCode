package arrays;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class AddTwoNums {
    public  static  int [] nums=new int[]{2,2,3,5};
    public  static  int target=7;
    public static void main(String [] args){
   //  twoSum();
      //  two();
        two2(nums,target);
    }

    /**
     * 两数之和
     *遍历一遍hashmap的解法
     * * @return
     */
    public static void twoSum(){
        int [] nums=new int[]{2,2,3,5};
        int target=8;
        Map<Integer,Integer> map=new HashMap<>();
        for (Integer i=0;i<nums.length;i++){
            if(map.containsKey(target-nums[i])){
                System.out.println(Arrays.toString( new int[]{map.get(target-nums[i]),i}));
            }
            map.put(nums[i],i);
        }
    }

    /**
     * 暴力算法
     * 时间复杂度：O(n^2)
     * 对于每个元素，我们试图通过遍历数组的其余部分来寻找它所对应的目标元素，这将耗费 O(n) 的时间。因此时间复杂度为 O(n^2)O(n
     * 空间复杂度：O(1)。
     */
    public static  void two(){
        int [] nums=new int[]{2,2,3,5};
        int target=7;
        for (int i=0;i<nums.length;i++){
            int a=target-nums[i];
            for (int j=i+1;j<nums.length;j++){
                if (nums[j]==a){
                    System.out.println("["+i+","+j+"]");
                }
            }
        }
    }
    /**
     * 两个for循环
     */
    public static void two2(int [] nums,int target){
        Map<Integer,Integer> map=new HashMap<>();
        for (int i=0;i<nums.length;i++){
            map.put(nums[i],i);
        }
        for (int j=0;j<nums.length;j++){
            int a=target-nums[j];
            if (map.containsKey(a)&&map.get(a)!=j){
                System.out.println(map.get(a)+" "+j);
            }
        }
    }
}
