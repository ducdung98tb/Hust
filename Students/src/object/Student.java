package object;

import java.util.List;
import java.util.ArrayList;
public class Student extends HustPerson{
	private String major = "CNTT";
	private String program = "KSTN";
	private String[] classId;
	private List<Class> classes = new ArrayList<Class>();
	public Student(String fullName, String personId, String[] classId) {
		super(fullName, personId);
		this.classId = classId;
	}
	public String getMajor() {
		return major;
	}
	public void setMajor(String major) {
		this.major = major;
	}
	public String getProgram() {
		return program;
	}
	public void setProgram(String program) {
		this.program = program;
	}
	public String[] getClassId() {
		return classId;
	}
	public void setClassId(String[] classId) {
		this.classId = classId;
	}
	public List<Class> getClasses() {
		return classes;
	}
	public void setClasses(List<Class> classes) {
		this.classes = classes;
	}
	
	
}
