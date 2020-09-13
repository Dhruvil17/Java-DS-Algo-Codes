package Encapsulation;

public class Encapsulation {

	public static void main(String[] args) {
	
		// Make Variables private first
		// Make getters and setters method by your logic
		Student obj = new Student();
		// Use of setters and getters methods //
		obj.setAge(19);
		System.out.println(obj.getAge());
        obj.setName("Dhruvil");
        System.out.println(obj.getName());
        // Encapsulation refers to bundling of related fields and methods together. This allows us to achieve Data Hiding
        // Encapsulation in itself is not Data Hiding
	}
}
