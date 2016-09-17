public class Pet {
	public String name = "";
	public int age = 0;
	public int weight = 0;
	Pet(String n, int a, int w) {
		name = n;
		age = a;
		weight = w;
	}
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	public int getWeight() {
		return weight;
	}
}
