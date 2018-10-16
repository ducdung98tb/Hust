package hust.edu;

import data.DataModel;
import object.Student;
import object.Class;
import object.Course;
import object.Teacher;
import java.util.Scanner;

public class Main {

//	có 50 học sinh với Id từ 1-50
//	có 10 giảng viên với Id là tên viết tắt: Nguyen Thanh Hung -> hungnt
//	có 10 khóa học với Id từ C1 - C10
//	có 15 lớp học với Id từ R1 - R15
//	dữ liệu vẫn còn thiếu nên nhập số bé
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String studentId;
		String courseId;
		String classId;
		String teacherId;
		String check;
		DataModel data = new DataModel();
		Scanner scanner = new Scanner(System.in);
		do {
			String k;
			System.out.println("\n1. Nhap vao studenId ");
			System.out.println("2. Nhap vao courseId ");
			System.out.println("3. Nhap vao teacherId ");
			System.out.println("4. Nhap vao classId ");
			System.out.println("Nhap vao so ban muon thuc hien :");
			k = scanner.nextLine();
			switch (k) {
			case "1":
				System.out.println("nhap vao studentId : ");
				studentId = scanner.nextLine();
				Student student1 = data.getStudentById(studentId);
				if (student1 == null) {
					System.err.println("Khong co sinh vien ung voi Id nay");
					break;
				}
				student1.setClasses(data.getListClassStudentStudy(student1));
				System.out.println("Ten sinh vien ung voi studentId " + studentId + " la : " + student1.getFullName());
				System.out.println("\nDanh sach cac lop sinh vien do hoc : ");
				for (Class classes : student1.getClasses()) {
					System.out.println(classes.getClassName());
				}
				break;
			case "2":
				System.out.println("\nNhap vao courseId : ");
				courseId = scanner.nextLine();
				Course course1 = data.getCourseById(courseId);
				if (course1 == null) {
					System.err.println("Khong co mon hoc ung voi Id nay");
					break;
				}
				course1.setTeachers(data.getListTeacherOfCourse(course1));
				System.out.println("Ten mon hoc ung voi courseId " + courseId + " la : " + course1.getCourseName());
				System.out.println("\nGiao vien day lop do la : ");
				for (Teacher teacher : course1.getTeachers())
					System.out.println(teacher.getFullName());
				break;

			case "3":
				System.out.println("\nNhap vao teacherId : ");
				teacherId = scanner.nextLine();
				Teacher teacher1 = data.getTeacherById(teacherId);
				if (teacher1 == null) {
					System.err.println("Khong co giang vien ung voi Id nay");
					break;
				}
				teacher1.setClasses(data.getListClassOfTeacher(teacher1));
				teacher1.setStudents(data.getListStudentOfTeacher(teacher1));
				System.out.println("Ten giang vien ung voi teacherId " + teacherId + " la : " + teacher1.getFullName());
				System.out.println("\nLop giang vien do day : ");
				for (Class classes : teacher1.getClasses())
					System.out.println(classes.getClassName());
				System.out.println("\nCac sinh vien giang vien do huong dan : ");
				for (Student student : teacher1.getStudents())
					System.out.println(student.getFullName());
				break;

			case "4":
				System.out.println("Nhap vao classId : ");
				classId = scanner.nextLine();
				Class class1 = data.getClassById(classId);
				if (class1 == null) {
					System.err.println("Khong co lop hoc ung voi Id nay");
					break;
				}
				class1.setCourse(data.getCourseOfClass(class1));
				class1.setTeacher(data.getTeacherOfClass(class1));
				class1.setStudents(data.getListStudentOfClass(class1));
				System.out.println("Ten lop ung voi classId " + classId + " la : " + class1.getClassName());
				System.out.println("Mon hoc : " + class1.getCourse().getCourseName());
				System.out.println("Giang vien : " + class1.getTeacher().getFullName());
				System.out.println("Cac sinh vien : ");
				for (Student student : class1.getStudents())
					System.out.println(student.getFullName());
				break;
			}
			System.out.println("Nhap c|C de tiep tuc : ");
			check = scanner.nextLine();
		} while (check == "c" || check == "C");

	}

}
