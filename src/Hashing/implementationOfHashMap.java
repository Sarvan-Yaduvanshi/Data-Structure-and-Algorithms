package Hashing;
import java.util.*;
public class implementationOfHashMap {
    static class HashMap<K, V> {  // Generic
        private class Node {
            K key;
            V value;

            public Node(K key, V value) {
                this.key = key;
                this.value = value;
            }
        }

        private int n;  // n
        private int N;
        private LinkedList<Node>[] buckets; // N = buckets.length;

//        @SuppressWarnings("unchecked");
        public HashMap() {
            this.N = 4;
            this.buckets = new LinkedList[4];
            for (int i = 0; i < 4; i++) {
                this.buckets[i] = new LinkedList<>();
            }
        }

        private int hashFunction(K key) {
            int hashCode = hashCode();
            return Math.abs(hashCode) % N;
        }

        private int SearchInLinkedList(K key, int bi) {
            LinkedList<Node> linkedList = buckets[bi];
            int dataIdx = 0;
            for (Node node : linkedList) {
                if (node.key == key) {
                    return dataIdx;
                }
                dataIdx++;
            }
            return -1;
        }

        private void rehash() {
            LinkedList<Node> oldBucK[] = buckets;
            buckets = new LinkedList[2 * N];
            N = 2 * N;

            for (int i = 0; i < buckets.length; i++) {
                buckets[i] = new LinkedList<>();
            }

             // nodes --> add in new buckets
            for (int i = 0; i < oldBucK.length; i++) {
                LinkedList<Node> ll = oldBucK[i];
                for (int j = 0; j < ll.size(); j++) {
                    Node node = ll.remove();
                    put(node.key, node.value);
                }
            }
        }
        public void put(K key, V value) {  // O(lambda) --> O(1)
            int bi = hashFunction(key); // 0 t0 3 --> size - 1
            int dataIndex = SearchInLinkedList(key, bi);   // valid -1

            if (dataIndex != -1) {
                Node node = buckets[bi].get(dataIndex);
                node.value = value;
            } else {
                buckets[bi].add(new Node(key, value));
                n++;
            }

            double lambda = (double) n / N;
            if (lambda > 2.0) {
                rehash();
            }
        }

        public boolean containsKey(K key) { // O(lambda)
            int bi = hashFunction(key); // 0 t0 3 --> size - 1
            int dataIndex = SearchInLinkedList(key, bi);   // valid -1

            if (dataIndex == -1) {
                return true;
            } else {
                return false;
            }
        }

        public V remove(K key) {
            int bi = hashFunction(key); // 0 t0 3 --> size - 1
            int dataIndex = SearchInLinkedList(key, bi);   // valid -1

            if (dataIndex != -1) {
                Node node = buckets[bi].remove(dataIndex);
                n--;
                return node.value;
            } else {
               return null;
            }
        }

        public V get(K key) {
            int bi = hashFunction(key); // 0 t0 3 --> size - 1
            int dataIndex = SearchInLinkedList(key, bi);   // valid -1

            if (dataIndex != -1) {
                Node node = buckets[bi].get(dataIndex);
                return node.value;
            } else {
                return null;
            }
        }

        public ArrayList<K> keySet() {
            ArrayList<K> keys = new ArrayList<>();
            for (LinkedList<Node> ll : buckets) {
                for (Node node : ll) {
                    keys.add(node.key);
                }
            }
            return keys;
        }

        public boolean isEmpty() {
            return n ==0;
        }

        public static void main(String[] args) {
            HashMap<String, Integer> map = new HashMap<>();
            map.put("India", 100);
            map.put("China", 150);
            map.put("USA", 50);
            map.put("Nepal", 20);

            ArrayList<String> keys = map.keySet();
            for (String key : keys) {
                System.out.println(key); 
            }

            System.out.println(map.get("India"));
            System.out.println(map.remove("India"));
            System.out.println(map.get("India"));
        }
    }
}
