package basic.question06;

import java.io.IOException;

public class Question06_1 {

	public static void main(String[] args) throws IOException {
		String[] message = { "こんにちは", "Java学習中", "繰り返しの演習", "頑張ります" };
		// TODO:ここに実装
		for (int i = 0; i < 4; i++) {
			System.out.println("こんにちは");
			System.out.println("Java学習中");
			System.out.println("繰り返しの演習");
			System.out.println("頑張ります");
		}
		System.out.println("繰り返し処理が終了しました。");
	}
}
