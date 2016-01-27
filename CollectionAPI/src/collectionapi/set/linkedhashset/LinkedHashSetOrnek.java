/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package collectionapi.set.linkedhashset;

import java.util.LinkedHashSet;
import java.util.Set;

/**
 *
 * @author jan
 */
public class LinkedHashSetOrnek {

    public static void main(String[] args) {
        Set<Integer> numbers = new LinkedHashSet<Integer>();
        numbers.add(5);
        numbers.add(5);
// Ayni int degerini 2 kere eklemeye izin vermez.
        numbers.add(10);
        numbers.add(25);
        numbers.add(100);
        numbers.add(500);
        numbers.add(1000);
        for (Integer number : numbers) {
            System.out.println(number);
        }
        Set<String> names = new LinkedHashSet<String>();
        names.add("names1");
        names.add("names2");
        names.add("names3");
        names.add("names4");
        names.add("names4");
        names.add(new String("names4"));
// ayni String degeri eklememize izin vermez.
        for (String name : names) {
            System.out.println(name);
        }
    }
}
