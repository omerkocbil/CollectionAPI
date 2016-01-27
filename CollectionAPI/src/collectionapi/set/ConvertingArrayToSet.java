/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package collectionapi.set;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author jan
 */
public class ConvertingArrayToSet {

    public static void main(String[] args) {
        String[] names = {"name1", "name2", "name3", "name4", "name5"};
        Set<String> mySet = new HashSet<String>(Arrays.asList(names));
        mySet.add("name6");
        for (String name : mySet) {
            System.out.println(name);
        }
    }
}
