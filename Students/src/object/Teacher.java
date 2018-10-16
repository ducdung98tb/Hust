package object;
import java.util.List;
import java.util.ArrayList;

public class Teacher extends HustPerson{
	private String department;
	private List<Class> classes = new ArrayList<Class>();
	private String[] classId;
	private List<Student> students = new ArrayList<Student>();
	private String[] studentId;
	public Teacher(String fullName, String personId, String department, String[] classId, String[] studentId) {
		super(fullName, personId);
		this.department = department;
		this.classId = classId;
		this.studentId = studentId;
	}
	public String[] getClassId() {
		return classId;
	}
	public void setClassId(String[] classId) {
		this.classId = classId;
	}
	public String[] getStudentId() {
		return studentId;
	}
	public void setStudentId(String[] studentId) {
		this.studentId = studentId;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public List<Class> getClasses() {
		return classes;
	}
	public void setClasses(List<Class> classes) {
		this.classes = classes;
	}
	public List<Student> getStudents() {
		return students;
	}
	public void setStudents(List<Student> students) {
		this.students = students;
	}
	
}
