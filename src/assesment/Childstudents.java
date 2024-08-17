package assesment;

public class Childstudents extends students {
	void sports() {
		System.out.println("He is good in sports");
	}

	public static void main(String[] args) {
Childstudents ss = new Childstudents();
ss.sports();
ss.study();
System.out.println(ss.name);
System.out.println(ss.age);
System.out.println(ss.grade);
	}

}
