package main;

import java.math.BigDecimal;
import java.util.Date;

public class Student {

	/**
	 * ID
	 */
	private int id;

	/**
	 * 名前
	 */
	private String name;

	/**
	 * 生年月日
	 */
	private Date birthday;

	/**
	 * 年齢
	 */
	private int age;

	/**
	 * 分数
	 */
	private BigDecimal score;

	/**
	 * クラスID
	 */
	private int classid;

	/**
	 * @return id
	 */
	public int getId() {
		return id;
	}

	/**
	 * @param i セットする id
	 */
	public void setId(int i) {
		this.id = i;
	}

	/**
	 * @return name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name セットする name
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return birthday
	 */
	public Date getBirthday() {
		return birthday;
	}

	/**
	 * @param birthday セットする birthday
	 */
	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}

	/**
	 * @return age
	 */
	public int getAge() {
		return age;
	}

	/**
	 * @param age セットする age
	 */
	public void setAge(int age) {
		this.age = age;
	}

	/**
	 * @return score
	 */
	public BigDecimal getScore() {
		return score;
	}

	/**
	 * @param score セットする score
	 */
	public void setScore(BigDecimal score) {
		this.score = score;
	}

	/**
	 * @return classid
	 */
	public int getClassid() {
		return classid;
	}

	/**
	 * @param classid セットする classid
	 */
	public void setClassid(int classid) {
		this.classid = classid;
	}


}
