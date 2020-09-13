package Inheritance;

public class MainClass {

	public static void main(String[] args) {
		
		// Inheritance Concepts // 
		Teacher t = new Teacher("Rudresh Sir");
		Singer s = new Singer("Oprah");
      	t.name = "Manoj Sir";
		t.eat();
		t.walk();
		t.teach();
		t.laugh();
//		Singer s = new Singer();
//		s.name = "Oprah";
//		s.eat();
//		s.walk();
//		s.laugh();
//		Teacher t2 = new Teacher();
//		// Casting of Objects //
//		// 1 Upcasting
//		Person p = t2;
//		p.name = "Hardik Sir";
//		p.eat();
//		p.laugh();
//		// 2 Downcasting
//		Teacher t3 = new Teacher();
//		Person p2 = t3;
//		Teacher t4 = (Teacher)p2;
//		t3.name = "Rutvij Sir";
//		t3.laugh();
//		t3.eat();
		// Instanceof keyword in Java
//		System.out.println(t3 instanceof Teacher);
//		System.out.println(p2 instanceof Teacher);
//		System.out.println(t4 instanceof Teacher);
//		System.out.println(p2 instanceof Singer);
		// Super keyword used to access the immediate parent class of a child or subclass //
		
	}
}
