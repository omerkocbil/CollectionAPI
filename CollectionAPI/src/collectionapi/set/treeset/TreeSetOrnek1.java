/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package collectionapi.set.treeset;

import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

/**
 *
 * @author jan
 */
public class TreeSetOrnek1 {

    public static void main(String[] args) {
        Set linkedHashSet = new LinkedHashSet();
        linkedHashSet.add(10);
        linkedHashSet.add(20);
        linkedHashSet.add("non-generic durumda string de ekleyebiliriz.");
        Set treeSet = new TreeSet();
        treeSet.add(10);
        treeSet.add(20);
// TreeSet e Integer elemanlar ekledikten sonra String ekleyemeyiz.
        treeSet.add("ClassCastException");
// java.lang.ClassCastException: java.lang.Integer cannot be cast to
// java.lang.String
    }
}
