package io.sb.lambdastreams.examples;

import java.util.Arrays;
import java.util.List;

	public class LambdaStreamEvenSum {

	    public static void main(String[] args) {

	        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
	        
	        
	        int result = 0;        
	        
	        // External Iterator - basic for loop
	        for(int i=0;i<numbers.size();i++) {
	        	if(numbers.get(i) % 2 == 0) {
	        	result+= numbers.get(i);
	        	}
	        }
	        System.out.println("Even Sum - for loop:"+ result);
	        
	        // External Iterator - for each loop
	        int sum = 0;
	        for(Integer number: numbers) {
	        	if(number % 2 == 0) {
	        		sum+=number;
	        	}        	
	        }
	        System.out.println("Even Sum - for each:"+ sum);
	        
	        //using streams and lambdas
	        System.out.println("Even Sum - streams:" +
	        numbers.stream()
	               .filter(number -> number%2 == 0)
	               .reduce(0,Integer::sum));

	        //other way of doing it
	        System.out.println(numbers.stream()
	                                .filter(number -> number%2==0)
	                                .mapToInt(number -> number.intValue())
	                                .sum());
	    }

	}


