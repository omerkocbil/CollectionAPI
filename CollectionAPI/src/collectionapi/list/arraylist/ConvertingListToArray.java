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
public class ConvertingListToArray {

    public static void main(String[] args) {
        List namesList = new ArrayList();
        namesList.add("name1");
        namesList.add("names");
        namesList.add("name3");
        namesList.add("name4");
        Object[] namesObjectArray = namesList.toArray();
// Object array
        for (Object name : namesObjectArray) {
            System.out.print(name + " ");
        }
        System.out.println();
        String[] namesStringArray = new String[namesList.size()];
        namesStringArray = (String[]) namesList.toArray(namesStringArray);
// String array
        for (String name : namesStringArray) {
            System.out.print(name + " ");
        }
        System.out.println();
        namesStringArray[0] = "new name1";
        System.out.println(namesStringArray[0]);
        System.out.println(namesObjectArray[0]);
        System.out.println(namesList.get(0));
// asList metodunun aksine degisiklikten etkilenmez.
        namesList.add("add new name");
// List'e yeni eleman ekleyebiliriz.
    }
}
