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
class Car {

    String hp;
    String brand;
    Integer price;

    public Car(String hp, String brand, Integer price) {
        super();
        this.hp = hp;
        this.brand = brand;
        this.price = price;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((brand == null) ? 0 : brand.hashCode());
        result = prime * result + ((hp == null) ? 0 : hp.hashCode());
        result = prime * result + ((price == null) ? 0 : price.hashCode());
        return result;
    }

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

    @Override
    public String toString() {
        return "Car [hp=" + hp + ", brand=" + brand + ", price=" + price + "]";
    }
}

public class HashSetOrnek3 {

    public static void main(String[] args) {
        Car car = new Car("100HP", "Ford", 1000);
        Car car2 = new Car("100HP", "Ford", 1000);
// car.equals(car2) true donecektir. Dolayisiyla duplicate olacaktir.
// car car3 car4 arasinda equals false oldugu icin Set'e duplicate
// olmadan eklenir.
        Car car3 = new Car("50HP", "Fiat", 1000);
        Car car4 = new Car("10HP", "Ford", 100);
        Set<Car> carSet = new HashSet<Car>();
        carSet.add(car);
        carSet.add(car2);
        carSet.add(car3);
        carSet.add(car4);
        System.out.println(carSet.size());
        for (Car c : carSet) {
            System.out.println(c);
        }
    }
}
