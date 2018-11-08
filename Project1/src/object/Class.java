package object;

public class Class {
	private String className;
	private String classId;
	private String classRoom;
	private String teacherId;
	private String courseId;

	public Class(String className, String classId, String classRoom, String teacherId, String courseId) {
		super();
		this.className = className;
		this.classId = classId;
		this.classRoom = classRoom;
		this.teacherId = teacherId;
		this.courseId = courseId;
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

	public void printfInfoClass() {
		System.out.println("     Ten lop hoc : " + this.className);
		System.out.println("     Lop hoc o phong : " + this.classRoom);
	}
}
