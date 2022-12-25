package awadhh;

import java.util.ArrayList;
import java.util.Scanner;


public class test {

	public static void main(String[] args) {
		Scanner sca = new Scanner(System.in);

		ArrayList<Department> D = new ArrayList<Department>();

		boolean condition = true;

		while (condition) {
			Department departmentObject = new Department();

			System.out.println("Enter info");
			System.out.println("Enter 1 for Register");
			System.out.println("Enter 2 for Report");

			int i = sca.nextInt();

			if (i == 1) {

				boolean condition0 = true;

				while (condition0) {

					System.out.println("Enter the Departmen Name ");
					String departmentName = sca.next();
					departmentObject.setDepartName(departmentName);

					System.out.println("Enter the Departmen Number ");
					int departmentnumber = sca.nextInt();
					departmentObject.setDepartId(departmentnumber);

					D.add(departmentObject);

					boolean condition1 = true;
					while (condition1) {

						Teacher teacherObject = new Teacher();
						System.out.println("Enter the  Teacher Name ");
						String name22 = sca.next();
						teacherObject.setTeacherName(name22);

						System.out.println("Enter the  Teacher Number ");
						int number22 = sca.nextInt();
						teacherObject.setTeacherId(number22);

						departmentObject.T.add(teacherObject);

						boolean condition2 = true;
						while (condition2) {

							Student studentNumber = new Student();

							System.out.println("Enter the Student Name ");
							String studentName1 = sca.next();
							studentNumber.setStudentName(studentName1);

							System.out.println("Enter the Student Number ");
							int studentNumber1 = sca.nextInt();
							studentNumber.setStudentNum(studentNumber1);

							teacherObject.S.add(studentNumber);

							boolean condition3 = true;
							while (condition3) {
								Course courseObj = new Course();

								System.out.println("Enter the Course Name ");
								String name3 = sca.next();
								courseObj.setCourseName(name3);

								System.out.println("Enter the Course Number ");
								int number3 = sca.nextInt();
								courseObj.setCourseNum(number3);

								studentNumber.C.add(courseObj);

								System.out.println("do you want to add another Course??  yes = 1 or no = 2");
								int Course = sca.nextInt();
								if (Course == 1) {
									condition3 = true;

								} else {

									condition3 = false;
								}
							}

							System.out.println("do you want to add another Student??  yes = 1 or no = 2");
							int student = sca.nextInt();
							if (student == 1) {
								condition2 = true;

							} else {

								condition2 = false;
							}
						}

						System.out.println("do you want to add another Teacher??  yes = 1 or no = 2");
						int Teach = sca.nextInt();
						if (Teach == 1) {
							condition1 = true;

						} else {

							condition1 = false;
						}
					}

					System.out.println("do you want to add another Department?? yes = 1 or no = 2 ");
					int num = sca.nextInt();
					if (num == 1) {
						condition0 = true;

					} else {

						condition0 = false;
					}

				}

			}

			else if (i == 2) {

				for (Department dep : D) {

					System.out.println("\n Departmen Name is " + dep.getDepartName());
					System.out.println("Departmen Number is " + dep.getDepartId());

					for (Teacher te : dep.getT()) {
						System.out.println("\n Teacher Name is " + te.getTeacherName());
						System.out.println("Teacher Number is " + te.getTeacherId());
						for (Student st : te.getS()) {
							System.out.println("StudentName is " + st.getStudentName());
							System.out.println("Student Number is " + st.getStudentNum());
							for (Course co : st.getC()) {
								System.out.println("\n Course Name is " + co.getCourseName());
								System.out.println("Course Number is " + co.getCourseNum());
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
