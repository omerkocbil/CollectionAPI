/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package collectionapi.set.hashset;

import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author jan
 */

class NewCar{

}

public class HashSetOrnek2 {

    public static void main(String[] args) {
        NewCar car = new NewCar();
        NewCar car2 = new NewCar();
        NewCar car3 = new NewCar();
        Set<NewCar> carSet = new HashSet<NewCar>();
        carSet.add(car);
        carSet.add(car2);
        carSet.add(car3);
        System.out.println(carSet.size());
    }
}
