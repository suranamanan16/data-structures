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
        throw new ArrayIndexOutOfBoundsException(index);
    }

    return data[index];
  }

  //replaces old value and returns it
  public E set(int index, E element){
    //E represents any type of object
    if(index < 0 || index >= size){
      //Dont have to return throw statements
      throw new ArrayIndexOutOfBoundsException(index);
    }

    E oldValue = data[index];
    data[index] = element;
    return oldValue;
  }

//Add at the end of the arraylist
//Big 0 is O(1) and is amortized
//becomes O(n) when you you run out of space
  public boolean add(E element){
    growIfFull();

    data[size] = element;
    size++;
    return true;
  }

//add at an index

  public void add(int index, E element){
    if(index < 0 || index >= size){
      throw new ArrayIndexOutOfBoundsException(index);
    }

    for(int i = size - 1; i >= index; i--){
      data[i + 1] = data[i];
    }

    data[index] = element;
    size++;


  }


  private void growIfFull(){

    if(this.size == this.data.length){
      //bigger can be called outside of the for loop because
      //its defined outside
        E[] bigger = (E[]) new Object[this.data.length * 2];

        for(int i = 0; i < bigger.length; i++){
          bigger[i] = data[i];
        }
        data = bigger;
    }

    return;
  }





  public static void main(String[] args){

  }




}
