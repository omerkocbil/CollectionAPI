/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package collectionapi.map.hashmap;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author jan
 */
class Animal {
}

class Dog {

    String name;
    int age;

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        Dog other = (Dog) obj;
        if (age != other.age) {
            return false;
        }
        if (name == null) {
            if (other.name != null) {
                return false;
            }
        } else if (!name.equals(other.name)) {
            return false;
        }
        return true;
    }

    public Dog(String name, int age) {
        super();
        this.name = name;
        this.age = age;
    }
}

class Car {

    public Car(String hp, String brand, Integer price) {
        super();
        this.hp = hp;
        this.brand = brand;
        this.price = price;
    }
    String hp;
    String brand;
    Integer price;

    @Override
    public int hashCode() {
        return brand.length();
    }
// hashCode olarak bu metot kullanildiginda brand degisirse ilgili elemana
// ulasamayiz.
// @Override
// public int hashCode() {
// return 10;
// }
// hashCode olarak bu metot kullanildiginda brand degisse de ilgili elemana
// ulasilabilir.Cunku hashCode degeri degismemekte.
// Map mantiginda elemanlarin bulunmasi icin once hashCode degerine bakilir.
// Sonrasinda equals a bakilir.

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        Car other = (Car) obj;
        if (brand == null) {
            if (other.brand != null) {
                return false;
            }
        } else if (!brand.equals(other.brand)) {
            return false;
        }
        if (hp == null) {
            if (other.hp != null) {
                return false;
            }
        } else if (!hp.equals(other.hp)) {
            return false;
        }
        if (price == null) {
            if (other.price != null) {
                return false;
            }
        } else if (!price.equals(other.price)) {
            return false;
        }
        return true;
    }
}

public class HashMapOrnek4 {
    public static void main(String[] args) {
        Animal animal = new Animal();
        Animal animal2 = new Animal();
        Map animalMap = new HashMap();
        animalMap.put(animal, "animal value");
        System.out.println("animal : " + animalMap.get(animal2));
// animal2.hashCode() == animal.hashCode() false oldugu icin ve
// animal2.equals(animal) false oldugu icin null deger donecektir.
        Dog dog = new Dog("dog1", 5);
        Dog dog2 = new Dog("dog1", 5);
        Map dogMap = new HashMap();
        dogMap.put(dog, "dog value1");
// dog.equals(dog2); true
// dog.hashCode() == dog2.hashCode() false oldugu durumda elemani
// bulamaz
        System.out.println("dog :" + dogMap.get(dog2));
        Car car = new Car("50", "ford", 100);
        Map hashMap = new HashMap();
        hashMap.put(car, "value1");
        System.out.println(hashMap.get(car));
        car.brand = "bmw";
        System.out.println(hashMap.get(car));
    }
}
