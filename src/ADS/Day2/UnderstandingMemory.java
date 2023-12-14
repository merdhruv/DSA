package in.cdac.blr.day2;

public class UnderstandingMemory {

	public static void main(String[] args) {
		new UnderstandingMemory().createStudent();
	}
	public void createStudent() {
		Student s1 = new Student();
		s1.name = new String("Nitin Prakash");
		s1.subject = new String("DBMS");
		s1.marks = 99;
		Student s2 = new Student("Piyush Kore", "ADS", 98);
	}
}

class Student {
	String name;
	String subject;
	int marks;
	public Student() {
	}
	public Student(String name, String subject, int marks) {
		this.name = name;
		this.subject = subject;
		this.marks = marks;
	}
}



