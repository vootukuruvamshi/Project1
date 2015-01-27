package package1;

public class Lectures extends Course{
	
	private  String courseId;
	private String studentId;
	
	public Lectures(String CourseId,String studentId) {
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
	
	public void courseType()
	{
		System.out.println("The student with studentId"+studentId+"took a lecture");
	}
	

}
