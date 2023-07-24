package cn.lioyan.test;

import java.util.PriorityQueue;


/**
 * {@link PriorityQueueTest}
 *
 * @author com.lioyan
 * @since 2023/7/24  15:30
 */
public class PriorityQueueTest
{

    public static void main(String[] args)
    {

        PriorityQueue<Integer> priorityQueue = new PriorityQueue<Integer>(){

        };

        priorityQueue.add(3);
        priorityQueue.add(4);
        priorityQueue.add(2);

        boolean remove = priorityQueue.remove(4);



        Integer poll = priorityQueue.poll();
        System.out.println(poll);


        poll = priorityQueue.poll();
        System.out.println(poll);
    }
}
