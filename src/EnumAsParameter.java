
enum Course{
	Hindi,English,Science,Maths
}

class Student{
	private String name;
	private Course course;
	
	public Student(String name,Course course) {
		this.name = name;
		this.course = course;
	}
	
	Course getCourse() {
		return this.course;
	}
	
}
public class EnumAsParameter {
	
	public static void main(String[] args) {
		Student std = new Student("Saurabh",Course.Hindi);
		System.out.println(std.getCourse());
	}

}
