package object;
public class Student extends HustPerson {
	private String major = "CNTT";
	private String program = "KSTN";
	private String teacherId;
	
	public Student(String fullName, String personId, String teacherId) {
		super(fullName, personId);
		this.teacherId = teacherId;
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

	public String getTeacherId() {
		return teacherId;
	}

	public void setTeacherId(String teacherId) {
		this.teacherId = teacherId;
	}

	public void printInfoStudent() {
		System.out.println("     Ten : " + this.fullName);
		System.out.println("     Ma so sinh vien : " + this.personId);
		System.out.println("     Chuong trinh : " + this.program);
		System.out.println("     Chuyen nganh : " + this.major);
	}
}
