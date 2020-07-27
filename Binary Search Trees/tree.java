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

  public TreeNode get(int value){
    if(root != null){
      return root.get(value);
    }

    return null;
  }

  public int max(){
    if(root != null){
      return root.max();
    }else{
      return Integer.MAX_VALUE;
    }
  }

  public int min(){
    if(root != null){
      return root.min();
    }else{
      return Integer.MAX_VALUE;
    }
  }

}
