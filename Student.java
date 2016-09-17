public class Student {
	private String name = "Blah";
	private int UFID = 0;
	private String DOB = "Blah";
	private int numberOfStudents = 0;
	Student(String n, int id, String dob) {
		name = n;
		UFID = id;
		DOB = dob;
	}
	public String getName() {
		return name;
	}
	public int getUFID() {
		return UFID;
	}
	public String getDob() {
		return DOB;
	}
	public void setName(String studentName) {
		name = studentName;
	}
	public void setUFID(int id) {
		UFID = id;
	}
	public void setDob(String b) {
		DOB = b;
	}
}
