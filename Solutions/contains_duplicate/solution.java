package Solutions.contains_duplicate;

import java.util.HashSet;

class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> uniqueNums = new HashSet<>();
        for (int i = 0; i< nums.length; i++){
            uniqueNums.add(nums[i]);
        }

        return (uniqueNums.size() < nums.length) ? true: false;
    }
}