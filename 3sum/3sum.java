class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        // complexity = O(n^2)
        // two pointer approach, first requires sorting
        Arrays.sort(nums);
        List<List<Integer>> result = new LinkedList();
        
        for(int i = 0; i < nums.length - 2; i++) {
            // checking that pairs are not duplicates
            if(i == 0 || (i > 0 && nums[i] != nums[i-1])) {
                int low = i + 1;
                int high = nums.length - 1;
                int sum = 0 - nums[i];
                while(low < high) {
                    if(nums[low] + nums[high] == sum) {
                        result.add(Arrays.asList(nums[i], nums[low], nums[high]));
                        while(low < high && nums[low] == nums[low+1]) {
                            low++;
                        }
                        while(low < high && nums[high] == nums[high-1]) {
                            high--;
                        }
                        low++;
                        high--;
                    } else if(nums[low] + nums[high] > sum) {
                        high--;
                    } else {
                        low++;
                    }
                    
                }
            }
        }
        
        return result;
    }
}