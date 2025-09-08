package CodeChallenges;


import java.util.Arrays;
import java.util.Stack;

public class RemoveElement {
    public int removeElement(int[] nums ,int val) {
        int size = 0;
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < nums.length; i++) {
            if (nums[i]!=val){
                stack.push(nums[i]);
                size++;
            }
        }
        int[] expectedNums = new int[size];
        for (int i = 0; i < size; i++) {
            if (!stack.isEmpty()) {
                expectedNums[i] = stack.pop();
            }
        }
        System.out.println(Arrays.toString(expectedNums));
        return expectedNums.length;
    }

//    To be noted: that my code did do "in-place" approach
//    un-necessary and complicated but made some different move
//    was not according to the leetcode problem statement.

//    Another solutions of internet
//int k = 0;
//    for (int i = 0; i < nums.length; i++) {
//        if (nums[i] != val) {
//            nums[k] = nums[i];
//            k++;
//        }
//    }
//    return k;
}
