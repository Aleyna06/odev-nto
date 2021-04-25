package odevIntro;

public class Course {
	//Course veri tipinde þablon oluþturuyorum
 public Course () { //constructor bloðu 
	 System.out.println("Java/React Kampý");
	 
 }
 public Course(int id,String name,String details,String date) {
	 this();
     this.id=id;
     this.name=name;
     this.details=details;
     this.date=date;
 };
 int id;
 String name;
 String details;
 String date;
	 
 }

