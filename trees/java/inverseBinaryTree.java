
/*
recursive approach - depth first
*/
public TreeNode invertTree(TreeNode root) {
        if (root == null)
            return null;
    
        TreeNode right = invertTree(root.right);
        TreeNode left = invertTree(root.left);
        root.left = right;
        root.right = left;
        return root;
    }

/*
interative approach - breadth first
*/
 public TreeNode invertTree(TreeNode root) {
        Queue<TreeNode> q = new LinkedList<TreeNode>();
        if (root == null) {
            return null;
        }
        q.add(root);
        while(!q.isEmpty() ) {
            TreeNode curr = q.poll();
            TreeNode temp = curr.left;
            curr.left = curr.right;
            curr.right = temp;
            
            if (curr.left !=null)
                q.add(curr.left);
            if (curr.right!=null)
                q.add(curr.right);
        }
        return root;
    }