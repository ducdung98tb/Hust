package data;

import java.util.ArrayList;
import java.util.List;

import object.Student;
import object.Class;
import object.Course;
import object.Teacher;
import object.StudentAndClass;
import object.StudentAndTeacher;

public class DataModel {
	private List<Student> students = new ArrayList<Student>();
	private List<Teacher> teachers = new ArrayList<Teacher>();
	private List<Course> courses = new ArrayList<Course>();
	private List<Class> classes = new ArrayList<Class>();
	private List<StudentAndClass> studentAndClass = new ArrayList<StudentAndClass>();
	private List<StudentAndClass> studentAndClasses = new ArrayList<StudentAndClass>();

	private List<Class> classOfStudent = new ArrayList<Class>();
	private List<Student> studentOfClass = new ArrayList<Student>();
	private List<Class> classOfTeacher = new ArrayList<Class>();
	private List<Student> studentOfTeacher = new ArrayList<Student>();

	public List<Student> getListStudent() {
		if (this.students.isEmpty()) {
			students.add(new Student("Le Duc Dung", "20160656", "hungnt"));
			students.add(new Student("Nguyen Thanh Chung", "20160657", "0"));
			students.add(new Student("Le Kha Hai", "20160658", "hungnt"));
			students.add(new Student("Nguyen Nhu Hoang", "20160659", "anhntk"));
			students.add(new Student("Tran Duc Manh", "20160660", "0"));
			students.add(new Student("Nguyen Huu Phung", "20160661", "khankpk"));
			students.add(new Student("Nguyen Hung Cuong", "20160662", "hungnt"));
			students.add(new Student("Nguyen Tuan Hung", "20160663", "khanhpk"));
		}
		return students;
	}

	public List<Teacher> getListTeacher() {
		if (this.teachers.isEmpty()) {
			teachers.add(new Teacher("Nguyen Thanh Hung", "hungnt", "VCNTT&TT"));
			teachers.add(new Teacher("Nguyen Thi Kim Anh", "anhntk", "VCNTT&TT"));
			teachers.add(new Teacher("Pham Kim Khanh", "khanhpk", "VCNTT&TT"));
		}
		return teachers;
	}

	public List<Course> getListCourse() {
		if (this.courses.isEmpty()) {
			courses.add(new Course("Lap trinh huong doi tuong", "C1", 3));
			courses.add(new Course("Ki thuat lap trinh", "C2", 2));
			courses.add(new Course("Co so du lieu", "C3", 3));
			courses.add(new Course("Cau truc du lieu va giai thuat", "C4", 3));
		}
		return courses;
	}

	public List<Class> getListClass() {
		if (this.classes.isEmpty()) {
			classes.add(new Class("Lap trinh huong doi tuong 01", "R1", "104", "hungnt", "C1"));
			classes.add(new Class("Ki thuat lap trinh 01", "R2", "104", "khanhpk", "C1"));
			classes.add(new Class("Co so du lieu 01", "R3", "102", "anhptk", "C3"));
			classes.add(new Class("Cau truc du lieu va giai thuat 01", "R4", "104", "khanhpk", "C4"));
		}
		return classes;
	}

	public List<StudentAndClass> getListStudentAndClass() {
		if (this.studentAndClass.isEmpty()) {
			studentAndClass.add(new StudentAndClass("20160656", "R1"));
			studentAndClass.add(new StudentAndClass("20160656", "R2"));
			studentAndClass.add(new StudentAndClass("20160656", "R3"));
			studentAndClass.add(new StudentAndClass("20160657", "R1"));
			studentAndClass.add(new StudentAndClass("20160657", "R4"));
			studentAndClass.add(new StudentAndClass("20160658", "R2"));
			studentAndClass.add(new StudentAndClass("20160658", "R3"));
			studentAndClass.add(new StudentAndClass("20160659", "R1"));
			studentAndClass.add(new StudentAndClass("20160660", "R4"));
			studentAndClass.add(new StudentAndClass("20160661", "R1"));
		}
		return studentAndClass;
	}
	
	public Student getStudentById(String studentId) {
		for (Student student : this.students)
			if (student.getPersonId().equals(studentId))
				return student;
		return null;
	}

	public Teacher getTeacherById(String teacherId) {
		this.getListTeacher();
		for (Teacher teacher : this.teachers)
			if (teacher.getPersonId().equals(teacherId))
				return teacher;
		return null;
	}

	public Course getCourseById(String courseId) {
		this.getListCourse();
		for (Course course : this.courses)
			if (course.getCourseId().equals(courseId))
				return course;
		return null;
	}

	public Class getClassById(String classId) {
		this.getListClass();
		for (Class classes : this.classes)
			if (classes.getClassId().equals(classId))
				return classes;
		return null;

	}

	public void printListStudent() {
		int i = 1;
		for (Student student : this.students) {
			System.out.println(i + ".");
			student.printInfoStudent();
			i++;
		}
	}

	public List<Student> addStudent(String studentName, String studentId, String teacherId) {
		this.students.add(new Student(studentName, studentId, teacherId));
		return students;
	}

	public List<Student> removeStudent(Student student) {
		students.remove(student);
		if (this.students.isEmpty())
			return null;
		else
			return students;
	}

	public List<StudentAndClass> removeStudentOfClass(Student student) {
		for (StudentAndClass studentAndClass : studentAndClass) {
			if (studentAndClass.getStudentId() == student.getPersonId()) {
				studentAndClasses.add(studentAndClass);
			}
		}
		for (StudentAndClass studentAndClass1 : studentAndClasses)
			this.studentAndClass.remove(studentAndClass1);
		return this.studentAndClass;
	}

	public List<Class> getClassOfStudent(Student student) {
		classOfStudent = new ArrayList<Class>();
		for (StudentAndClass studentAndClass : studentAndClass) {
			if (studentAndClass.getStudentId() == student.getPersonId())
				classOfStudent.add(this.getClassById(studentAndClass.getClassId()));
		}
		return classOfStudent;
	}

	public void printClassOfStudent(Student student) {
		int i = 1;
		this.getClassOfStudent(student);
		System.out.println("Sinh vien tim thay : ");
		student.printInfoStudent();
		System.out.println("Cac lop sinh vien dang hoc : ");
		for (Class classOfStudent : classOfStudent) {
			System.out.println(i + ".");
			classOfStudent.printfInfoClass();
			i++;
		}
	}

	public void printListClass() {
		int i = 1;
		for (Class classes : this.classes) {
			System.out.println(i + ".");
			classes.printfInfoClass();
			i++;
		}
	}

	public List<Class> addClass(String ClassName, String classId, String classRoom, String teacherId, String courseId) {
		this.classes.add(new Class(ClassName, classId, classRoom, teacherId, courseId));
		return classes;
	}

	public List<Class> removeClass(Class classs) {
		classes.remove(classs);
		if (this.classes.isEmpty())
			return null;
		else
			return classes;
	}

	public List<StudentAndClass> removeClassOfStudent(Class classes) {
		for (StudentAndClass studentAndClass : studentAndClass) {
			if (studentAndClass.getClassId() == classes.getClassId()) {
				studentAndClasses.add(studentAndClass);
			}
		}
		for (StudentAndClass studentAndClass1 : studentAndClasses)
			this.studentAndClass.remove(studentAndClass1);
		return this.studentAndClass;
	}

	public List<Student> getStudentOfClass(Class classes) {
		studentOfClass = new ArrayList<Student>();
		for (StudentAndClass studentAndClass : studentAndClass) {
			if (studentAndClass.getClassId() == classes.getClassId())
				studentOfClass.add(this.getStudentById(studentAndClass.getStudentId()));
		}
		return studentOfClass;
	}

	public void printDetailInfoClass(Class classes) {
		int i = 1;
		this.getStudentOfClass(classes);
		System.out.println("Lop tim thay : ");
		classes.printfInfoClass();
		Teacher teacher = this.getTeacherById(classes.getTeacherId());
		Course course = this.getCourseById(classes.getCourseId());
		System.out.println("Giang vien day : ");
		teacher.printInfoTeacher();
		System.out.println("Hoc phan : ");
		course.printInfoCourse();
		System.out.println("Cac sinh vien dang hoc trong lop : ");
		for (Student studentOfClass : studentOfClass) {
			System.out.println(i + ".");
			studentOfClass.printInfoStudent();
			i++;
		}
	}

	public List<StudentAndClass> addStudentToClass(Student student, Class classes) {
		int i = 0;
		for (StudentAndClass studentAndClass1 : studentAndClass) {
			if (student.getPersonId() == studentAndClass1.getStudentId()
					&& classes.getClassId() == studentAndClass1.getClassId())
				i++;
		}
		if (i == 0) {
			this.studentAndClass.add(new StudentAndClass(student.getPersonId(), classes.getClassId()));
			System.out.println("Them sinh vien vao lop thanh cong");
		} else
			System.out.println("Sinh vien da co trong lop");
		return studentAndClass;
	}

	public void printListTeacher() {
		int i = 1;
		for (Teacher teacher : this.teachers) {
			System.out.println(i + ".");
			teacher.printInfoTeacher();
			i++;
		}
	}

	public List<Teacher> addTeacher(String teacherName, String teacherId, String department) {
		this.teachers.add(new Teacher(teacherName, teacherId, department));
		return teachers;
	}

	public List<Teacher> removeTeacher(Teacher teacher) {
		teachers.remove(teacher);
		if (this.teachers.isEmpty())
			return null;
		else
			return teachers;
	}

	public List<Class> getClassOfTeacher(Teacher teacher) {
		classOfTeacher = new ArrayList<Class>();
		for (Class classs : classes) {
			if (classs.getTeacherId() == teacher.getPersonId())
				classOfTeacher.add(classs);
		}
		if (classOfTeacher.isEmpty())
			return null;
		else
			return classOfTeacher;
	}
	public List<Student> getStudentOfTeacher(Teacher teacher) {
		studentOfTeacher = new ArrayList<Student>();
		for (Student student : students) {
			if (student.getTeacherId() == teacher.getPersonId())
				studentOfTeacher.add(student);
		}
		if (studentOfTeacher.isEmpty())
			return null;
		else
			return studentOfTeacher;
	}
	public void printDetailInfoTeacher(Teacher teacher) {
		int i = 1;
		int j = 1;
		System.out.println("Giang vien tim thay : ");
		teacher.printInfoTeacher();
		this.getClassOfTeacher(teacher);
		this.getStudentOfTeacher(teacher);
		if(classOfTeacher.isEmpty()) 
			System.out.println("Giang vien nay khong day lop nao!");
		else {
			System.out.println("Cac lop giang vien dang day la : ");
			for(Class classs : classOfTeacher) {
				System.out.println(i + ".");
				classs.printfInfoClass();
				i++;
			}
		}
		if(studentOfTeacher.isEmpty())
			System.out.println("Giang vien nay khong huong dan sinh vien nao!");
		else {
			System.out.println("Cac sinh vien giang vien huong dan la : ");
			for(Student student : studentOfTeacher) {
				System.out.println(j + ".");
				student.printInfoStudent();
				j++;
			}
		}
	}

}
