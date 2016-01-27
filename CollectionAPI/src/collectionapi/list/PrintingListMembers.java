/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package collectionapi.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/**
 *
 * @author jan
 */
public class PrintingListMembers {

    public static void main(String[] args) {
        List names = new ArrayList();
        names.add("name1");
        names.add("name2");
        names.add("name3");
        names.add("name4");
        System.out.println("For Dongusu");
        for (int i = 0; i < names.size(); i++) {
            System.out.print(names.get(i) + " ");
        }
        System.out.println("\nGelismis For Dongusu");
        for (Object name : names) {
            System.out.print(name + " ");
        }
        System.out.println("\nIterator");
        Iterator iterator = names.iterator();
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }
        System.out.println("\nListIterator");
        ListIterator listIterator = names.listIterator();
        while (listIterator.hasNext()) {
            System.out.print(listIterator.next() + " ");
        }
        System.out.println("\nReverse");
        while (listIterator.hasPrevious()) {
            System.out.println(listIterator.previous());
        }
    }
}
