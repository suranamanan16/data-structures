class Tree{


  //Similar to the linkedlist we have access
  //to the root of the tree (head in LinkedList)
  TreeNode root;

  public void insert(int value){
    if(root == null){
      //you have a constructor for tree node because
      //you will use it when you find the empty spot
      root = new TreeNode(value);
      return;
    }

    root.insert(value);
  }




}
