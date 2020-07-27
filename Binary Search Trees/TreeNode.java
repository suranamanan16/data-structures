class TreeNode{

  int data;
  TreeNode left;
  TreeNode right;

  public TreeNode(int data){
    this.data = data;
  }

  public void insert(int value){
    if(value == data){
      return;
    }

    if(value < this.data){

        if(left == null){
          left = new TreeNode(value);

        }else{
          left.insert(value);
        }

    }else{

        if(right == null){
          right = new TreeNode(value);

        }else{
          right.insert(value);
        }

      }
  }



}
