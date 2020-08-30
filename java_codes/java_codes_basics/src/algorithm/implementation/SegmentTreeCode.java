// https://leetcode.com/problems/range-sum-query-immutable/
class SegmentNode {
    int l, r, s;
    SegmentNode left, right;
    SegmentNode(int l, int r) {
        this.l = l;
        this.r = r;
        this.s = 0;
        this.left = null;
        this.right = null;
    }
    void sumArray(int[] arr) {
        for(int i = l ; i < r ; i++) {
            s += arr[i];
        }
    }
}
class NumArray {

    SegmentNode root;
    
    public SegmentNode buildSegmentTree(int[] nums, int left, int right) {
        if (left >= right) {
            return null;
        }
        SegmentNode root = new SegmentNode(left, right);
        root.sumArray(nums);
        root.left = buildSegmentTree(nums, left, (right+left)/2);
        root.right = buildSegmentTree(nums, (right+left)/2, right);
        return root;
    }
    
    public NumArray(int[] nums) {
        this.root = buildSegmentTree(nums, 0, nums.length);
    }
    
    public int helperSearchST(SegmentNode root, int left, int right) {
        if (left >= right || root == null) {
            return 0;
        }
        if (root.l >= left && root.r <= right) {
            return root.s;
        }
        int result = 0;
        int mid = (left+right)/2;
        if (mid <= right && mid >= left) {
            result+= helperSearchST(root.left, left, mid);
            result+= helperSearchST(root.right, mid, right);
        } 
        return result;
    }
    
    public int sumRange(int i, int j) {
        return helperSearchST(root, i, j);
    }
}

/**
 * Your NumArray object will be instantiated and called as such:
 * NumArray obj = new NumArray(nums);
 * int param_1 = obj.sumRange(i,j);
 */
