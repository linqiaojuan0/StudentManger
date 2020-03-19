package main;

import java.math.BigDecimal;
import java.util.List;

/**
 * クラスの学生情報
 * @author beibo
 *
 */
public class StudentClassInfo {
	/**
	 * クラスID
	 */
	private int classId;
	/**
	 * 平均成績
	 */
	private BigDecimal rateScore;
/**
 * 学生基本情報リスト
 */
	private List<StudentBaseInfo> studentBaseInfoList;
/**
 * @return classId
 */
public int getClassId() {
	return classId;
}
/**
 * @param classId セットする classId
 */
public void setClassId(int classId) {
	this.classId = classId;
}
/**
 * @return rateScore
 */
public BigDecimal getRateScore() {
	return rateScore;
}
/**
 * @param rateScore セットする rateScore
 */
public void setRateScore(BigDecimal rateScore) {
	this.rateScore = rateScore;
}
/**
 * @return studentBaseInfoList
 */
public List<StudentBaseInfo> getStudentBaseInfoList() {
	return studentBaseInfoList;
}
/**
 * @param studentBaseInfoList セットする studentBaseInfoList
 */
public void setStudentBaseInfoList(List<StudentBaseInfo> studentBaseInfoList) {
	this.studentBaseInfoList = studentBaseInfoList;
}

}
