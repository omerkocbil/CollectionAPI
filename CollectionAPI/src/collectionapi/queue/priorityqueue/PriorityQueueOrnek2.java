/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package collectionapi.queue.priorityqueue;

import java.util.PriorityQueue;

/**
 *
 * @author jan
 */
public class PriorityQueueOrnek2 {

    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
        pq.add(1);
        pq.add(100);
        pq.add(10);
        pq.add(10);
        pq.add(50);
        pq.add(12);
        pq.add(150);
        /*
         * add metodu offer metodunu cagirmaktadir.
         * public boolean add(E e) {
         * return offer(e);
         * }
         */
        pq.offer(-20);
        pq.offer(-40);
        pq.remove(12);
        Integer firstElement = pq.peek();
// peek metodu PriorityQueue'teki ilk elemani dondurur fakat bu elemani
// silmez.
        System.out.println(firstElement);
        Integer firstElementPoll = pq.poll();
// poll metodu PriorityQueue'teki ilk elemani dondurur fakat bu elemani
// siler.
        System.out.println(firstElementPoll);
        Integer secondElementRemove = pq.remove();
// remove metodu poll metodunu cagirir.
        System.out.println(secondElementRemove);
        firstElement = pq.peek();
        firstElement = pq.peek();
        firstElement = pq.peek();
        firstElement = pq.element();
        /*
         * element metodu peek metodunu cagirir.
         *
         * public E element() {
         * E x = peek();
         * if (x != null)
         * return x;
         * else
         * throw new NoSuchElementException();
         * }
         */
// -20 silindigi icin peek metodu -10 donecektir ve -10 degerini silmez.
// bu metodu defalarca cagirabiliriz sonuc degismez.
        System.out.println(firstElement);
        System.out.println(pq);
// Arka planda Iterator calisir ve Ordered olarak yazma garantisi
// yoktur.
        int size = pq.size();
// poll metodu elemani sildigi icin for dongusu disinda size metodu
// cagrilmalidir.
        for (int i = 0; i < size; i++) {
            System.out.print(pq.poll() + " ");
        }
        System.out.println();
        System.out.println(pq.peek());
// artik elaman kalmadigi icin null donecektir.
    }
}
