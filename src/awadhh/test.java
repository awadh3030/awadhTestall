package awadhh;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Stack;


public class test {

	public static void main(String[] args) {
		Scanner sca = new Scanner(System.in);

		ArrayList<Department> DD = new ArrayList<Department>();
		 Stack<String> stack = new Stack<String>();
		 
		boolean condition01 = true;

		while (condition01) {
			Department departmentObject0 = new Department();

			System.out.println("Enter info");
			System.out.println("Enter 1 for Register");
			System.out.println("Enter 2 for Report");
			System.out.println("Enter 3 history");

			int i = sca.nextInt();

			if (i == 1) {

				boolean condition0 = true;

				while (condition0) {

					System.out.println("Enter the Departmen Name ");
					String departmentName = sca.next();
					departmentObject0.setDepartName(departmentName);
					
					stack.push(departmentName);
					
					System.out.println("Enter the Departmen Number ");
					int departmentnumber = sca.nextInt();
					departmentObject0.setDepartId(departmentnumber);
					
					String department = Integer.toString(departmentnumber);
					stack.push(department);
				
					DD.add(departmentObject0);

					boolean condition1 = true;
					while (condition1) {

						Teacher teacherObject = new Teacher();
						System.out.println("Enter the  Teacher Name ");
						String name22 = sca.next();
						teacherObject.setTeacherName(name22);
						stack.push(name22);

						System.out.println("Enter the  Teacher Number ");
						int number22 = sca.nextInt();
						teacherObject.setTeacherId(number22);
						departmentObject0.T.add(teacherObject);
						String teacherO = Integer.toString(number22);
						stack.push(teacherO);
						
						
						boolean condition2 = true;
						while (condition2) {

							Student studentNumber = new Student();

							System.out.println("Enter the Student Name ");
							String studentName1 = sca.next();
							studentNumber.setStudentName(studentName1);							
							stack.push(studentName1);
							
							System.out.println("Enter the Student Number ");
							int studentNumber1 = sca.nextInt();
							studentNumber.setStudentNum(studentNumber1);
							teacherObject.S.add(studentNumber);
							String studentN = Integer.toString(studentNumber1);
							stack.push(studentN);

							boolean condition3 = true;
							while (condition3) {
								Course courseObj = new Course();

								System.out.println("Enter the Course Name ");
								String name3 = sca.next();
								courseObj.setCourseName(name3);
								stack.push(name3);

								System.out.println("Enter the Course Number ");
								int number3 = sca.nextInt();
								courseObj.setCourseNum(number3);
								String courseO = Integer.toString(number3);
								stack.push(courseO);

								studentNumber.C.add(courseObj);

								System.out.println("Do you want to add another Course??  yes = 1 or no = 2");
								int Course = sca.nextInt();
								if (Course == 1) {
									condition3 = true;

								} else {

									condition3 = false;
								}
							}

							System.out.println("Do you want to add another Student??  yes = 1 or no = 2");
							int student = sca.nextInt();
							if (student == 1) {
								condition2 = true;

							} else {

								condition2 = false;
							}
						}

						System.out.println("Do you want to add another Teacher??  yes = 1 or no = 2");
						int Teach = sca.nextInt();
						if (Teach == 1) {
							condition1 = true;

						} else {

							condition1 = false;
						}
					}

					System.out.println("Do you want to add another Department?? yes = 1 or no = 2 ");
					int num = sca.nextInt();
					if (num == 1) {
						condition0 = true;

					} else {

						condition0 = false;
					}

				}

			}

			else if (i == 2) {

				for (Department dep : DD) {
					System.out.println("\n --------------------------------------");
					System.out.println("\n ---------------------------------------");
					System.out.println("\n -----------------------------------------");
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
								System.out.println("\n --------------------------------------");
								System.out.println("\n --------------------------------------");
								System.out.println("\n ----------------------------------------");
								condition01 = false;
								System.out.println("Bye!!!");

							}
						}
					}
				}
			}
			else if (i == 3) {
				
				
				for (String list : stack)
				
				{
					System.out.println(list);
					
					
				}
				
			}
			
		}
	}
}
