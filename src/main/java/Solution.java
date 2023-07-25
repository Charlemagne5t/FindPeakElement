
public class Solution {
    public int findPeakElement(int[] nums) {

        int left = 0;
        int right = nums.length - 1;
        int mid = left + (right - left) / 2;

        while (left <= right) {
            mid = left + (right - left) / 2;

            if (mid != 0 && mid != nums.length - 1) {
                if (nums[mid] > nums[mid - 1] && nums[mid] > nums[mid + 1]) {
                    return mid;
                }
            } else if (mid - 1 == -1 && mid + 1 == nums.length) {
                return mid;
            } else if (mid - 1 == -1 && nums[mid] > nums[mid + 1]) {
                return mid;
            } else if (mid + 1 == nums.length && nums[mid] > nums[mid - 1]) {
                return mid;
            }

            if (nums[mid] < nums[mid + 1]) {
                left = mid + 1;
            } else if (nums[mid] < nums[mid - 1]) {
                right = mid - 1;
            }
        }

        return -1;
    }
}
