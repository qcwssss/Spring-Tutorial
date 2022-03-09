package com.chen.spring.basics.springin5steps;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class BinarySearchImpl {

    @Autowired
    private SortAlgo sortAlgo;

    public BinarySearchImpl(SortAlgo sortAlgo) {
        this.sortAlgo = sortAlgo;
    }

    public int binarySearch(int[] nums, int target) {
        // Implementing Sorting logic

        int[] sorted = sortAlgo.sort(nums);
        System.out.println(sortAlgo);
        // Search the Array

        return 3;
    }
}
