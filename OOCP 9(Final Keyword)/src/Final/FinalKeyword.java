package Final;

public class FinalKeyword {
	
	final int rollNo = 32;
	public static void main(String[] args) {
		
		// Final -> Restrictions (This is Final)
		// Final can not be changed, cannot be overridden, cannot be extended
		final String name="Dhruvil"; // Variable is final // Local is allowed //
        System.out.println("My name is "+name);
        final Student obj1 = new Student();
        obj1.name = "Dishant";
	}
}
