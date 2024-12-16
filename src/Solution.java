/**

 Problem Statement: Cache with Least Recently Used (LRU) Eviction Policy

 Design and implement a cache with a least recently used (LRU) eviction policy. The cache should support the following operations:

 Get(key): Retrieve the value associated with the given key from the cache. If the key is not present in the cache, return null.
 Put(key, value): Insert or update the value associated with the given key in the cache. If the cache is full, evict the least recently used item before inserting the new key-value pair.
 Remove(key): Remove the key and its associated value from the cache.
 Clear(): Clear all entries from the cache.

 You are required to implement the cache in a programming language of your choice, adhering to the following guidelines:

 Use appropriate data structures to implement the cache efficiently, considering both time and space complexity.
 Implement the cache as an object-oriented design, with clear separation of concerns and encapsulation of functionality.
 Optimize the cache for performance, minimizing the time complexity of cache operations.
 Provide suitable error handling mechanisms for handling exceptions and edge cases.

 LRU CACHE -> STORE THE DATA/LRU/GET(It is noit available to return null)/DELTE/ADD(Size of the cache is full, remove LRU)

 SLL ->  ADD  a --> B --> C
 MAP <KEY, VALUE> / GET O(1), ADD(Delete from the DLL and Add it to the first position), Delete(MAP, DLL)


 */

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    static Map<String, String> map;
    static int capacity;
    static int currCapacity = 0;
    static Node head =  null;

    Solution() {
        Solution.map = new HashMap<>();
        Solution.capacity = 2;
    }
    static class  Node {
        String value;
        Node next;

        Node(String value) {
            this.value = value;
        }
    }

    public static Node addNodeToStartOfList(Node head, String key) {
        if(head == null) {
            Solution.head = new Node(key);
            return Solution.head;
        }
        // deleteNode(head, key);
        Node temp = new Node(key);
        temp.next = head;
        Solution.head = temp;
        return Solution.head;
    }


    public static Node deleteNode(Node head, String key) {
        if(head == null) {
            return null;
        }
        if(head.value == key) {
            return head = head.next;
        } else {
            Node curr = head.next;
            Node prev = head;
            while(curr.next != null) {
                if(curr.value == key) {
                    prev.next = curr.next;
                    return head;
                }
                prev = curr;
                curr = curr.next;
            }
        }
        return head;
    }

    public static String getAndRemoveLastFromList(Node head) {
        if(head == null) {
            return null;
        }
        if(head.next == null) {
            String result = head.value;
            head = null;
            return result;
        } else {
            Node curr = head.next;
            Node prev = head;
            while(curr.next != null) {
                prev = curr;
                curr = curr.next;
            }
            prev.next = null;
            System.out.println("inside prev" + prev.value);
            System.out.println("inside next" + curr.value);
            return curr.value;
        }
    }

    static String get(String key) {
        String result = null;
        if(map.containsKey(key)) {
            result = map.get(key);
            addNodeToStartOfList(head, result);
        }
        return result;
    }

    static String add(String key, String value) {

        //what we are adding is already present -> dont add to map  but add it to front //of list
        // if not present , check the currCapacity if it is full then remove the last value from the list and remove from map as well.
        //if not full add it to map and add it at the start of list

        if(map.containsKey(key)) {
            addNodeToStartOfList(head, key);
        } else {
            if(Solution.currCapacity >= Solution.capacity) {

                String lastRecentlyUsedKey = getAndRemoveLastFromList(Solution.head);
                Solution.map.remove(lastRecentlyUsedKey);
                Solution.currCapacity--;
                //delete it from map
            }
            Solution.currCapacity++;
            Solution.map.put(key, value);
            Solution.head = addNodeToStartOfList(head, key);
        }
        return value;
    }

    static String delete(String key) {
        String result = null;
        if(map.containsKey(key)) {
            result =  map.remove(key);
            deleteNode(head, result);
        }
        return result;
    }

    public static void main(String[] args) {
        Solution cache = new Solution();
        cache.add("key1", "value1");
        cache.add("key2", "value2");
        cache.add("key3", "value3");
        cache.add("key4", "value4");
        System.out.println(map);
        System.out.println(cache.get("key3"));
    }
}

