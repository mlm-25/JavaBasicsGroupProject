package com.syntax.group.project01;

public class Part3 {

	public static void main(String[] args) {

		int sumEven = 0;
		int sumOdd = 0;
		int[][] num = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
		for (int i = 0; i < num.length; i++) {
			for (int j = 0; j < num[i].length; j++) {
				if (num[i][j] % 2 == 0) {
					sumEven = sumEven + num[i][j];
				} else {
					sumOdd += num[i][j];
				}
			}
		}
		System.out.println(sumEven);
		System.out.println(sumOdd);
	}

}
