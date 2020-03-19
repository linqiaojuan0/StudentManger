package main;

import java.math.BigDecimal;

/**
 * 学生基本情報クラス
 *
 * @author beibo
 *
 */
public class StudentBaseInfo {

	/**
	 * 学生の名前
	 */
	private String name;
	/**
	 * 学生の成績
	 */
	private BigDecimal score;

	/**
	 * @return name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name
	 *            セットする name
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return score
	 */
	public BigDecimal getScore() {
		return score;
	}

	/**
	 * @param score
	 *            セットする score
	 */
	public void setScore(BigDecimal score) {
		this.score = score;
	}

}
