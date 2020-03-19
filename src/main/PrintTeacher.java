package main;

import java.util.ArrayList;
import java.util.List;

/**
 * 先生を表示するクラス
 *
 * @author beibo
 *
 */
public class PrintTeacher {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		// 先生リストの作成
		List<Teacher> teacherList = createTeacherList();
		// 先生リスト情報の出力
		printMaxID(teacherList);
	}

	/**
	 * 先生情報リスト作成
	 *
	 * @return
	 */
	private static List<Teacher> createTeacherList() {

		List<Teacher> teacherList = new ArrayList<>();
		// 先生情報の初期化
		Teacher teacher = new Teacher();
		// 先生のID設定
		teacher.setId(2);
		// 先生の名前設定
		teacher.setTeachername("teacher09");
		// 先生の科目設定
		teacher.setCourse("Chinese");

		// 先生情報リスト追加する
		teacherList.add(teacher);
		// 先生情報の初期化
		Teacher teacher1 = new Teacher();
		// 先生のID設定
		teacher.setId(3);
		// 先生の名前設定
		teacher.setTeachername("teacher02");
		// 先生の科目設定
		teacher.setCourse("Japanese");

		// 先生情報リスト追加する
		teacherList.add(teacher);
		// 先生情報の初期化
		Teacher teacher2 = new Teacher();
		// 先生のID設定
		teacher.setId(5);
		// 先生の名前設定
		teacher.setTeachername("teacher04");
		// 先生の科目設定
		teacher.setCourse("Math");

		// 先生情報リスト追加する
		teacherList.add(teacher);
		// 先生情報の初期化
		Teacher teacher3 = new Teacher();
		// 先生のID設定
		teacher.setId(5);
		// 先生の名前設定
		teacher.setTeachername("teacher05");
		// 先生の科目設定
		teacher.setCourse("Music");

		// 先生情報リスト追加する
		teacherList.add(teacher);
		// 先生情報の初期化
		Teacher teacher4 = new Teacher();
		// 先生のID設定
		teacher.setId(7);
		// 先生の名前設定
		teacher.setTeachername("リンこうけん");
		// 先生の科目設定
		teacher.setCourse("java");

		// 先生情報リストに戻す
		return teacherList;

	}

	/**
	 * 先生情報の出力
	 *
	 * @param teacher
	 */
	private static void printTeacher(Teacher teacher) {

		System.out.println("先生のID" + teacher.getId());
		System.out.println("先生の名前" + teacher.getTeachername());
		System.out.println("先生の科目" + teacher.getCourse());
		System.out.println("------------------------");

	}

	/**
	 *
	 * 先生IDの最大値の出力
	 *
	 * @param teacher
	 *            先生情報リスト
	 */
	private static void printMaxID(List<Teacher> teacherList) {

		// リスト一限目を取得し、最大ID先生情報とする
		Teacher maxID = teacherList.get(1);

		// 先生情報リストのサイズで、繰り返す
		for (Teacher teacher1 : teacherList) {

			// 該当先生情報のID 〉最大ID先生情報
			if (teacher1.getId() > maxID.getId()) {

				// 最大ID先生情報 ＝ 該当先生情報のID
				maxID = teacher1;
			}

			// 最大ID先生情報の出力
			printTeacher(maxID);

		}

	}

	
	
}
