package main;

import java.math.BigDecimal;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class PrintStudent {

	private static final BigDecimal BigDecimal = null;

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		// 学生情報の作成
		// Student student = setStudentBean();
		// 学生情報の出力
		// PrintStudent(student);

		// 学生リストの作成
		List<Student> studentList = createStudentList();

		// 学生情報の出力（一つずつ取り読むの書き方）
		 //printStudent(studentList.get(0));

		// 学生情報の出力
		// printMaxScoreStudent8(studentList);

		// 最小成績の学生の情報の出力
		// printMinScorestudent(studentList);

		// クラスでマッぷを作成
		// Map<Integer, List<Student>> map = getClassStudent2(studentList);
		// マッぷで学生情報の出力
		// printMap(map);

		// 平均成績の結果のプリント（前作った方法を使う）
		printStudentClassInfo(createsStudentClassInfoList(studentList));

	}

	/**
	 * 学生情報便のテスト
	 */
	private static Student setStudentBean() {

		// 学生情報の初期化
		Student studentOne = new Student();

		// 学生情報のidを設定
		studentOne.setId(1);

		// 学生情報の名前を設定
		studentOne.setName("xiao zhang");

		// 学生情報の年齢dを設定
		studentOne.setAge(15);

		// 学生情報のクラスを設定
		studentOne.setClassid(1);

		Date birthday = strintToDate("1987/04/29 00:00:00", "yyyy/MM/dd HH:mm:ss");

		// 学生情報の生年月日を設定
		studentOne.setBirthday(birthday);

		// 学生情報の成績を設定
		studentOne.setScore(new BigDecimal("88.5"));

		// 学生情報を戻す
		return studentOne;

	}

	/**
	 * 学生情報の出力
	 *
	 * @param student
	 *            学生情報
	 */
	private static void printStudent(Student student) {

		System.out.println("学生情報のid:" + student.getId());
		System.out.println("学生情報の名前:" + student.getName());
		System.out.println("学生情報の年齢:" + student.getAge());
		System.out.println("学生情報のクラス:" + student.getClassid());
		System.out.println("学生情報の生年月日:" + dateToString(student.getBirthday(), "yyyy年MM月dd日"));
		System.out.println("学生情報の成績:" + student.getScore());
	}

	/**
	 * 文字列から、日付けに転換する
	 *
	 * @param str入力文字列
	 * @param format指定したフォーマット（入力文字列のフォーマットと一致）
	 * @return 転換した日付け
	 */
	private static Date strintToDate(String str, String format) {

		LocalDateTime localDateTime = LocalDateTime.parse(str, DateTimeFormatter.ofPattern(format));
		ZonedDateTime timeZone = localDateTime.atZone(ZoneId.systemDefault());
		Date date = Date.from(timeZone.toInstant());
		return date;
	}

	/**
	 * 日付けから、 文字列に転換する
	 *
	 * @param date日付け
	 * @param format指定したフォーマット
	 * @return 転換した文字列
	 */
	private static String dateToString(Date date, String format) {

		Instant instant = date.toInstant();
		ZonedDateTime timeZone = instant.atZone(ZoneId.systemDefault());
		LocalDate localDate = timeZone.toLocalDate();
		return localDate.format(DateTimeFormatter.ofPattern(format));
	}

	/**
	 * 学生情報リストの作成、
	 *
	 * @return 学生情報リスト
	 */
	private static List<Student> createStudentList() {

		List<Student> studentList = new ArrayList<>();

		// 学生情報の初期化
		Student studentOne = new Student();
		// 学生情報のidを設定
		studentOne.setId(1);
		// 学生情報の名前を設定
		studentOne.setName("xiao zhang");
		// 学生情報の年齢dを設定
		studentOne.setAge(25);
		// 学生情報のクラスIDを設定
		studentOne.setClassid(1);
		// 学生情報の成績を設定
		studentOne.setScore(new BigDecimal("75.5"));
		// 生年月日の文字列変数作成
		String strBirthday = "1990-04-19 12:13:14";
		// 生年月日の文字列から、文字列に転換する
		Date birthday = strintToDate(strBirthday, "yyyy-MM-dd HH:mm:ss");
		// 学生情報の生年月日の設定
		studentOne.setBirthday(birthday);

		// 学生情報リストに学生情報を追加する
		studentList.add(studentOne);

		// 学生情報の初期化
		Student studentTwo = new Student();
		// 学生情報のidを設定
		studentTwo.setId(2);
		// 学生情報の名前を設定
		studentTwo.setName("xiao wang");
		// 学生情報の年齢dを設定
		studentTwo.setAge(26);
		// 学生情報のクラスIDを設定
		studentTwo.setClassid(1);
		// 学生情報の成績を設定
		studentTwo.setScore(new BigDecimal("87.5"));
		// 生年月日の文字列変数作成
		String strBirthday2 = "1994-04-19 12:13:14";
		// 生年月日の文字列から、文字列に転換する
		Date birthday2 = strintToDate(strBirthday2, "yyyy-MM-dd HH:mm:ss");
		// 学生情報の生年月日の設定
		studentTwo.setBirthday(birthday2);

		// 学生情報リストに学生情報を追加する
		studentList.add(studentTwo);

		// 学生情報の初期化
		Student studentThree = new Student();
		// 学生情報のidを設定
		studentThree.setId(3);
		// 学生情報の名前を設定
		studentThree.setName("xiao li");
		// 学生情報の年齢dを設定
		studentThree.setAge(26);
		// 学生情報のクラスIDを設定
		studentThree.setClassid(2);
		// 学生情報の成績を設定
		studentThree.setScore(new BigDecimal("87.5"));
		// 生年月日の文字列変数作成
		String strBirthday3 = "1994-04-19 12:13:14";
		// 生年月日の文字列から、文字列に転換する
		Date birthday3 = strintToDate(strBirthday3, "yyyy-MM-dd HH:mm:ss");
		// 学生情報の生年月日の設定
		studentThree.setBirthday(birthday3);

		// 学生情報リストに学生情報を追加する
		studentList.add(studentThree);

		// 学生情報の初期化
		Student studentFour = new Student();
		// 学生情報のidを設定
		studentFour.setId(4);
		// 学生情報の名前を設定
		studentFour.setName("xiao lin");
		// 学生情報の年齢dを設定
		studentFour.setAge(27);
		// 学生情報のクラスIDを設定
		studentFour.setClassid(2);
		// 学生情報の成績を設定
		studentFour.setScore(new BigDecimal("90.5"));
		// 生年月日の文字列変数作成
		String strBirthday4 = "1993-04-19 12:13:14";
		// 生年月日の文字列から、文字列に転換する
		Date birthday4 = strintToDate(strBirthday4, "yyyy-MM-dd HH:mm:ss");
		// 学生情報の生年月日の設定
		studentFour.setBirthday(birthday4);

		// 学生情報リストに学生情報を追加する
		studentList.add(studentFour);

		// 学生情報の初期化
		Student studentFive = new Student();
		// 学生情報のidを設定
		studentFive.setId(5);
		// 学生情報の名前を設定
		studentFive.setName("xiao liu");
		// 学生情報の年齢dを設定
		studentFive.setAge(26);
		// 学生情報のクラスIDを設定
		studentFive.setClassid(3);
		// 学生情報の成績を設定
		studentFive.setScore(new BigDecimal("54.5"));
		// 生年月日の文字列変数作成
		String strBirthday5 = "1994-04-19 12:13:14";
		// 生年月日の文字列から、文字列に転換する
		Date birthday5 = strintToDate(strBirthday5, "yyyy-MM-dd HH:mm:ss");
		// 学生情報の生年月日の設定
		studentFive.setBirthday(birthday5);

		// 学生情報リストに学生情報を追加する
		studentList.add(studentFive);

		// 学生情報の初期化
		Student studentSix = new Student();
		// 学生情報のidを設定
		studentSix.setId(6);
		// 学生情報の名前を設定
		studentSix.setName("xiao qiang");
		// 学生情報の年齢dを設定
		studentSix.setAge(26);
		// 学生情報のクラスIDを設定
		studentSix.setClassid(3);
		// 学生情報の成績を設定
		studentSix.setScore(new BigDecimal("100"));
		// 生年月日の文字列変数作成
		String strBirthday6 = "1994-04-19 12:13:14";
		// 生年月日の文字列から、文字列に転換する
		Date birthday6 = strintToDate(strBirthday6, "yyyy-MM-dd HH:mm:ss");
		// 学生情報の生年月日の設定
		studentSix.setBirthday(birthday6);

		// 学生情報リストに学生情報を追加する
		studentList.add(studentSix);

		// 学生情報リスト戻す
		return studentList;

	}

	/**
	 * 学生情報リストの出力（Java1.5前のループ書き方）
	 *
	 * @param studentList
	 *            学生情報リスト
	 */
	private static void printStudentList(List<Student> studentList) {

		// 学生情報リストのサイズで、繰り返す
		for (int i = 0; i < studentList.size(); i++) {
			// 学生情報の出力
			printStudent(studentList.get(i));
			System.out.println("--------------");
		}

	}

	/**
	 * 学生情報リストの出力（Java1.5前のループ書き方）
	 *
	 * @param studentList
	 *            学生情報リスト
	 */
	private static void printStudentList2(List<Student> studentList) {

		// 学生情報リストのサイズで、繰り返す
		for (Student student : studentList) {
			// 学生情報の出力
			printStudent(student);

		}

	}

	/**
	 * 学生情報リストの出力（Java1.8のループ書き方）
	 *
	 * @param studentList
	 *            学生情報リスト
	 */
	private static void printStudentList3(List<Student> studentList) {

		// 学生情報リストのサイズで、繰り返す
		studentList.stream().forEach(a -> {

			// 学生情報の出力
			printStudent(a);
		});
	}

	/**
	 * 学生情報リストの出力（whileのループ書き方）
	 *
	 * @param studentList
	 *            学生情報リスト
	 */
	private static void printStudentList4(List<Student> studentList) {

		// 計数器
		int i = 0;
		// 計数器＜学生情報リストのサイズの場合
		while (i < studentList.size()) {

			if (i > 2) {
				break;
			}

			if (i == 1) {
				i++;
				continue;
			}
			// 学生情報の出力
			printStudent(studentList.get(i));
			// 計数器＝計数器
			i++;
		}
	}

	/**
	 * 最大成績の学生の情報の出力
	 *
	 * @param studentList
	 */
	private static void printMaxScorestudent(List<Student> studentList) {

		// 学生情報の一件目を最大値成績に設定とする
		Student maxScoreStudent = studentList.get(0);

		// 学生情報のサイズで、繰り返す
		for (Student student : studentList) {

			// 該当学生の成績＞最大成績の学生の成績の場合
			if (student.getScore().compareTo(maxScoreStudent.getScore()) > 0) {
				maxScoreStudent = student;

			}
		}
		// 最大成績の学生の情報の出力
		printStudent(maxScoreStudent);

	}

	/**
	 * 最小成績の学生の情報の出力
	 *
	 * @param studentList
	 */
	private static void printMinScorestudent(List<Student> studentList) {

		// 学生情報の一件目を最小値成績に設定とする
		Student minScoreStudent = studentList.get(0);

		// 学生情報のサイズで、繰り返す
		for (Student student : studentList) {

			// 該当学生の成績＜最小成績の学生の成績の場合
			if (student.getScore().compareTo(minScoreStudent.getScore()) < 0) {
				minScoreStudent = student;

			}
		}
		// 最小成績の学生の情報の出力
		printStudent(minScoreStudent);

	}

	private static void printMaxScoreStudent8(List<Student> studentList) {

		Student maxScoreStudent = studentList.stream().max(Comparator.comparing(Student::getScore)).get();

		// 最大成績の学生情報の出力
		printStudent(maxScoreStudent);
	}

	/**
	 * 学生リストは、クラスでマッぷに保存する
	 *
	 * @param studentList
	 * @return マッぷ
	 */
	private static Map<Integer, List<Student>> getClassStudent(List<Student> studentList) {
		// クラス対応する学生リストのマップの初期化
		Map<Integer, List<Student>> map = new HashMap<>();
		// 学生リストの存在を判断する
		if (studentList != null && studentList.size() > 0) {

			// 学生リストのサイズで繰り返す
			for (Student student : studentList) {

				// 該当学生のクラスIDを取得する
				int classId = student.getClassid();
				// クラスIDに対応する学生リストを取得する
				List<Student> students = map.get(classId);

				// 対応する学生リスト存在しない場合
				if (students == null) {

					// クラス対応する学生リストの初期化
					List<Student> studentListClass = new ArrayList<>();
					// 学生を学生リストに追加する
					studentListClass.add(student);
					// 学生リストをマッぷに保存」する
					map.put(classId, studentListClass);
				} else {
					// 学生を学生リストに追加する
					students.add(student);

				}
			}

		}

		return map;

	}

	/**
	 * 学生リストは、クラスでマッぷに保存する.(java1.8)
	 *
	 * @param studentList
	 * @return マッぷ
	 */
	private static Map<Integer, List<Student>> getClassStudent2(List<Student> studentList) {

		return studentList.stream().collect(Collectors.groupingBy(Student::getClassid));

	}

	/**
	 * マッぷ出力する
	 *
	 * @param map
	 */
	private static void printMap(Map<Integer, List<Student>> map) {

		// マッぷの繰り返し
		map.forEach((key, value) -> {
			System.out.println("クラス" + key + "Jの情報開始");
			value.forEach(student -> printStudent(student));
			System.out.println("クラス" + key + "Jの情報開始");
			System.out.println("--------------");
		});
	}

	/**
	 * クラスで学生情報リスト作成する
	 *
	 * @param studentList(学生情報リスト)
	 * @return クラスで学生情報リストStudentClassInfoList
	 */
	private static List<StudentClassInfo> createsStudentClassInfoList(List<Student> studentList) {
		// クラスの学生情報リストを初期化する
		List<StudentClassInfo> studentClassInfoList = new ArrayList<>();

		// グラスでの学生総合成績をマッぷを初期化
		Map<Integer, BigDecimal> totalScoreByClassIdMap = new HashMap<>();

		// 学生リストの存在を判断する (学生リスはトはnullじゃない、それともサイズは0以上)
		if (studentList != null && studentList.size() > 0) {

			// 学生情報リストのサイズで繰り返す
			for (Student student : studentList) {

				// クラスのID取得する
				int classId = student.getClassid();

				// クラスID存在クラスを初期化する
				boolean existFlag = false;
				// 存在するクラスでの学生情報
				StudentClassInfo hadStudentClassInfo = null;

				// クラスで学生情報リストのサイズで、繰り返す
				for (StudentClassInfo studentClassInfo : studentClassInfoList) {

					// クラスIDが一致の場合
					if (classId == studentClassInfo.getClassId()) {

						// クラス存在する場合
						hadStudentClassInfo = studentClassInfo;
						existFlag = true;
						break;

					}
				}

				// クラスID存在しない場合
				if (!existFlag) {

					setMotExidInfo(classId, student, studentClassInfoList, totalScoreByClassIdMap);
				} else {
					// クラス存在する情報設定
					setExidInfo(hadStudentClassInfo, student, totalScoreByClassIdMap, classId);
				}
			}
		}

		// 平均成績を設定したクラス学生情報リストに戻す
		return setAveScore(studentClassInfoList, totalScoreByClassIdMap);

	}

	/**
	 * クラスの存在しない情報の設定
	 *
	 * @param classId
	 *            クラスID
	 * @param student
	 *            学生情報
	 * @param studentClassInfoList
	 *            クラスでの学生情報リスト
	 * @param totalScoreByClassIdMap
	 *            総成績のマップ
	 */
	private static void setMotExidInfo(int classId, Student student, List<StudentClassInfo> studentClassInfoList,
			Map<Integer, BigDecimal> totalScoreByClassIdMap) {

		// クラスでの学生情報を初期化する
		StudentClassInfo classInfo = new StudentClassInfo();
		// クラスID設定
		classInfo.setClassId(classId);
		// 学生基本情報リストを初期化する
		List<StudentBaseInfo> studentBaseInfoList = new ArrayList<>();
		// 学生情報基本リストを設定する
		classInfo.setStudentBaseInfoList(studentBaseInfoList);

		// 学生基本情報リストを初期化する
		StudentBaseInfo baseInfo = new StudentBaseInfo();

		// 名前設定」
		baseInfo.setName(student.getName());
		// 成績設定
		baseInfo.setScore(student.getScore());
		// 学生基本情報リストを学生基本情報リストに追加
		studentBaseInfoList.add(baseInfo);

		// クラスで 学生情報をクラスでの学生情報リストに追加
		studentClassInfoList.add(classInfo);

		// 総成績の初期化
		BigDecimal totalScore = BigDecimal.ZERO;
		// 総成績の計算
		totalScore = totalScore.add(student.getScore());
		// 総成績をマッぷで保存する
		totalScoreByClassIdMap.put(classId, totalScore);

	}

	/**
	 * クラス存在する情報の設定
	 *
	 * @param hadStudentClassInfo
	 *            学生基本情報」
	 * @param student
	 *            学生情報
	 * @param totalScoreByClassIdMap
	 *            総成績マッぷ
	 * @param classId
	 *            クラスID
	 */
	private static void setExidInfo(StudentClassInfo hadStudentClassInfo, Student student,
			Map<Integer, BigDecimal> totalScoreByClassIdMap, int classId) {

		List<StudentBaseInfo> studentBaseInfoList = hadStudentClassInfo.getStudentBaseInfoList();

		addBaseInfo(student, studentBaseInfoList);

		// 総成績の取得
		BigDecimal totalScore = totalScoreByClassIdMap.get(classId);
		// 総成績の計算
		totalScore = totalScore.add(student.getScore());
		// 総成績をマッぷで保存する
		totalScoreByClassIdMap.put(classId, totalScore);
	}

	/**
	 * 学生情報を学生基本情報に追加する
	 *
	 * @param student
	 *            学生情報
	 * @param studentBaseInfoList
	 *            学生基本情報
	 */
	private static void addBaseInfo(Student student, List<StudentBaseInfo> studentBaseInfoList) {

		// 学生基本情報リストを初期化する
		StudentBaseInfo baseInfo = new StudentBaseInfo();
		// 名前設定」
		baseInfo.setName(student.getName());
		// 成績設定
		baseInfo.setScore(student.getScore());
		// 学生基本情報を学生基本情報リストに追加
		studentBaseInfoList.add(baseInfo);

	}

	/**
	 * クラス学生情報リストに平均成績を設定する
	 *
	 * @param studentClassInfoList
	 *            クラス学生情報リスト
	 * @param totalScoreByClassIdMap
	 *            総成績をマッぷ
	 * @return 平均成績を設定したクラス学生情報リスト
	 */
	private static List<StudentClassInfo> setAveScore(List<StudentClassInfo> studentClassInfoList,
			Map<Integer, BigDecimal> totalScoreByClassIdMap) {
		for (StudentClassInfo studentClassInfo : studentClassInfoList) {
			// クラスIDを取得する
			int classId = studentClassInfo.getClassId();
			// クラスの総成績をマッぷから取得する
			BigDecimal totalScore = totalScoreByClassIdMap.get(classId);
			// （学生のサイズ） ＝該当クラスリストから学生のサイズを取得して
			int studentSize = studentClassInfo.getStudentBaseInfoList().size();
			// （平均成績を）＝mapから取得したの総成績を学生のサイズに除算
			BigDecimal studentSizeScore = totalScore.divide(new BigDecimal(studentSize), 2, 2);
			// 該当クラスに学生の平均成績に設定する
			studentClassInfo.setRateScore(studentSizeScore);
		}

		return studentClassInfoList;

	}

	/**
	 * クラス学生情報出力
	 *
	 * @param studentClassInfoList
	 */
	private static void printStudentClassInfo(List<StudentClassInfo> studentClassInfoList) {

		studentClassInfoList.stream().forEach(classInfo -> {
			System.out.println("クラス" + classInfo.getClassId());
			System.out.println("平均成績は" + classInfo.getRateScore());
			List<StudentBaseInfo> studentBaseInfoList = classInfo.getStudentBaseInfoList();
			studentBaseInfoList.stream().forEach(baseInfo -> {
				System.out.print("名前" + baseInfo.getName());
				System.out.println("成績" + baseInfo.getScore());
				System.out.println("---------------------");
			});
		});
	}

}
