package object;

import java.util.List;
import java.util.ArrayList;

public class Course {
	private String courseName;
	private String courseId;
	private int credit;
	private List<Teacher> teachers = new ArrayList<>();
	private String[] teacherId;
	public Course(String courseName, String courseId, int credit, String[] teacherId) {
		super();
		this.courseName = courseName;
		this.courseId = courseId;
		this.teacherId = teacherId;
		this.credit = credit;
	}
	public int getCredit() {
		return credit;
	}
	public void setCredit(int credit) {
		this.credit = credit;
	}
	public String[] getTeacherId() {
		return teacherId;
	}
	public void setTeacherId(String[] teacherId) {
		this.teacherId = teacherId;
	}
	public String getCourseName() {
		return courseName;
	}
	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
	public String getCourseId() {
		return courseId;
	}
	public void setCourseId(String courseId) {
		this.courseId = courseId;
	}
	public List<Teacher> getTeachers() {
		return teachers;
	}
	public void setTeachers(List<Teacher> teachers) {
		this.teachers = teachers;
	}
	
}
