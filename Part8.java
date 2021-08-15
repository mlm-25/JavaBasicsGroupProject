package com.syntax.group.project01;

public class Part8 {

	public static void main(String[] args) {

		int largest = 0;
		int secondLargest = 0;

		int[] numbers = { 1, 2, 3, 4, 5 };

		for (int i = 0; i < numbers.length; i++) {
			if (numbers[i] > largest) {
				secondLargest = largest;
				largest = numbers[i];
			} else if (numbers[i] > secondLargest && numbers[i] != largest) {
				secondLargest = numbers[i];
			}
		}
		System.out.println(secondLargest);

	}
}
