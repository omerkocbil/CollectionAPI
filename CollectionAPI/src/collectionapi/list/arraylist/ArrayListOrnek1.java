/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package collectionapi.list.arraylist;

import java.util.ArrayList;

/**
 *
 * @author jan
 */
public class ArrayListOrnek1 {

    public static void main(String[] args) {
        ArrayList myArrayList = new ArrayList();
// ArrayListOrnek1'e elemani add metodu ile ekleyebiliriz.
        myArrayList.add(10);
        myArrayList.add(20);
        myArrayList.add("test");
        myArrayList.set(2, "new set text");
//set metodu ile ilgili indexteki elemani override edebiliriz.
        myArrayList.add(true);
        myArrayList.add(new Test());
// overloaded add metodunu kullanarak ilgili indexe eleman
// ekleyebiliriz.
        myArrayList.add(1, '#');
        for (int i = 0; i < myArrayList.size(); i++) {
            System.out.println(myArrayList.get(i));
        }
    }
    
    static class Test{
    
    }
}
