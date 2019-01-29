static void levelOrder(Node node) {
        if (node == null)
            return;
        Queue<Node> q = new LinkedList<Node>();
        q.add(node);
        q.add(null);
        
        while(!q.isEmpty()) {
            
            Node root = q.poll();
            if (root == null) {
                if (!q.isEmpty() ) {
                    System.out.println();
                    q.add(null);
                }
            } else {
                if (root.left !=null)
                    q.add(root.left);
                    
                if (root.right != null)
                    q.add(root.right);
                
                System.out.print(root.data + " ");
            }
        }
    }