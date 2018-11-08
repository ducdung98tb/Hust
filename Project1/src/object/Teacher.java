package object;

public class Teacher extends HustPerson {
	private String department;

	public Teacher(String fullName, String personId, String department) {
		super(fullName, personId);
		this.department = department;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}
	public void printInfoTeacher() {
		System.out.println("     Ten giang vien : " + this.fullName);
		System.out.println("     Phong ban : " + this.department);
	}
}
