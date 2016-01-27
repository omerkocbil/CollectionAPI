/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package collectionapi.set.treeset;

import java.util.Set;
import java.util.TreeSet;

/**
 *
 * @author jan
 */

class NewCar{

}

public class TreeSetOrnek2 {

    public static void main(String[] args) {
        Set treeSetCar = new TreeSet();
        NewCar car = new NewCar();
        treeSetCar.add(car);
// Car sinifi Comparable olmadigi icin calisma zamaninda
// java.lang.ClassCastException hatasi verecektir.
    }
}
