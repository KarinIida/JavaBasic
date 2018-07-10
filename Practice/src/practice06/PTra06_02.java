package practice06;
/*
 * PTra06_02.java
 *   作成	LIKEIT	2017
 *------------------------------------------------------------
 * Copyright(c) Rhizome Inc. All Rights Reserved.
 */

public class PTra06_02 {
	public static void main(String[] args) {

		// ★ 20回繰り返しを行うfor文を記述してください
		//-----for start
		for (int num = 1; num < 21; num ++) {

			// ★ 今何回目の処理なのかを出力してください
			System.out.println(num + "回目");

			// ★ 奇数回のときには、「奇数」を出力してください
			if(num % 2 == 1)
				System.out.println("奇数");

		}
		//-----for end
	}
}
