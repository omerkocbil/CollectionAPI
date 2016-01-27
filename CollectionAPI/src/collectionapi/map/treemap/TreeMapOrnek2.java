/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package collectionapi.map.treemap;

import java.util.TreeMap;

/**
 *
 * @author jan
 */
class Animal {

}

class Car implements Comparable {

    public Car(String hp, String brand, Integer price) {
        super();
        this.hp = hp;
        this.brand = brand;
        this.price = price;
    }
    String hp;

    @Override
    public String toString() {
        return "Car [hp=" + hp + ", brand=" + brand + ", price=" + price + "]";
    }
    String brand;
    Integer price;

    @Override
    public int compareTo(Object o) {
        return price.compareTo(((Car)o).price);
    }
}

public class TreeMapOrnek2 {
    public static void main(String[] args) {
        Animal animal = new Animal();
        TreeMap<Animal, String> animalTreeMap = new TreeMap<Animal, String>();
// animalTreeMap.put(animal, "java.lang.ClassCastException");
// key olarak Comparable olan siniflari kullanabiliriz. Yani bu durumda
// Animal sinifi Comparable olmali aksi durumda calisma zamaninda hata
// verecektir.
        Car ford = new Car("50", "ford", 100);
        Car ford2 = new Car("150", "ford", 500);
        Car ford3 = new Car("250", "ford", 1000);
        TreeMap<Car, String> carTreeMap = new TreeMap<Car, String>();
        carTreeMap.put(ford, "cheap car");
        carTreeMap.put(ford3, "fast car");
        carTreeMap.put(ford2, "nice car");
        for (Car key : carTreeMap.keySet()) {
            System.out.println(key + " -->" + carTreeMap.get(key));
        }
    }
}
