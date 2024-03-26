package edu.kh.jsp.student.model.dto;

public class Student {

	// field
	private String studentNo;
	private String studentName;
	private String address;
	private String departmentName;
	
	public Student() {
		// TODO Auto-generated constructor stub
	}

	public Student(String studentNo, String studentName, String address, String departmentName) {
		super();
		this.studentNo = studentNo;
		this.studentName = studentName;
		this.address = address;
		this.departmentName = departmentName;
	}

	public String getStudentNo() {
		return studentNo;
	}

	public void setStudentNo(String studentNo) {
		this.studentNo = studentNo;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getDepartmentName() {
		return departmentName;
	}

	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}

	@Override
	public String toString() {
		return "Student [ 학번 : " + studentNo + ", 이름 : " + studentName + ", 주소 : " + address
				+ ", 학과명 : " + departmentName + " ] ";
	}
	
	
	
}
