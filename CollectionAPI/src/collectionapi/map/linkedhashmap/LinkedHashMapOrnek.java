/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package collectionapi.map.linkedhashmap;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 *
 * @author jan
 */
public class LinkedHashMapOrnek {

    public static void main(String[] args) {
        Map<String, String> linkedMap = new LinkedHashMap<String, String>();
// LinkedHashMapOrnek , ekleme sirasina gore calisir. LinkedHashMapOrnek ordered
// yapidadir.
        linkedMap.put("key1", "value1");
        linkedMap.put("key2", "value2");
        linkedMap.put("key3", "value3");
        linkedMap.put("key4", "value4");
        for (String key : linkedMap.keySet()) {
            System.out.println(key + " " + linkedMap.get(key));
// ordered
        }
    }
}
