class LRUCache {
    
    class Node {
        int key;
        int value;
        Node prev;
        Node next;
    }
    private void addNode(Node node){
        node.next = head.next;
        node.prev = head;
        head.next.prev = node;
        head.next = node;
    }
    private void removeNode(Node node){
        node.prev.next = node.next;
        node.next.prev = node.prev;
    }
    private void moveToHead(Node node){
        removeNode(node);
        addNode(node);
    }
    private Node popTail(){
        Node ret = tail.prev;
        removeNode(ret);
        return ret;
    }
    
    Map<Integer,Node> cache;
    private int size;
    private final int CAPACITY;
    private Node head,tail;

    public LRUCache(int capacity) {
        CAPACITY = capacity;
        cache = new HashMap<>();
        head = new Node();
        tail = new Node();
        tail.prev = head;
        head.next = tail;
    }
    
    public int get(int key) {
        //System.out.println(cache);
        Node n = cache.get(key);
        if(n==null){
            return -1;
        }
        moveToHead(n);
        return n.value;
    }
    
    public void put(int key, int value) {
        Node curr = cache.get(key);
        if(curr!=null){
            curr.value = value;
            moveToHead(curr);
        }else{
            Node newNode = new Node();
            newNode.key = key;
            newNode.value = value;
            addNode(newNode);
            cache.put(key,newNode);
            ++size;
            if(size>CAPACITY){
                Node removed = popTail();
                cache.remove(removed.key);
                --size;
            }
        }
        
    }
}


//HASHmAP (key, vaLues)
//qUEUE (KEY)


//iNSERT hASHMAP (KEY,VALUE)
//lru aRRaylist <KEY>
//

//GET -> hASHmAP ()
//HASHMAP.GET(KEY)
//LRU.REMOVE()




/**
 * Your LRUCache object will be instantiated and called as such:
 * LRUCache obj = new LRUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */