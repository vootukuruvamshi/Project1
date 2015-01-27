package package1;

public class Course {
	
	private String courseId;
	private String studentId;


		
		
	
	public String getStudentId() {
		return studentId;
	}
	public void setStudentId(String studentId) {
		this.studentId = studentId;
	}
	
	
	public String getCourseId() {
		return courseId;
	}
	public void setCourseId(String courseId) {
		this.courseId = courseId;
	}
	
	public void courseType(String studentId)
	{
		System.out.println("The student with studentId"+studentId+"took a Course");
	}
	
	
	
	
	
	
	
	

}
