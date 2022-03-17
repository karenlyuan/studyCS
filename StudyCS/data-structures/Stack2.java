public class Stack<T>{
    
    private Queue<T> a;
    private Queue<T> b;
    private int size;
    
    public Stack() {
        a = new Queue<T>();
        b = new Queue<T>();
        size = 0;
        
    }

    public void push(T t) {
        
        b.add(t);
        if(a.size() >= 1) {
            b.add(a.peek());
            a.remove();
        }
        size++;
        
        Queue<T> temp = a;
        a = b;
        b = temp;
        
     }

    public T pop(){
      
        size--;
        if(a.size() >= 1) {
            return a.peek();
        } else{
            return null;
        }
      
     }

    //return top of the list - does not modify list
    public T peek() {
      return a.peek();
    }
    

    public int size() {
        return size;
    }

}
