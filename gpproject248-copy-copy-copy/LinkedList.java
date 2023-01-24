public class LinkedList  { 
    
    Node head; //define the head variable in the LinkedList class
    
    private Node first; 
    private Node last; 
    private Node current; 
    
    public LinkedList() 
    { 
        
        first = null; 
        last = null; 
        current = null; 
        head = null; //initialize head variable to null
    
    } 
    
    
    public boolean isEmpty() 
    { 
        return (first==null); 
    } 
    
    
    public void insertAtFront(Object insertItem) 
    { 
        Node newNode = new Node(insertItem); 
        if (isEmpty()) 
        { 
            first = newNode; 
            last = newNode; 
        } 
        else 
        { 
            newNode.next = first; 
            first = newNode; 
        } 
    } 
    
    
    public void insertAtBack(Object insertItem) 
    { 
        Node newNode = new Node(insertItem); 
        if (isEmpty()) 
        { 
            first = newNode; 
            last = newNode; 
        } 
        else 
        { 
            last.next = newNode; 
            last = newNode; 
        } 
    } 
  
    
    //NOTE: WE HAVE 2 removeFromFront method. Both are slighly different from each other. removeFromFront1 & removeFromFront2
    
    //WE USE THIS removeFromFront1() method for dequeue in our system.
    public Object removeFromFront() 
    { 
        Object removeItem = null; 
        if (isEmpty()) 
        { 
            return removeItem; 
        } 
        removeItem = first.data; 
        if ( first == last) 
        { 
            first = null; 
            last = null; 
        } 
        else 
        first = first.next; 
        return removeItem; 
    } 
    
    
    //WE USE THIS removeFromFront2() method in the process of delete data in our aystem.
    //in this, we add while loop so that it can iterates through the flocust list and comparing the data that user want to delete.
    public Object removeFromFront(Object value) 
    {
        if(head==null) return null;
        Node current = head;
        if (current != null && value instanceof String && current.data instanceof String) 
        {
            if (((String) value).equalsIgnoreCase((String) current.data)) 
            {
                Object removed = current.data;
                head = current.next;
                return removed;
            }
        }
        
        while (current != null && current.next != null) 
        {
            if (value instanceof String && current.next.data instanceof String) 
            {
                if (((String) value).equalsIgnoreCase((String) current.next.data)) 
                {
                    Object removed = current.next.data;
                    current.next = current.next.next;
                    return removed;
                }
            }
            current = current.next;
        }
        return null;
    }

    
    public Object removeFromBack() 
    { 
        Object removeItem = null; 
        if (isEmpty()) 
        { 
            return removeItem; 
        } 
        removeItem = last.data; 
        if ( first == last) 
        { 
            first = null; 
            last = null; 
        } 
        else 
        { 
            current = first; 
            while (current.next != last) 
                current = current.next; 
            last = current; 
            last.next = null; 
         } 
        return removeItem; 
    } 
    
    
    public Object getFirst() 
    { 
        if (isEmpty()) 
            return null; 
        else 
        { 
            current = first; 
            return current.data; 
        } 
    } 
    
    
    public Object getNext() 
    { 
        if (current == last) 
            return null; 
        else 
        { 
            current = current.next; 
            return current.data; 
        } 
    } 
    
} 