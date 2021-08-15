package com.syntax.group.project01;

public class Part7 {

	public static void main(String[] args) {

		int[] num = { 1, 2, 3, 4, 5 };
		int min;
		int max;

		min = max = num[0];

		for (int i = 0; i < num.length; i++) {

			if (num[i] > max) {
				max = num[i];
			} else if (num[i] < min) {
				min = num[i];
			}
		}
		System.out.println("Smallest is " + min);
		System.out.println("Largest is " + max);

	}

}
