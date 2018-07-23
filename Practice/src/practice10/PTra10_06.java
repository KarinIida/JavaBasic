package practice10;
/*
 * PTra10_06.java
 *   作成	LIKEIT	2017
 *------------------------------------------------------------
 * Copyright(c) Rhizome Inc. All Rights Reserved.
 */

public class PTra10_06 {

	/*
	 * PTra10_05で作成したCarクラスを使用します
	 */

	public static void main(String[] args) {

		/*
		 * carインスタンスを3件作成し、それぞれの色、ガソリンを入力して決定してください
		 * 各carインスタンスのrunメソッドを実行して、それぞれ「目的地にまでn時間かかりました。残りのガソリンは、xリットルです」を出力してください。
		 */
		Car[] cars = new Car[3];

		Car car1 = new Car();
		car1.color = "Blue";
		car1.gasoline = 60;

		Car car2 = new Car();
		car2.color = "Green";
		car2.gasoline = 40;

		Car car3 = new Car();
		car3.color = "Yellow";
		car3.gasoline = 70;

		cars[0] = car1;
		cars[1] = car2;
		cars[2] = car3;

		int sum1 = 0;
		int i = 0;
		while(true) {
			int run1 = car1.run();
			i++;
			int distance1 = 300;
			sum1 += run1;
			System.out.println(sum1);

			if(sum1 > distance1) {
				System.out.println("目的地にまで" + i+ "時間かかりました。残りのガソリンは、"+ car1.gasoline +"リットルです");
				break;
			}
			if (run1 == -1) {
				System.out.println("目的地に到達できませんでした");
				break;
			}
		}
		int sum2 = 0;
		int a = 0;
		while(true) {
			int run2 = car2.run();
			a++;
			int distance2 = 200;
			sum2 += run2;
			System.out.println(sum2);

			if(sum2 > distance2) {
				System.out.println("目的地にまで" + a+ "時間かかりました。残りのガソリンは、"+ car2.gasoline +"リットルです");
				break;
			}
			if(run2 == -1) {
				System.out.println("目的地に到達できませんでした");
				break;
			}
		}
		int sum3 = 0;
		int b = 0;
		while(true) {
			int run3 = car3.run();
			b++;
			int distance3 = 400;
			sum3 += run3;
			System.out.println(sum3);

			if(sum3 > distance3) {
				System.out.println("目的地にまで" + b+ "時間かかりました。残りのガソリンは、"+ car3.gasoline +"リットルです");
				break;
			}
			if(run3 == -1) {
				System.out.println("目的地に到達できませんでした");
				break;
			}
		}
	}
}
