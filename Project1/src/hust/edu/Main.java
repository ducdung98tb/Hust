package hust.edu;

import data.DataModel;
import object.Student;
import object.Class;
import object.Course;
import object.Teacher;
import object.StudentAndClass;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DataModel data = new DataModel();
		data.getListStudent();
		data.getListClass();
		data.getListStudentAndClass();
		data.getListTeacher();
		data.getListCourse();
		Scanner scanner = new Scanner(System.in);
		int k;
		do {
			System.out.println(
					"\n1. Quan li sinh vien       2. Quan li giang vien       3. Quan li lop       4. Quan ly hoc phan       5. Thoat");
			System.out.println("Nhap vao so ban muon thuc hien :");
			k = scanner.nextInt();
			switch (k) {
			case 1:
				int f;
				do {
					System.out.println(
							"\n1. In danh sach sinh vien       2. Them sinh vien       3. Xoa sinh vien       4. Tim kiem sinh vien       5. Thoat");
					System.out.println("Nhap vao so ban muon thuc hien :");
					f = scanner.nextInt();
					String studentName;
					String studentId;
					String teacherId;
					Student student;
					switch (f) {
					case 1:
						System.out.println("Danh sach sinh vien la : ");
						data.printListStudent();
						break;
					case 2:
						System.out.println("Nhap vao ten sinh vien : ");
						scanner.nextLine();
						studentName = scanner.nextLine();
						System.out.println("Nhap vao ma so sinh vien : ");
						studentId = scanner.nextLine();
						System.out.println("Nhap vao ma giang vien huong dan, chua co nhap vao 0 : ");
						teacherId = scanner.nextLine();
						data.addStudent(studentName, studentId, teacherId);
						break;
					case 3:
						System.out.println("Nhap vao ma so sinh vien : ");
						scanner.nextLine();
						studentId = scanner.nextLine();
						student = data.getStudentById(studentId);
						if (student == null)
							System.out.println("Khong tim thay sinh vien nao!");
						else {
							data.removeStudentOfClass(student);
							data.removeStudent(student);
						}
						break;
					case 4:
						System.out.println("Nhap vao ma so sinh vien : ");
						scanner.nextLine();
						studentId = scanner.nextLine();
						student = data.getStudentById(studentId);
						if (student == null)
							System.out.println("Khong tim thay sinh vien nao!");
						else
							data.printClassOfStudent(student);

					}

				} while (f != 5);
				break;
			case 2:
				int s;
				do {
					System.out.println(
							"\n1. In danh sach giang vien       2. Them giang vien       3. Xoa giang vien       4. Tim kiem giang vien       5. Thoat");
					System.out.println("Nhap vao so ban muon thuc hien :");
					s = scanner.nextInt();
					String teacherName;
					String teacherId;
					String department;
					Teacher teacher;
					switch (s) {
					case 1:
						System.out.println("Danh sach giang vien la : ");
						data.printListTeacher();
						break;
					case 2:
						System.out.println("Nhap vao ten giang vien : ");
						scanner.nextLine();
						teacherName = scanner.nextLine();
						System.out.println("Nhap vao ma giang vien : ");
						teacherId = scanner.nextLine();
						System.out.println("Nhap vao phong ban : ");
						department = scanner.nextLine();
						System.out.println("Nhap vao phong ban : ");
						department = scanner.nextLine();
						System.out.println("Nhap vao phong ban : ");
						department = scanner.nextLine();
						data.addTeacher(teacherName, teacherId, department);
						break;
					case 3:
						System.out.println("Nhap vao ma giang vien : ");
						scanner.nextLine();
						teacherId = scanner.nextLine();
						teacher = data.getTeacherById(teacherId);
						if (teacher == null)
							System.out.println("Khong tim thay giang vien nao!");
						else {
							data.removeTeacher(teacher);
						}
						break;
					case 4:
						System.out.println("Nhap vao ma giang vien : ");
						scanner.nextLine();
						teacherId = scanner.nextLine();
						teacher = data.getTeacherById(teacherId);
						if (teacher == null)
							System.out.println("Khong tim thay giang vien nao!");
						else
							data.printDetailInfoTeacher(teacher);
						break;
					}

				} while (s != 5);
				break;
			case 3:
				int t;
				do {
					System.out.println(
							"\n1. In danh sach lop       2. Them lop       3. Xoa lop       4. Thong tin cu the cua lop       5. Them sinh vien vao lop       6. Thoat");
					System.out.println("Nhap vao so ban muon thuc hien :");
					t = scanner.nextInt();
					String className;
					String classId;
					String classRoom;
					String studentId;
					String teacherId;
					String courseId;
					Class classes;
					Student student;
					switch (t) {
					case 1:
						System.out.println("Danh sach lop : ");
						data.printListClass();
						break;
					case 2:
						System.out.println("Nhap vao ten lop : ");
						scanner.nextLine();
						className = scanner.nextLine();
						System.out.println("Nhap vao ma lop : ");
						classId = scanner.nextLine();
						System.out.println("Nhap vao phong : ");
						classRoom = scanner.nextLine();
						System.out.println("Nhap vao ma giang vien day : ");
						teacherId = scanner.nextLine();
						System.out.println("Nhap vao ma mon hoc : ");
						courseId = scanner.nextLine();
						data.addClass(className, classId, classRoom, teacherId, courseId);
						break;
					case 3:
						System.out.println("Nhap vao ma lop: ");
						scanner.nextLine();
						classId = scanner.nextLine();
						classes = data.getClassById(classId);
						if (classes == null)
							System.out.println("Khong tim thay lop nao!");
						else {
							data.removeClass(classes);
							data.removeClassOfStudent(classes);
						}
						break;
					case 4:
						System.out.println("Nhap vao ma lop : ");
						scanner.nextLine();
						classId = scanner.nextLine();
						classes = data.getClassById(classId);
						if (classes == null)
							System.out.println("Khong tim thay lop nao!");
						else
							data.printDetailInfoClass(classes);
						break;
					case 5:
						System.out.println("Nhap vao ma lop : ");
						scanner.nextLine();
						classId = scanner.nextLine();
						classes = data.getClassById(classId);
						if (classes == null)
							System.out.println("Khong tim thay lop nao!");
						else {
							System.out.println("Nhap vao so sinh vien muon them : ");
							int i = scanner.nextInt();
							for (int j = 1; j <= i; j++) {
								System.out.print("Nhap vao ma so sinh vien cua sinh vien thu " + j + ": ");
								scanner.nextLine();
								studentId = scanner.nextLine();
								student = data.getStudentById(studentId);
								if (student == null)
									System.out.println("Khong tim thay sinh vien nao!");
								else
									data.addStudentToClass(student, classes);
							}
						}
						break;
					}

				} while (t != 6);
				break;
			case 4:
				int fo;
				do {
					System.out.println(
							"\n1. In danh sach hoc phan       2. Them hoc phan       3. Tim hoc phan      4. Thoat");
					System.out.println("Nhap vao so ban muon thuc hien :");
					fo = scanner.nextInt();
					String courseId;
					String courseName;
					int credit;
					Course course;
					switch (fo) {
					case 1:
						System.out.println("Danh sach hoc phan : ");
						data.printListCourse();
						break;
					case 2:
						System.out.println("Nhap vao ten hoc phan : ");
						scanner.nextLine();
						courseName = scanner.nextLine();
						System.out.println("Nhap vao ma hoc phan : ");
						courseId = scanner.nextLine();
						System.out.println("Nhap vao so tin chi : ");
						credit = scanner.nextInt();
						data.addCourse(courseName, courseId, credit);
						break;
					case 3:
						System.out.println("Nhap vao ma hoc phan : ");
						scanner.nextLine();
						courseId = scanner.nextLine();
						course = data.getCourseById(courseId);
						if (course == null)
							System.out.println("Khong tim thay hoc phan nao!");
						else {
							System.out.println("Hoc phan tim thay : ");
							data.printDetailCourse(course);
						}
						
					}

				} while (fo != 4);
				break;

			}
		} while (k != 5);
	}
}
