/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package collectionapi.set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 *
 * @author jan
 */
public class PrintingSetMembers {

    public static void main(String[] args) {
        Set<Integer> numbers = new HashSet<Integer>();
        numbers.add(10);
        numbers.add(25);
        numbers.add(100);
        numbers.add(500);
        numbers.add(1000);
        for (int i : numbers) {
            System.out.println(i);
        }
        System.out.println();
        Iterator iterator = numbers.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
