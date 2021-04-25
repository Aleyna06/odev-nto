package odevIntro;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Course course1= new Course(1,"Java/React Kampı ","Engin hocayla ramazanda java kampi ","24.04.2021");
		
		Course course2= new Course();
	        course2.name="C#/React Kampı";
	        course2.id=2;
	        course2.details="Yazılım Geliştirici Yetiştirme Kampı (C# + ANGULAR)";
	        course2.date="09.01.2021";
		
	       Course[] courses= {course1,course2};
		
	       for (Course course : courses) {
	            System.out.println(course.name+" "+course.details+" "+course.date);
	        }
	       System.out.println(course1.id+"  "+course1.name+"  "+course1.details+"  "+course1.date);
	       
	       Category category1=new Category();
	        category1.id=1;
	        category1.Name="Courses";
	        
	        CourseManager courseManager=new CourseManager();
	        courseManager.girisyap(course1);

}
}
