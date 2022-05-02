class LRUCache {
    class Node{
        int key;
        int value;
        Node prev;
        Node next;
    }
    Node head;
    Node tail;
    Map<Integer,Node> cache;
    int size;
    int totalCapacity;

    public LRUCache(int capacity) {
        totalCapacity = capacity;
        cache = new HashMap<>();
        head = new Node();
        tail = new Node();
        head.next = tail;
        tail.prev = head;
    }
    public void addNode(Node node){
        node.prev = head;
        node.next = head.next;
        head.next.prev = node;
        head.next = node;
    }
    public void removeNode(Node node){
        node.prev.next = node.next;
        node.next.prev = node.prev;
    }
    public Node popTail(){
        Node remove = tail.prev;
        removeNode(remove);
        return remove;
    }
    public void moveToHead(Node n){
        removeNode(n);
        addNode(n);
    }
    
    public int get(int key) {
        Node n = cache.get(key);
        if(n==null)return -1;
        moveToHead(n);
        return n.value;
    }
    
    public void put(int key, int value) {
        Node n = cache.get(key);
        if(n!=null){
            n.value = value;
            moveToHead(n);
        }else{
            Node newNode = new Node();
            newNode.key = key;
            newNode.value = value;
            addNode(newNode);
            cache.put(key,newNode);
            ++size;
            if(size>totalCapacity){
                Node ret = popTail();
                cache.remove(ret.key);
                --size;
            }
        }
    }
}

/**
 * Your LRUCache object will be instantiated and called as such:
 * LRUCache obj = new LRUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */