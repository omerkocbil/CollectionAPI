/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package collectionapi.set;

import java.util.LinkedHashSet;
import java.util.Set;

/**
 *
 * @author jan
 */
public class ConvertingSetToArray {

    public static void main(String[] args) {
        Set<String> names = new LinkedHashSet<String>();
        names.add("names1");
        names.add("names2");
        names.add("names3");
        names.add("names4");
        names.add("names4");
        Object[] objectArray = new Object[names.size()];
        objectArray = names.toArray();
        for (Object o : objectArray) {
            System.out.println(o);
        }
        System.out.println();
        String[] myArray = new String[names.size()];
        names.toArray(myArray);
        for (String name : myArray) {
            System.out.println(name);
        }
    }
}
