

package org.practicaltest.model;

public class Student implements Comparable<Student> {
	private int studId;
	private String StudName;
	
	public Student(int studId, String studName) {
		super();
		this.studId = studId;
		this.StudName = studName;
	}

	public int getStudId() {
		return studId;
	}

	public String getStudName() {
		return StudName;
	}

	@Override
	public String toString() {
		return "Student [studId=" + studId + ", StudName=" + StudName + "]";
	}

	@Override
	public int compareTo(Student o) {
		String scurrent=this.getStudName();
		String sprev=o.getStudName();
		int com=scurrent.compareTo(sprev);
		
				return com;
	}
	
	
	
	
}
