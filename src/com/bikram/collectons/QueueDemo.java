package com.bikram.collectons;

import com.sun.security.jgss.GSSUtil;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class QueueDemo {
    //Queue is FIFO(First In First Out)
    //Elements are added to tail,and read from head
    //offer, peek

    public static void main(String[] args) {
        Queue<String> q1=new LinkedList<>();//Creating queue of LinkedList

        q1.offer("Visit Relatives");
        q1.offer("Do Assignment");
        q1.offer("Watch Movie");

        System.out.println(q1.peek());//retrives head element
        System.out.println(q1);
        System.out.println(q1.poll());//retrives and remove head element
        System.out.println(q1);

        //Queue of type PriorityQueue

        PriorityQueue<String> queue = new PriorityQueue<>();
        queue.offer("BSCIT");
        queue.offer("DCOM");
        queue.offer("BARCH0");
        System.out.println(queue);
        System.out.println(queue.poll());
        System.out.println(queue);
        System.out.println(queue.poll());
        System.out.println(queue);


    }
}
