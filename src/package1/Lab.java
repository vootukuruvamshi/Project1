package package1;

public class Lab extends Course {
	
	private String courseId;
	private String studentId;
	
	public Lab(String CourseId,String studentId) {
		super();
		this.courseId=courseId;
		this.studentId=studentId;
		
		
	}
	
	
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
		System.out.println("The student with studentId"+" "+studentId+" "+"took a lecture");
	}
	
	
	
	

}
