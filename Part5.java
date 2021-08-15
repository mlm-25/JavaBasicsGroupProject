package com.syntax.group.project01;

public class Part5 {

	public static void main(String[] args) {
		int num = 29;
		boolean prime = false;
		for (int i = 2; i <= num / 2; ++i) {

			if (num % i == 0) {
				prime = true;
				break;
			}
		}
		if (!prime)
			System.out.println(num + " is a prime number.");
		else
			System.out.println(num + " is not a prime number.");
	}
}
