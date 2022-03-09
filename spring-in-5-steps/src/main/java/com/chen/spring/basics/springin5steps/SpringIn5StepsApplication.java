package com.chen.spring.basics.springin5steps;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringIn5StepsApplication {
	// What are the beans? -> @Component
	// What are the dependencies of a bean? ->@Autowired

	public static void main(String[] args) {
//		BinarySearchImpl bs = new BinarySearchImpl(new QuickSort());
		ApplicationContext applicationContext =
				SpringApplication.run(SpringIn5StepsApplication.class, args);
		BinarySearchImpl binarySearch = applicationContext.getBean(BinarySearchImpl.class);
		SpringApplication.run(SpringIn5StepsApplication.class, args);

		int res = binarySearch.binarySearch(new int[] {1, 2, 3}, 3);
		System.out.println(res);

	}

}
