public class Fan {
	public static int SLOW = 1;
	public static int MEDIUM = 2;
	public static int FAST = 3;
	public int speed = SLOW;
	public boolean on = false;
	public String color = "blue";
	Fan(int s, String c, boolean o) {
		speed = s;
		color = c;
		on = o;
	}
	public String toString() {
		String result = "";
		if (on==true) {
			result = "The fan is on. ";
		}
		if (speed==1 && on==true) {
			result += "The speed is set to slow. ";
		}
		if (speed==2 && on==true) {
			result += "The speed is set to medium. ";
		}
		if (speed==3 && on==true) {
			result += "The speed is set to fast. ";
		}
		result += "The color of the fan is "+ color+ ". "; 
		if (on ==false) {
			result += "The fan is off.";
		}
		return result;
	}
}
