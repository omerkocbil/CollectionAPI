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
public class HashMapOrnek2 {

    public static void main(String[] args) {
        Map<Integer, String> myMap = new HashMap<Integer, String>();
        boolean isEmpty = myMap.isEmpty();
        int size = myMap.size();
        System.out.println("isEmpty:" + isEmpty);
        System.out.println("size:" + size);
        myMap.put(10, "test1");
        myMap.put(20, "test2");
        myMap.put(30, "test3");
        myMap.put(40, "test4");
        String value = myMap.get(20);
// get metodune key verip value aliyoruz.
        System.out.println("value:" + value);
        boolean containsKey = myMap.containsKey(10);
// key'i 10 olan eleman var mi ?
        System.out.println("containsKey 10 : " + containsKey);
        boolean containsValue = myMap.containsValue("test1");
// value test1 olan elaman var mi ?
        System.out.println("containsValue test1 : " + containsValue);
        myMap.remove(10);
// key'i 10 olan elamani sil.
        containsKey = myMap.containsKey(10);
        System.out.println("containsKey 10 : " + containsKey);
        containsValue = myMap.containsValue("test1");
        System.out.println("containsValue test1 : " + containsValue);
        isEmpty = myMap.isEmpty();
        size = myMap.size();
        System.out.println("isEmpty:" + isEmpty);
        System.out.println("size:" + size);
        myMap.clear();
// clear metodu tum Map'teki elemanlari siler.
        isEmpty = myMap.isEmpty();
        size = myMap.size();
        System.out.println("isEmpty:" + isEmpty);
        System.out.println("size:" + size);
    }
}
