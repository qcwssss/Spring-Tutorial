package com.chen.spring.basics.springin5steps;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringIn5StepsApplication {


	public static void main(String[] args) {
		BinarySearchImpl bs = new BinarySearchImpl(new QuickSort());
		int res = bs.binarySearch(new int[] {1, 2, 3}, 3);
		System.out.println(res);

		SpringApplication.run(SpringIn5StepsApplication.class, args);
	}

}
