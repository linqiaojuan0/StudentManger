package main;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

/**
 * テスト用クラス
 *
 * @author beibo
 *
 */
public class Test {

	private static int heinht = 10;

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		// testParamter(aaa);
		// printMemo();
		// keisan();
		// booleam();
		// testloop();
		// studyMap();
		// print3NumAdd();
		List<Integer> scoreList = creatList();

		// 整数リストの最小値取得
		int minScoe = getMinScore(scoreList);
		System.out.print("リストの最小値"+minScoe);

		// 整数リストの最大値取得
		int maxScore = getMaxScore(scoreList);
		System.out.print("リストの最大値"+maxScore);
	}

	private static void printMemo() {
		System.out.print("よいお年を");
		System.out.print(heinht);
	}

	private static void print3NumAdd() {
		long x = 2147483647;
		long y = 20;
		long z = x + y;

		short a = 32767;

		int b = a;
		long c = b;

		float n = 1.1f;
		double d = 1.2;
		System.out.println(d + d + d);

	}

	private static void keisan() {
		String str1 = "13456";
		String str2 = "abcdef";
		System.out.print(str1 + str2);

	}

	private static void booleam() {
		int a1 = 10;
		int a2 = 3;
		int a3 = 10 / 3;
		int a4 = a1 % a2;
		System.out.println("a3(除算):" + a3);
		System.out.println("a4(除算余数):" + a4);

		boolean flag1 = false;
		boolean flag2 = true;

		System.out.print("flag1:" + flag2);
		System.out.print("flag2:" + flag1);

		boolean flag = a2 > a1;
		System.out.println("結果:" + flag);

		int score = 70;
		if (score >= 60) {
			System.out.println("合格した。");
		} else {
			System.out.println("合格しない");
		}
		if (score == 100) {
			System.out.println("満点！！！");
		} else if (score >= 90) {
			System.out.println("優秀！！！");
		} else if (score >= 80) {
			System.out.println("上！！！");
		} else if (score >= 70) {
			System.out.println("ま～ま～！！！");
		} else if (score >= 60) {
			System.out.println("危ない");
		} else {
			System.out.println("頑張って");
		}

	}

	@SuppressWarnings("unused")
	private static void testloop() {

		String strint1 = "1";
		String strint2 = "1";
		if (strint1.equals(strint2)) {
			System.out.println("文字例比較結果:" + true);
		} else {
			System.out.println("文字例比較結果:" + false);
		}
		System.out.println("--------");

		//リストの初期化
		List<String> list1 = new ArrayList<>();

		//データをリストに追加
		list1.add("a1");
		list1.add("a2");
		list1.add("a3");
		list1.add("a4");
		list1.add("a5");
		list1.add("a6");
		list1.add("a7");
		list1.add("a8");


		List<Integer> list = null;
		System.out.println("リストの最後件目:" + list1.get(list.size() - 1));
		System.out.println("リストの一件目:" + list1.get(7));

		//1.5前のループ書き方
		for (int i = 0; i < 8; i++) {
			System.out.println("リストの" + i + "件目:" + list1.get(i));

		}

		for (String str : list1) {
			System.out.println(str);
		}
		int i = 0;

		//
		while (i < list1.size()) {
			System.out.println("whileループ入力:" + list1.get(i));
			i++;
		}
		for (String str : list1) {
			System.out.println(str);
		}
		// lambda
		list1.stream().forEach(str -> {
			System.out.println("java1.8ループ:" + str);
		});
		// int==Integer
		List<Integer> list2 = new ArrayList<>();
		list2.add(1);
		list2.add(2);
		list2.add(3);
		list2.add(4);
		list2.add(5);
		list2.add(6);

		for (Integer num : list2) {

			System.out.println("Integerテスト:" + num);
		}
		list2.stream().forEach(num -> {
			System.out.println("lambdaテスト:" + num);
		});

	}

	private static void testParamter(String str) {
		System.out.println("バランメータ" + str);
	}

	private static String getMane() {
		return "xiao wang";
	}

	/**
	 * 整数リスト作成
	 *
	 * @return
	 */
	private static List<Integer> creatList() {
		// 整数」リストの初期化

		List<Integer> scoreList = new ArrayList();

		// データを整数リストに追加

		scoreList.add(60);
		scoreList.add(70);
		scoreList.add(80);
		scoreList.add(90);
		scoreList.add(100);

		// 整数リストを戻す
		return scoreList;
	}

	/**
	 * 整数リストの最大値取得
	 *
	 * @param scoreList
	 *            整数リスト
	 * @return 最大値
	 */
	private static int getMaxScore(List<Integer> scoreList) {

		// リストの一件目の値を最大値に制定する

		int maxScore = scoreList.get(0);

		// リストのサイズで、繰り返す
		for (int score : scoreList) {

			// 該当整数＞最大値の場合
			if (score > maxScore) {

				// 該当整数を最大値制定する
				maxScore = score;
			}

		}

		// 最大値を戻す
		return maxScore;
	}

	/**
	 * マップの勉強
	 */

	private static void studyMap() {

		//マップの初期化
		Map<String, String> map = new HashMap<>();

		//データをマップにほっぞんする
		map.put("name", "xiao zhang");
		map.put("age", "15");
		map.put("score", "75");
		map.put("name", "xiaowang");

		map.put("name", "xiao zahng,xiao wang,xiao li");

		//マップから、値を取得
		String name = map.get("name");
		String age = map.get("age");
		String score = map.get("score");

		System.out.println("名前は:" + name);
		System.out.println("年齢は:" + age);
		System.out.println("成績は:" + score);

		System.out.println("----------------");

		// mapのループ書き方（java1.5）
		for (Entry<String, String> entry : map.entrySet()) {

			//きーの取得
			System.out.println("key:" + entry.getKey());
			//値の取得
			System.out.println("value:" + entry.getValue());
		}

		// mapのループ書き方（java1.8）
		map.forEach((key, value) -> {

			System.out.println("key:" + key);
			System.out.println("value:" + value);
		});
		System.out.println("----------------");
	}

	/**
	 * 整数リストの最小値取得
	 *
	 * @param scoreList
	 *            整数リスト
	 * @return 最小値
	 */
	private static int getMinScore(List<Integer> scoreList) {

		// リストの一件目の値を最大値に制定する

		int minScore = scoreList.get(0);

		// リストのサイズで、繰り返す
		for (int score : scoreList) {

			// 該当整数＞最大値の場合
			if (score < minScore) {

				// 該当整数を最大値制定する
				minScore = score;
			}

		}

		// 最大値を戻す
		return minScore;
	}
}