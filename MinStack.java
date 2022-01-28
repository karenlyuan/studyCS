import java.util.ArrayList;

public class MinStack<Integer>{
    
    //add any required isntance variables
    private ArrayList<Integer> data;
    private ArrayList<Integer> minStack;
    private int size;
    
    //add a constructor
    public MinStack() {
        data = new ArrayList<Integer>();
        minStack = new ArrayList<Integer>();
        size = 0;
    }
    
    public void push(int el){
        data.add(0, e);
        size += 1;
        
        int min = el;
        
        if(minStack.size() >= 1 && min > minStack.peek()) {
            min = minStack.peek();
        }
        
        minStack.add(0, min);
    }
    
    public int pop(){
        int value = data.get(0);
        data.remove(0);
        minStack.remove(0);
        size -= 1;
        return value;
    }

    public int peek() {
        return data.get(0);
    }
    
    public int size(){
        return size;
    }
    
    
    /* returns the minimum element in the list.
       Does NOT modify the list */
    public int min(){
        return minStack.peek();
    }
    
    
}
