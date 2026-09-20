class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];
            int other = target - num;
            if (map.containsKey(other)) 
                return new int[]{Math.min(i, map.get(other)), Math.max(i, map.get(other))};
            map.put(num, i);
        }
        return nums;
    }
}

// store the desired counter.
// for each number if == counter return the answer using Math.Min.
// else return [0,0]