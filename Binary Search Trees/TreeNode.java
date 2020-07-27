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
          //DONT RETURN ANYTHING HERE
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

  //You are doing binary search on the Tree
  //the time is logn
  public TreeNode get(int value){
    if(value == data){
      return this;
    }

    if(value < data){
      if(left != null){
        return left.get(value);
      }else{
        return null;
      }
    }else{
      if(right != null){
        return right.get(value);
      }else{
        return null;
      }
    }
  }

  public int max(){
    if(right != null){
      return right.max();
    }else{
      return data;
    }
  }

  public int min(){
    if(left != null){
      return left.min();
    }else{
      return data;
    }
  }

  @Override

   public String toString() {

        return  "data = " + data ;

    }



}
