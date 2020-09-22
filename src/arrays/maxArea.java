package arrays;

/**
 * 乘最多水的容器
 * 给你 n 个非负整数 a1，a2，...，an，每个数代表坐标中的一个点 (i, ai) 。
 * 在坐标内画 n 条垂直线，垂直线 i 的两个端点分别为 (i, ai) 和 (i, 0)。
 * 找出其中的两条线，使得它们与 x 轴共同构成的容器可以容纳最多的水。
 *  输入：[1,8,6,2,5,4,8,3,7]
 *  输出：49
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/container-with-most-water
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class maxArea {
    static int [] height=new int[]{1,8,6,2,5,4,8,3,7};
//    public static void main(String [] args){}
public static void main(String[] args) {
     System.out.println(heightMax(height));
}

    /**
     * 采用暴力算法
     * @param height
     * @return
     */
    public static int heightMax(int [] height){
        int area=0;
      for (int i=0;i<height.length;i++){
          int height1=height[i];
          for (int j=i+1;j<height.length;j++){
              int height2=height[j];
               area=Math.max(area,Math.min(height1,height2)*(j-i));
          }
      }
      return area;
}
}
