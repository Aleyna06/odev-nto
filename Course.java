package odevIntro;

public class Course {
	//Course veri tipinde �ablon olu�turuyorum
 public Course () { //constructor blo�u 
	 System.out.println("Java/React Kamp�");
	 
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

