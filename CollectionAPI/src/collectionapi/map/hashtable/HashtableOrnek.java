/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package collectionapi.map.hashtable;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

/**
 *
 * @author jan
 */
public class HashtableOrnek {

    public static void main(String[] args) {
        Map hashMap = new HashMap();
        hashMap.put(null, null);
// HashMap e null key veya null value olabilir.
        Map hashtable = new Hashtable();
        hashtable.put(null, null);
// Hashtable null key veya null value eklenemez.
// calisma zamaninda hata verecektir.
// java.lang.NullPointerException
    }
}
