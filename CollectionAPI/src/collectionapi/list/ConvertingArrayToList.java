/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package collectionapi.list;

import java.util.Arrays;
import java.util.List;

/**
 *
 * @author jan
 */
public class ConvertingArrayToList {

    public static void main(String[] args) {
        String[] namesArray = {"names1", "names2", "names3", "names4"};
        List namesList = Arrays.asList(namesArray);
// java.util.Arrays sinifinda bulunan asList metodu ile diziyi List'e
// donusturabiliriz.
        int size = namesList.size();
        System.out.println("size:" + size);
        for (String str : namesArray) {
            System.out.println(str);
        }
        // List'teki elemani guncellersek otomatik olarak dizi/arraydeki eleman
                // da guncellenecektir.
        namesList.set(0, "set new names1");
        for (String str : namesArray) {
            System.out.println(str);
        }
// Arrays.asList metodunu kullanarak olarak elde ettigimiz List'e yeni
// eleman ekleyemeyiz!
// namesList.add("java.lang.UnsupportedOperationException");
    }
}
