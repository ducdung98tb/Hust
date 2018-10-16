package data;

import java.util.List;
import java.util.ArrayList;

import object.Student;
import object.Class;
import object.Course;
import object.Teacher;

public class DataModel {
	private List<Student> students = new ArrayList<Student>();
	private List<Teacher> teachers = new ArrayList<Teacher>();
	private List<Course> courses = new ArrayList<Course>();
	private List<Class> classes = new ArrayList<Class>();
	
	private List<Class> studentStudyClass = new ArrayList<Class>();
	private List<Teacher> teacherOfCourse = new ArrayList<Teacher>();
	private List<Class> classOfTeacher = new ArrayList<Class>();
	private List<Student> studentOfTeacher = new ArrayList<Student>();
	private Course courseOfClass;
	private Teacher teacherOfClass;
	private List<Student> studentOfClass = new ArrayList<Student>();
	
	public String[] classId1 = {"R1", "R2", "R4"};
	public String[] classId2 = {"R2", "R3", "R4"};
	public String[] classId3 = {"R1", "R3", "R4"};
	public String[] classId4 = {"R1", "R2", "R4"};
	public String[] classId5 = {"R1", "R2", "R4"};
	public String[] classId6 = {"R1", "R2", "R4"};
	public String[] classId7 = {"R1", "R2", "R3"};
	public String[] classId8 = {"R1", "R2", "R3"};
	public List<Student> getListStudent() {
		if(students.isEmpty()) {
			students.add(new Student("Le Duc Dung","1", this.classId1));
			students.add(new Student("Nguyen Thanh Chung", "2", this.classId2));
			students.add(new Student("Le Kha Hai", "3", this.classId3));
			students.add(new Student("Nguyen Nhu Hoang", "4", this.classId4));
			students.add(new Student("Tran Duc Manh", "5", this.classId5));
			students.add(new Student("Nguyen Huu Phung", "6", this.classId6));
			students.add(new Student("Nguyen Hung Cuong", "7", this.classId7));
			students.add(new Student("Nguyen Tuan Hung", "8", this.classId8));
		}
		return students;
	}
	
	public String[] tClassId1 = {"R1"};
	public String[] tClassId2 = {"R3"};
	public String[] tClassId3 = {"R2", "R4"};
	public String[] tStudentId1 = {"5", "3"};
	public String[] tStudentId2 = {"1", "2"};
	public String[] tStudentId3 = {"7", "6"};
	public List<Teacher> getListTeacher() {
		if(teachers.isEmpty()) {
			teachers.add(new Teacher("Nguyen Thanh Hung", "hungnt", "VCNTT&TT", this.tClassId1, this.tStudentId1));
			teachers.add(new Teacher("Nguyen Thi Kim Anh", "anhntk", "VCNTT&TT", this.tClassId2, this.tStudentId2));
			teachers.add(new Teacher("Pham Kim Khanh", "khanhpk", "VCNTT&TT", this.tClassId3, this.tStudentId3));
		}
		return teachers;
	}
	
	public String[] teacherId1 = {"hungnt"};
	public String[] teacherId2 = {"khanhpk"};
	public String[] teacherId3 = {"anhntk", "hungnt"};
	public String[] teacherId4 = {"khanhpk"};
	public List<Course> getListCourse() {
		if(courses.isEmpty()) {
			courses.add(new Course("Lap trinh huong doi tuong", "C1", 3, teacherId1));
			courses.add(new Course("Ki thuat lap trinh", "C2", 2, teacherId2));
			courses.add(new Course("Co so du lieu", "C3", 3, teacherId3));
			courses.add(new Course("Cau truc du lieu va giai thuat", "C4", 3, teacherId4));
		}
		return courses;
	}
	
	public String[] cStudentId1 = {"1", "2", "3", "4", "5", "8"};
	public String[] cStudentId2 = {"1", "2", "3", "4", "5", "6"};
	public String[] cStudentId3 = {"1", "2", "3", "4", "6", "8"};
	public String[] cStudentId4 = {"1", "2", "3", "5", "7", "8"};
	public List<Class> getListClass() {
		if(classes.isEmpty()) {
			classes.add(new Class("Lap trinh huong doi tuong 01", "R1", "104", "hungnt", "C1", this.cStudentId1 ));
			classes.add(new Class("Ki thuat lap trinh 01", "R2", "104", "khanhpk", "C2", this.cStudentId2 ));
			classes.add(new Class("Co so du lieu 01", "R3", "102", "anhntk", "C3", this.cStudentId3 ));
			classes.add(new Class("Cau truc du lieu va giai thuat 01", "R4", "104", "khanhpk", "C4", this.cStudentId4 ));
		}
		return classes;
	}
	
	public Student getStudentById(String studentId) {
		this.getListStudent();
		for(Student student:this.students) 
			if(student.getPersonId().equals(studentId))
				return student;
		return null;
	}
	public Teacher getTeacherById(String teacherId) {
		this.getListTeacher();
		for(Teacher teacher:this.teachers) 
			if(teacher.getPersonId().equals(teacherId))
				return teacher;
		return null;
	}
	public Course getCourseById(String courseId) {
		this.getListCourse();
		for(Course course:this.courses)
			if(course.getCourseId().equals(courseId))
				return course;
		return null;
	}
	public Class getClassById(String classId) {
		this.getListClass();
		for(Class classes:this.classes)
			if(classes.getClassId().equals(classId))
				return classes;
		return null;
	}
	
	public List<Class> getListClassStudentStudy(Student student){
		for(int i=0; i < student.getClassId().length ; i++) {
			this.studentStudyClass.add(this.getClassById(student.getClassId()[i]));
		}
		return this.studentStudyClass;
	}
	
	public List<Teacher> getListTeacherOfCourse(Course course){
		for(int i=0; i < course.getTeacherId().length ; i++) {
			this.teacherOfCourse.add(this.getTeacherById(course.getTeacherId()[i]));
		}
		return this.teacherOfCourse;
	}
	
	public List<Class> getListClassOfTeacher(Teacher teacher){
		for(int i=0; i < teacher.getClassId().length; i++)
			this.classOfTeacher.add(this.getClassById(teacher.getClassId()[i]));
		return this.classOfTeacher;
	}
	
	public List<Student> getListStudentOfTeacher(Teacher teacher){
		for(int i=0; i< teacher.getStudentId().length; i++)
			this.studentOfTeacher.add(this.getStudentById(teacher.getStudentId()[i]));
		return this.studentOfTeacher;
	}
	
	public Course getCourseOfClass(Class classes) {
		this.courseOfClass = this.getCourseById(classes.getCourseId());
		return this.courseOfClass;
	}
	public Teacher getTeacherOfClass(Class classes) {
		this.teacherOfClass = this.getTeacherById(classes.getTeacherId());
		return this.teacherOfClass;
	}
	public List<Student> getListStudentOfClass(Class classes) {
		for(int i=0; i<classes.getStudentId().length; i++)
			this.studentOfClass.add(this.getStudentById(classes.getStudentId()[i]));
		return this.studentOfClass;
	}
}
