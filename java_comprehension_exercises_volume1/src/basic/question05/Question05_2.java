package basic.question05;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 第8章 条件分岐
 */

public class Question05_2 {

	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		int[] numberGroup = { 3, 5, 7, 9 };
		if (numberGroup[3] == 3) {
			System.out.println("4番目の要素は3です。");
		} else if (numberGroup[3] == 5) {
			System.out.println("4番目の要素は5です。");
		} else if (numberGroup[3] == 7) {
			System.out.println("4番目の要素は7です。");
		} else {
			System.out.println("4番目の値は３，５，７以外の値です。");
		}
		// TODO:ここに実装

	}
}
