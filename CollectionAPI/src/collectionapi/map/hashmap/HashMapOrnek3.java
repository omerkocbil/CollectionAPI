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
public class HashMapOrnek3 {

    public static void main(String[] args) {
        Map<String, String> map = new HashMap<String, String>();
        map.put("key1", "value1");
        map.put("key1", "new value1");
// key unique olmalidir. Ayni key'e sahip eleman eklendiginde eski
// elemani override eder.
        map.put("key2", "value1");
        map.put("key2", "new value1");
// key farkli olduktan sonra value ayni olabilir.
        for (String key : map.keySet()) {
            System.out.println(key + " " + map.get(key));
        }
    }
}
