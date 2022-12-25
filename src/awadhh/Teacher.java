package awadhh;

import java.util.ArrayList;

public class Teacher {

	private int teacherId;
	private String teacherName;
	
	Student obj = new Student();
	ArrayList<Student> S = new ArrayList<Student>();

	
	public ArrayList<Student> getS() {
		return S;
	}

	public void setS(ArrayList<Student> s) {
		S = s;
	}

	public int getTeacherId() {
		return teacherId;
	}

	public void setTeacherId(int teacherId) {
		this.teacherId = teacherId;
	}

	public String getTeacherName() {
		return teacherName;
	}

	public void setTeacherName(String teacherName) {
		this.teacherName = teacherName;
	}


	

}
