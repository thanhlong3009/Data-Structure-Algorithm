package day_11_hashing;

import java.util.LinkedList;
import java.util.List;
import java.util.Objects;

public class MyHashMap {
    private static final  int SIZE = 10000;
    private List<Node> [] buckets;
    public MyHashMap() {
        // array of buckets
        buckets = new List[SIZE];
        for (int i = 0; i <  SIZE; i++) {
            buckets[i] = new LinkedList<>();
        }
    }
    public  void put(int key, int value) {
        // biến key thành 1 index : hashfunction
        int hashIndex = hashFunction(key);
        // Lấy ra bucket đê chứa
        List<Node> bucket = buckets[hashIndex];
        if (bucket == null){
            List<Node> newBucket = new LinkedList<>();
            buckets[hashIndex] = newBucket;
            bucket = newBucket;
        }
        // nếu bucket chưa có key này
        // chekc xem đã có node key này chưa
        Node node = new Node(key,value);
        int indexOfKey = bucket.indexOf(node);
        if (indexOfKey == -1){
            bucket.add(node);
        }else {
            bucket.get(indexOfKey).value = value;
        }
    }
    public  int get(int key) {
        // tìm hash index
        int hashIndex  = hashFunction(key);
        List<Node> bucket = buckets[hashIndex];
        // nếu bucket chưa có key này
        // chekc xem đã có node key này chưa
        Node node = new Node(key,-1);
        int indexOfKey = bucket.indexOf(node);
        if (indexOfKey == -1){
            // bucket chưa có ket này, return -1
            return -1;
        }else {
            // bucket đã có key này, return value của nó
            return bucket.get(indexOfKey).value;
        }
    }
    public  void remove(int key) {
        // tìm hash index
        int hashIndex  = hashFunction(key);
        List<Node> bucket = buckets[hashIndex];
        Node node = new Node(key,-1);
        bucket.remove(node);
    }
    // hash function
    public  int hashFunction(int key) {
        // size = 10000;
        // key = 5 -> 5
        // key = 10005 -> 5
        // key = 100 -> 100
        return key % SIZE;
    }

    static class Node{
        public int key, value;

        public Node(int key, int value){
            this.key = key;
            this.value = value;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Node node = (Node) o;
            return this.key == node.key;
        }

    }
}
