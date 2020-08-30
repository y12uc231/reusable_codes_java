package leetcode.practice;

import java.util.ArrayList;
import java.util.Scanner;

class TreeNode {
    int val;
    TreeNode left, right;
    TreeNode(int val) {
        this.val = val;
        this.left = null;
        this.right = null;
    }
}
class Problem1382 {
    public TreeNode balanceBST(TreeNode root) {
        if(root==null)
            return root;
        ArrayList<Integer> arr=new ArrayList<>();
        inorder(root,arr);
        return make(arr,0,arr.size()-1);

    }
    public static void inorder(TreeNode root,ArrayList<Integer> arr)
    {
        if(root==null)
            return;
        inorder(root.left,arr);
        arr.add(root.val);
        inorder(root.right,arr);
    }
    public static TreeNode make(ArrayList<Integer> arr,int s,int e)
    {
        if(s>e)
            return null;
        int mid=(s+e)/2;
        TreeNode root=new TreeNode(arr.get(mid));
        root.left=make(arr,s,mid-1);
        root.right=make(arr,mid+1,e);
        return root;
    }
}