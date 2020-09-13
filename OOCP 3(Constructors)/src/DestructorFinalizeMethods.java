public class DestructorFinalizeMethods {

	public static void main(String[] args) {
		
		 DestructorFinalizeMethods s = new  DestructorFinalizeMethods(); 
	       
		    s.name="Dishant";
	        s.finalize();
	        System.gc();
	        System.out.println("Main Completes"); 
	        System.out.println(s.name);
	}
	String name="Dhruvil";
	public void finalize() 
    { 
		System.out.println("Finalize method Overridden");
    }
}
