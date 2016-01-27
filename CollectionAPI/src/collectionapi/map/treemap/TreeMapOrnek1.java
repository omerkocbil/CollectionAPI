/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package collectionapi.map.treemap;

import java.util.Map;
import java.util.TreeMap;

/**
 *
 * @author jan
 */
public class TreeMapOrnek1 {

    public static void main(String[] args) {
        Map treeMap = new TreeMap();
        treeMap.put("key1", "value1");
        treeMap.put("key5", "value5");
        treeMap.put("key2", "value2");
        treeMap.put("key3", "value3");
// treeMap.put(1, "java.lang.ClassCastException");
        for (Object key : treeMap.keySet()) {
            System.out.println(key + " " + treeMap.get(key));
        }
    }
}
