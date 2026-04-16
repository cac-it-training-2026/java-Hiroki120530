package basic.question05;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 第8章 条件分岐
 */

public class Question05_3 {

	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("曜日を日本語で入力してください。");
		String userDayInput = reader.readLine();
		switch (userDayInput) {
		case "月曜日":
			System.out.println("月曜日");
			break;
		case "火曜日":
			System.out.println("火曜日");
			break;
		case "水曜日":
			System.out.println("水曜日");
			break;
		case "木曜日":
			System.out.println("木曜日");
			break;
		case "金曜日":
			System.out.println("金曜日");
			break;
		case "土曜日":
			System.out.println("土曜日");
			break;
		case "日曜日":
			System.out.println("日曜日");
			break;

		}
		// TODO:ここに実装

	}
}
