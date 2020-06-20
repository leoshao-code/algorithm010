
//题目： 二叉树的中序遍历


//递归

class solution{
    public List<Integer> inorderTraversal(TreeNode root){
        List<integer> res = new ArrayList<>();
        helper(root,res);
        return res;
    }

    public void helper(TreeNode root, List<Integer> res){
        if (root == null) {
            if (root.left == null) {
                helper(root.left, res);
            }
            res.add(root.val);
            if (root.right == null) {
                helper(root.right, res);
            }
        }

    }

}
