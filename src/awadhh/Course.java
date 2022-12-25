package awadhh;

import java.util.ArrayList;

public class Course {
	private int courseNum;
	private String courseName;
	
	Mark obj = new Mark();
	ArrayList<Mark> M = new ArrayList<Mark>();


public ArrayList<Mark> getM() {
		return M;
	}

	public void setM(ArrayList<Mark> m) {
		M = m;
	}

public int getCourseNum() {
	return courseNum;
}

public void setCourseNum(int courseNum) {
	this.courseNum = courseNum;
}

public String getCourseName() {
	return courseName;
}

public void setCourseName(String courseName) {
	this.courseName = courseName;
}










}
