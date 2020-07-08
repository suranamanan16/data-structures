//List<Integer> = ArrayList<Integer>();
//The <E> represents the type of array we are making
public class ArrayList <E>{


  //We make these variables private because we do not
  //want them to be accessible outside of this class

  //I dont want someone to do nums.objects

  //We can make methods that can act as a
  //medium for users to access these variables indirectly
  //eg getters and setters
  private E[] data;
  private int size;


  public ArrayList(){
    //E represents any type of object
    //Object array holds a null object bu default
    this.data = (E[]) new Objects[1];
    //Number of elements in the array
    this.size = 0;
  }

  public E getIndex(int index){
    if(index < 0 || index >= size){
        return throw new ArrayIndexOutOfBoundsException(index);
    }

    return data[index];
  }

  //E represents any type of object
  public E set(int index, E element){
    if(index < 0 || index >= size){
      return throw new ArrayIndexOutOfBoundsException(index);
    }

    E oldValue = data[index];
    data[index] = element;
    return oldValue;
  }

  public static void main(String[] args){

  }




}
