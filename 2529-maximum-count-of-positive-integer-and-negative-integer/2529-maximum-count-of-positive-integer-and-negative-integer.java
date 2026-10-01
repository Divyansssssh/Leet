class Solution {
    public int maximumCount(int[] nums) {
        int neg = 0;
        int low = 0;
        int high = nums.length - 1;

        while (low <= high) {
            int mid = (low + high) / 2;

            if (nums[mid] < 0) {
                neg = mid + 1;
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        int pos = 0;
        int i = 0;
        int j = nums.length - 1;

        while (i <= j) {
            int mid = (i + j) / 2;

            if (nums[mid] > 0) {
                pos = nums.length - mid;
                j = mid - 1;
            } else {
                i = mid + 1;
            }
        }

        return Math.max(pos, neg);
    }
}
