package awadhh;

import java.util.ArrayList;
import java.util.Scanner;


public class test {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		ArrayList<Department> D = new ArrayList<Department>();

		boolean condition = true;

		while (condition) {
			Department departmentObject = new Department();

			System.out.println("Enter info");
			System.out.println("Enter 1 for register");
			System.out.println("Enter 2 for Report");

			int i = sc.nextInt();

			if (i == 1) {

				boolean condition0 = true;

				while (condition0) {

					System.out.println("Enter the Departmen name ");
					String departmentName = sc.next();
					departmentObject.setDepartName(departmentName);

					System.out.println("Enter the Departmen number ");
					int departmentnumber = sc.nextInt();
					departmentObject.setDepartId(departmentnumber);

					D.add(departmentObject);

					boolean condition1 = true;
					while (condition1) {

						Teacher teacherObject = new Teacher();
						System.out.println("Enter the  Teacher name ");
						String name22 = sc.next();
						teacherObject.setTeacherName(name22);

						System.out.println("Enter the  Teacher number ");
						int number22 = sc.nextInt();
						teacherObject.setTeacherId(number22);

						departmentObject.T.add(teacherObject);

						boolean condition2 = true;
						while (condition2) {

							Student studentNumber = new Student();

							System.out.println("Enter the Student name ");
							String studentName1 = sc.next();
							studentNumber.setStudentName(studentName1);

							System.out.println("Enter the Student Number ");
							int studentNumber1 = sc.nextInt();
							studentNumber.setStudentNum(studentNumber1);

							teacherObject.S.add(studentNumber);

							boolean condition3 = true;
							while (condition3) {
								Course courseObj = new Course();

								System.out.println("Enter the Course name ");
								String name3 = sc.next();
								courseObj.setCourseName(name3);

								System.out.println("Enter the Course number ");
								int number3 = sc.nextInt();
								courseObj.setCourseNum(number3);

								studentNumber.C.add(courseObj);

								System.out.println("do you want to add another Course??  yes = 1 or no = 2");
								int Course = sc.nextInt();
								if (Course == 1) {
									condition3 = true;

								} else {

									condition3 = false;
								}
							}

							System.out.println("do you want to add another Student??  yes = 1 or no = 2");
							int student = sc.nextInt();
							if (student == 1) {
								condition2 = true;

							} else {

								condition2 = false;
							}
						}

						System.out.println("do you want to add another Teacher??  yes = 1 or no = 2");
						int Teach = sc.nextInt();
						if (Teach == 1) {
							condition1 = true;

						} else {

							condition1 = false;
						}
					}

					System.out.println("do you want to add another Department?? yes = 1 or no = 2 ");
					int num = sc.nextInt();
					if (num == 1) {
						condition0 = true;

					} else {

						condition0 = false;
					}

				}

			}

			else if (i == 2) {

				for (Department dep : D) {

					System.out.println("\n Departmen name is " + dep.getDepartName());
					System.out.println("Departmen number is " + dep.getDepartId());

					for (Teacher te : dep.getT()) {
						System.out.println("\n Teacher name is " + te.getTeacherName());
						System.out.println("Teacher number is " + te.getTeacherId());
						for (Student st : te.getS()) {
							System.out.println("Student name is " + st.getStudentName());
							System.out.println("Student number is " + st.getStudentNum());
							for (Course co : st.getC()) {
								System.out.println("\n Course name is " + co.getCourseName());
								System.out.println("Course number is " + co.getCourseNum());
								System.out.println("\n >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
								System.out.println("\n >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>S");

								condition = false;
								System.out.println("Bye!!!");

							}
						}
					}
				}
			}
		}
	}
}
