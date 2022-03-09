package com.chen.spring.basics.springin5steps;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class BubbleSort implements SortAlgo{

    public int[] sort(int[] nums) {
        // Logic for Bubble sort
        return nums;
    }
}
