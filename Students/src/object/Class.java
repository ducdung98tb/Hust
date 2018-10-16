package object;

import java.util.List;
import java.util.ArrayList;

public class Class {
	private String className;
	private String classId;
	private String classRoom;
	private Teacher teacher;
	private String teacherId;
	private Course course;
	private String courseId;
	private List<Student> students = new ArrayList<Student>();
	private String[] studentId;
	public Class(String className, String classId, String classRoom, String teacherId, String courseId,
			String[] studentId) {
		super();
		this.className = className;
		this.classId = classId;
		this.classRoom = classRoom;
		this.teacherId = teacherId;
		this.courseId = courseId;
		this.studentId = studentId;
	}
	public String getClassName() {
		return className;
	}
	public void setClassName(String className) {
		this.className = className;
	}
	public String getClassId() {
		return classId;
	}
	public void setClassId(String classId) {
		this.classId = classId;
	}
	public String getClassRoom() {
		return classRoom;
	}
	public void setClassRoom(String classRoom) {
		this.classRoom = classRoom;
	}
	public Teacher getTeacher() {
		return teacher;
	}
	public void setTeacher(Teacher teacher) {
		this.teacher = teacher;
	}
	public Course getCourse() {
		return course;
	}
	public void setCourse(Course course) {
		this.course = course;
	}
	public List<Student> getStudents() {
		return students;
	}
	public void setStudents(List<Student> students) {
		this.students = students;
	}
	public String getTeacherId() {
		return teacherId;
	}
	public void setTeacherId(String teacherId) {
		this.teacherId = teacherId;
	}
	public String getCourseId() {
		return courseId;
	}
	public void setCourseId(String courseId) {
		this.courseId = courseId;
	}
	public String[] getStudentId() {
		return studentId;
	}
	public void setStudentId(String[] studentId) {
		this.studentId = studentId;
	}
}
