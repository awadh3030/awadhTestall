package awadhh;

import java.util.ArrayList;

public class Student {
	private int studentNum;
	private String studentName;
	
	Course obj = new Course();
	ArrayList<Course> C = new ArrayList<Course>();
	
	
	public ArrayList<Course> getC() {
		return C;
	}

	public void setC(ArrayList<Course> c) {
		C = c;
	}

	public int getStudentNum() {
		return studentNum;
	}

	public void setStudentNum(int studentNum) {
		this.studentNum = studentNum;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	
	
	
	
	
}
