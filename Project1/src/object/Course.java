package object;

public class Course {
	private String courseName;
	private String courseId;
	private int credit;
	
	public Course(String courseName, String courseId, int credit) {
		super();
		this.courseName = courseName;
		this.courseId = courseId;
		this.credit = credit;
		
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

	public int getCredit() {
		return credit;
	}

	public void setCredit(int credit) {
		this.credit = credit;
	}
	public void printInfoCourse() {
		System.out.println("     Ten hoc phan : " + this.courseName);
		System.out.println("     So tin chi : " + this.credit);
	}
	
	
}
