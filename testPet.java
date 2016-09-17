public class testPet {
	public static void main(String[] args) {
	Pet[] Pets = new Pet[5];
	//"Name", age, weight
	Pets[0] = new Pet("Brody", 7, 10);
	Pets[1] = new Pet("Garfield", 6, 30);
	Pets[2] = new Pet("ChiChi", 5, 1);
	Pets[3] = new Pet("Peter", 3, 6);
	Pets[4] = new Pet("Ekans", 4, 15);

	int meanweight = averageWeight(Pets);
	int meanage = averageAge(Pets);
	System.out.println("The smallest pet is: "+smallest(Pets));
	System.out.println("The biggest pet is: "+biggest(Pets));
	System.out.println("The youngest pet is: "+youngest(Pets));
	System.out.println("The oldest pet is: "+oldest(Pets));
	System.out.println("Average weight of the five pets: "+meanweight+" pounds.");
	System.out.println("Average age of the five pets: "+meanage+" years old.");

	}
	public static String biggest(Pet[] a) {
	int biggest = 0;
		int j = 1;
		int i = 1;
		for (i = 0; i < a.length; i++) {
			if (a[i].weight > biggest) {
				biggest = a[i].weight;
			}
		}
		for (j = 0; j < a.length; j++) {
			if (a[j].weight==biggest) {
				break;
			}
		}
		return a[j].name;
	}
	public static String oldest(Pet[] a) {
		int oldest = 0;
		int j = 1;
		int i = 1;
		for (i = 0; i < a.length; i++) {
			if (a[i].age > oldest) {
				oldest = a[i].age;
			}
		}
		for (j = 0; j < a.length; j++) {
			if (a[j].age==oldest) {
				break;
			}
		}
		return a[j].name;
	}
	public static String youngest(Pet[] a) {
		int youngest = 10000;
		int j = 1;
		int i = 1;
		for (i = 0; i < a.length; i++) {
			if (a[i].age < youngest) {
				youngest = a[i].age;
			}
		}
		for (j = 0; j < a.length; j++) {
			if (a[j].age==youngest) {
				break;
			}
		}
		return a[j].name;
	}
	public static String smallest(Pet[] a) {
		int smallest = 10000;
		int j = 1;
		int i = 1;
		for (i = 0; i < a.length; i++) {
			if (a[i].weight < smallest) {
				smallest = a[i].weight;
			}
		}
		for (j = 0; j < a.length; j++) {
			if (a[j].weight==smallest) {
				break;
			}
		}
		return a[j].name;
	}
	public static int averageWeight(Pet[] a) {
		int totalweight = 0;
		for (int i = 0; i < a.length; i++) {
			totalweight += a[i].weight;
		}
		int averageWEIGHT = totalweight / a.length;
		return averageWEIGHT;
	}
	public static int averageAge(Pet[] a) {
		int totalage = 0;
		for (int i = 0; i <a.length; i++) {
			totalage += a[i].age;
		}
		int averageAGE = totalage / a.length;
		return averageAGE;
	}
}
