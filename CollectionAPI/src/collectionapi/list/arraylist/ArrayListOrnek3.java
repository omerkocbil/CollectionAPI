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
public class ArrayListOrnek3 {

    public static void main(String[] args) {
        ArrayList myArrayList = new ArrayList();
        myArrayList.add(10);
        myArrayList.add(20);
        myArrayList.add(30);
        myArrayList.add(40);
        ArrayList myArrayList2 = new ArrayList();
        myArrayList2.add(5);
// addAll metodu ile tum collection icerigini ekleyebiliriz.
        myArrayList2.addAll(myArrayList);
        for (Object o : myArrayList) {
            System.out.print(o + " ");
        }
        System.out.println();
        for (Object o : myArrayList2) {
            System.out.print(o + " ");
        }
        List mySubList = myArrayList.subList(2, 4);
        System.out.println();
        for (Object o : mySubList) {
            System.out.print(o + " ");
        }
        myArrayList2.removeAll(myArrayList);
// removeAll metodu ile ekledigimiz collectioni cikartabiliriz.
        System.out.println();
        for (Object o : myArrayList2) {
            System.out.print(o + " ");
        }
        myArrayList.removeAll(myArrayList);
        System.out.println();
        for (Object o : myArrayList) {
            System.out.print(o + " ");
        }
    }
}
