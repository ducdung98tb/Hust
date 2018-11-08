package object;

public class StudentAndTeacher {
	private String studentId;
	private String teacherId;
	public StudentAndTeacher(String studentId, String teacherId) {
		super();
		this.studentId = studentId;
		this.teacherId = teacherId;
	}
	public String getStudentId() {
		return studentId;
	}
	public void setStudentId(String studentId) {
		this.studentId = studentId;
	}
	public String getTeacherId() {
		return teacherId;
	}
	public void setTeacherId(String teacherId) {
		this.teacherId = teacherId;
	}
}
