class Solution {
    public boolean canJump(int[] nums) {
        int currentIndex = 0;
        int farthestReachable = nums[0];

        while (currentIndex <= farthestReachable)
        {
            farthestReachable = Math.max(farthestReachable, currentIndex + nums[currentIndex]);

            if(farthestReachable >= nums.length - 1)
            {
                return true;
            }
            else
            {
                currentIndex++;
            }
        }

        return false;
    }
}