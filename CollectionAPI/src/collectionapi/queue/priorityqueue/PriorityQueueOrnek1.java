/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package collectionapi.queue.priorityqueue;

import java.util.PriorityQueue;
import java.util.Queue;

/**
 *
 * @author jan
 */
public class PriorityQueueOrnek1 {

    public static void main(String[] args) {
        Queue pq = new PriorityQueue();
//pq.add(null);
//PriorityQueue e null eleman eklenemez.
        pq.add(10);
        pq.add("10");
// NonGenerics bir PriorityQueue yapisinda ilk eleman Integer‘sa sonrasinda
// farkli tipte bir eleman eklenemez 
// java.lang.ClassCastException
// java.lang.Integer cannot be cast to java.lang.String
    }
}
