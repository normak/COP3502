public class Employee {
	private String fName = "";
	private String mName = "";
	private String lName = "";
	private String ID = "";
	private String title = "";
	private String startDate = "";
	Employee(String a, String b, String c, String d, String e, String f) {
		fName = a;
		mName = b;
		lName = c;
		ID = d;
		title = e;
		startDate = f;
	}
	public void SetNames (String name) {
		String[] tokens = name.split(" ", 0);
		if (tokens.length == 3) {
			fName = tokens[0];
			mName = tokens[1];
			lName = tokens[2];
		}
		if (tokens.length == 2) {
			fName = tokens[0];
			lName = tokens[1];
		}
		if (tokens.length > 3) {
			System.out.println("Error, name length is too long.");
		}
	}
	public void SetID (String id) {
		int numberid = 0;
		String[] tokens = id.split("-", 0);
		if (tokens.length==3 && tokens[0].length()==3) {
			if (tokens[1].length() == 2 && tokens[2].length() == 4) {
				ID = id;
			}
		}
		else {
			System.out.println("Error. Improper format.");
		}
	}
	public void SetTitle (String t) {
		String m = "Manager";
		String tm = "Team Member";
		String c = "CEO";
		if (t.equals(m)) {
			title = t;
		}
		else if (t.equals(tm)) {
			title = t;
		}
		else if (t.equals(c)) {
			title = t;
		}
		else {
			System.out.println("Error. Invalid job title.");
		}
	}
	public void SetStartDate (String date) {
		if (date.length() == 10 || date.length() == 9) {
			startDate = date;
		}
		else {
			System.out.println("Error, improper date format.");
		}
	}
	public String GetfName() {
		return fName;
	}
	public String GetmName() {
		return mName;
	}
	public String GetlName() {
		return lName;
	}
	public String GetID() {
		return ID;
	}
	public String GetTitle() {
		return title;
	}
	public String GetStartDate() {
		return startDate;
	}
	public String toString() {
		String info = "Name: "+lName+", "+fName+"\nTitle: "+title+"\nID: "+ID+"/nStarting Date: "+startDate;
		return info;
	}}