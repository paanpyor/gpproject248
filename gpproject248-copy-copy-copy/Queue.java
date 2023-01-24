
public class Queue extends LinkedList {   
    
    public Queue()
     { }
    
    //WE USE THIS enqueue method in the action of transfering data from LinkedList to Queue. 
    //to insert data into Queue.
    public void enqueue(Object elem)
    { 
        insertAtBack(elem); 
    }
    
    public Object dequeue()
    { 
         return removeFromFront(); 
    }
    
    public Object getFront()
    { 
         return getFirst(); 
    }
    
    public Object getEnd()
    { 
        Object obj = removeFromBack();
         insertAtBack(obj);
         return obj; 
    } 
}