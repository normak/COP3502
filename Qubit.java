public class Qubit {
	public double a = 1;
	public double b = 0;
	Qubit(int A, int B) {
		a=A;
		b=B;
	}
	public boolean observe() {
		if(Math.pow(a,2) > Math.pow(b,2)) {
			return true;
		}
		else {
			return false;
		}
	}
}
