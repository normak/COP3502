import java.util.Scanner;
public class roster {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Student[] students = new Student[100];
		System.out.println("Roster");
		System.out.print("Enter '1' to add a student, '2' to drop a student, '3' to display the current roster, or '4' to exit the program: ");
		for (int i = 0; i < students.length; i++) {
			students[i] = new Student("", 0, "");
		}
		
		for (int i = 0; i < 9000; i++) {
			int AddorDrop = input.nextInt();
			if(AddorDrop == 1) {
				enroll(students);
			}
			if(AddorDrop == 2) {
				drop(students);
			}
			if(AddorDrop == 3) {
				display(students);
			}
			if(AddorDrop == 4) {
				break;
			}
		}
	}
	public static void enroll(Student[] a) {
		Scanner input = new Scanner(System.in);
		int i = 1;
		System.out.print("Enter student's name: ");
		String nam = input.next();
		System.out.print("Enter student's UFID: ");
		int ufid = input.nextInt();
		System.out.print("Enter student's DOB: ");
		String dob = input.next();
		for (i = 0; i < a.length; i++) {
			if(a[i].getUFID()==0) {
				break;
			}
		}
		Student stud = new Student(nam, ufid, dob);
		a[i] = stud;
	}

	public static void drop(Student[] a) {
		int i =0;
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the UFID of the student you wish to drop: ");
		int dropped = input.nextInt();
		for (i = 0; i < a.length; i++) {
			if(a[i].getUFID()==dropped) {
				a[i].setUFID(0);
				break;
			}
		}
		System.out.println(a[i].getName()+" has been dropped.");
	}
	public static void display(Student[] a) {
		for (int i = 0; i < a.length; i++) {
			if(i==0) {
				System.out.println("Name\tUFID\t\tDOB");
			}
			if(a[i].getUFID()==0) {
				break;
			}
			System.out.println(a[i].getName()+"\t"+a[i].getUFID()+"\t"+a[i].getDob());
		}
	}
}
		
