/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package collectionapi.list.arraylist;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author jan
 */
public class ArrayListOrnek2 {

    public static void main(String[] args) {
        List myArrayList = new ArrayList();
        boolean isEmpty = myArrayList.isEmpty();
        int size = myArrayList.size();
        System.out.println("isEmpty:" + isEmpty);
        System.out.println("size:" + size);
        myArrayList.add(20);
        myArrayList.add(20);
        myArrayList.add("10");
// eleman ekledikten sonra tekrar test edelim.
        isEmpty = myArrayList.isEmpty();
        size = myArrayList.size();
        System.out.println("isEmpty:" + isEmpty);
        System.out.println("size:" + size);
        boolean contains = myArrayList.contains(20);
        boolean contains2 = myArrayList.contains("10");
        System.out.println("contains:" + contains);
        System.out.println("contains:" + contains2);
// eger yoksa -1 doner
        int indexOf = myArrayList.indexOf(50);
// eger 1den fazla varsa ilk index degeri doner.
        int indexOf2 = myArrayList.indexOf(20);
        System.out.println("indexOf:" + indexOf);
        System.out.println("indexOf:" + indexOf2);
// elemanlari yazdiralim.
        for (Object o : myArrayList) {
            System.out.print(o + " ");
        }
        System.out.println();
// elemani silelim.
        myArrayList.remove(0);
// elemanlari yazdiralim.
        for (Object o : myArrayList) {
            System.out.print(o + " ");
        }
// clear metodu tum elemanlari siler/temizler.
        myArrayList.clear();
        System.out.println("\nsize:" + size);
    }
}
