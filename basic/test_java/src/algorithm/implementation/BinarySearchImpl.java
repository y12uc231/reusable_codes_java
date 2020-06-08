package algorithm.implementation;

public class BinarySearchImpl {
    public static int binarySearch(int[] nums, int target, int start, int end) {
        if (nums.length == 0) {
            return -1;
        }
        int mid = -1;
        while (start < end) {
            mid = (end + start)/2;
            if (nums[mid] > target) {
                end = mid;
            } else if (nums[mid] < target) {
                start = mid;
            } else {
                return mid;
            }
        }
        return -1;
    }




    public static void main(String[] args) {
        int[] nums = {1,2,3,4};
        int target = 4;
        System.out.println(binarySearch(nums, target, 0, nums.length));
    }

}
