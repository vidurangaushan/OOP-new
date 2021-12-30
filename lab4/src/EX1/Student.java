//Lab_4
package EX1;

public class Student {
	
	private int studentID;
	private String name,degree,mobile;
	
    private static int max = 100;
    
	public Student(String name, String degree, String mobile) {
	
		this.name = name;
		this.degree = degree;
		this.mobile = mobile;
		
	}

	  public Student() {
		// TODO Auto-generated constructor stub
	  }

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDegree() {
		return degree;
	}

	public void setDegree(String degree) {
		this.degree = degree;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	
	//static method to generate uniqStudent ID
	public static int getNextStudentID() {
		return max++;
	}
	
	public void print() {
		System.out.println("ID : "+getNextStudentID()+"\nStudent Name : "+name+"\nDegree : "+degree+"\nMobile : "+mobile+"\n" );
		
	}

}
