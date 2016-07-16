package leetcode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * Given an array of integers, return indices of the two numbers such that they add up to a specific target.
   You may assume that each input would have exactly one solution.
 * Given nums = [2, 7, 11, 15], target = 9,
   Because nums[0] + nums[1] = 2 + 7 = 9,
   return [0, 1].
 *
 */
public class TwoSum {
	public static void main (String[] args){
		System.out.println(Arrays.toString(twoSum(new int[] {3,2,4}, 6)));
	}
	public static int[] twoSum(int[] nums, int target){
		Map<Integer,Integer> numsmap = new HashMap<Integer,Integer>();
		for(int i=0; i < nums.length ; i++){
			int compliment = target - nums[i];
			if(numsmap.containsKey(compliment) && numsmap.get(compliment)!=i){
				return new int[] {i,numsmap.get(compliment)};
			}
			numsmap.put(nums[i], i);
		}
		throw new IllegalArgumentException("No matching sum found");
	}
}
