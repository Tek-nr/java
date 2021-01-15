
public class List_Queue {
    private Node[] elements;
    private int head;
    private int tail;
    private int capacity;
    private int count;

    public List_Queue(int capacity) {
        this.capacity = capacity; 
        head = this.count = 0; 
        tail = capacity - 1; 
        elements = new Node[this.capacity];
    }
    
    public boolean isFull(List_Queue queue) 
    { 
        return (queue.count == queue.capacity); 
    }
    
    public boolean isEmpty(List_Queue queue) 
    { 
        return (queue.count == 0); 
    }
    
    public void enqueue(Node item) 
    { 
        if (isFull(this)){
            System.out.println("Queue is full!");
            return; 
        } 
        this.tail = (this.tail + 1) 
                    % this.capacity; 
        this.elements[this.tail] = item; 
        this.count = this.count + 1; 
        System.out.println("\n"+item.getX()+" "+item.getY()+" "+item.getZ()+ " enqueued"); 
    } 
    
    public void dequeue() 
    { 
        if (isEmpty(this)){
            System.out.println("Queue is empty!");
            return; 
        } 
            
  
        Node item = this.elements[this.head]; 
        this.head = (this.head + 1) 
                     % this.capacity; 
        this.count = this.count - 1; 
        System.out.println("\n"+item.getX()+" "+item.getY()+" "+item.getZ() + " dequeued"); 
    } 
    
    public Node[] getElements() {
        return elements;
    }

    public void setElements(Node[] elements) {
        this.elements = elements;
    }

    public int getHead() {
        return head;
    }

    public void setHead(int head) {
        this.head = head;
    }

    public int getTail() {
        return tail;
    }

    public void setTail(int tail) {
        this.tail = tail;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }
    
    
}
