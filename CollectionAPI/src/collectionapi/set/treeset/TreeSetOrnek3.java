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
class Car implements Comparable {

    public Car(String hp, String brand, Integer price) {
        super();
        this.hp = hp;
        this.brand = brand;
        this.price = price;
    }
    private String hp;
    private String brand;
    private Integer price;

    @Override
    public String toString() {
        return "Car [hp=" + hp + ", brand=" + brand + ", price=" + price + "]";
    }

    @Override
    public int compareTo(Object o) {
        return price.compareTo(((Car)o).price);
    }
}

public class TreeSetOrnek3 {

    public static void main(String[] args) {
        Car ford = new Car("50", "fiat", 50);
        Car fiat = new Car("20", "fiat", 50);
        Car subaru = new Car("500", "subaru", 5000);
        Car bmw = new Car("200", "bmv", 1000);
        Set treeSetCar = new TreeSet();
        treeSetCar.add(ford);
        treeSetCar.add(fiat);
        treeSetCar.add(subaru);
        treeSetCar.add(bmw);
        for (Object c : treeSetCar) {
            System.out.println(c);
        }
    }
}
