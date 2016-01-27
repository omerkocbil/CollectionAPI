/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package collectionapi.map.hashmap;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author jan
 */
public class HashMapOrnek1 {

    public static void main(String[] args) {
        Map map = new HashMap();
        map.put(1, "one");
//Map'lere eleman eklemek icin put metodunu kullaniriz.
        map.put(2, "two");
        map.put(3, "three");
        map.put(4, "four");
        map.put("mykey", "myvalue");
        map.put(5, "five");
        for (Object key : map.keySet()) {
            System.out.println("key:" + key + " value:" + map.get(key));
        }
    }
}
