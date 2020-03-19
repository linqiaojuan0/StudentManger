package main;
/**
 * 先生情報クラス
 * @author beibo
 *
 */
public class Teacher {
	/**
	 * ID
	 */
	private int id;
	/**
	 * 先生名前
	 */
	private String teachername;
	/**
	 * 学科科目
	 */
	private String course;
	/**
	 * @return id
	 */
	public int getId() {
		return id;
	}
	/**
	 * @param id セットする id
	 */
	public void setId(int id) {
		this.id = id;
	}
	/**
	 * @return teachername
	 */
	public String getTeachername() {
		return teachername;
	}
	/**
	 * @param teachername セットする teachername
	 */
	public void setTeachername(String teachername) {
		this.teachername = teachername;
	}
	/**
	 * @return course
	 */
	public String getCourse() {
		return course;
	}
	/**
	 * @param course セットする course
	 */
	public void setCourse(String course) {
		this.course = course;
	}
	
	

}
