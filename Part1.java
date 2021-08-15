package com.syntax.group.project01;

public class Part1 {

	public static void main(String[] args) {

		int[][] num = { { 10, 20, 30 }, { 1, 2, 3 }, { 3, 4, 5 } };
		int sum = 0;

		for (int i = 0; i < num.length; i++) {
			for (int j = 0; j < num[i].length; j++) {
				sum = sum + num[i][j];

			}
		}
		System.out.println(sum);
	}
}
