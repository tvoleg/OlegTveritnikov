package com.lesson1.lesson17.heavyBox;

import com.lesson1.lesson17.heavyBox.HeavyBox;

import java.util.*;

public class HeavyBoxDemo {
    public static void main(String[] args) {
        Deque<HeavyBox> queue = new ArrayDeque<>();
        queue.offer(new HeavyBox(3, 4, 5));
        queue.offer(new HeavyBox(33, 44, 55));
        queue.offer(new HeavyBox(34, 4324, 5234));
        while (queue.size() > 0) {
            System.out.println(queue.poll());
        }
    }
}
