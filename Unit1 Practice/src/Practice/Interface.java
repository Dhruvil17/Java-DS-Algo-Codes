package Practice;

public class Interface {

	public static void main(String[] args)
	{
		SBI sbi = new SBI();
		System.out.println(sbi.rateOfInterest());
		
		Bank b = new ICICI();
		System.out.println(b.rateOfInterest());
		
		// For Draw Class now //
		Draw d = new Rectangle();
		d.draw();
		d.message();
		
		// For Drawble now//
		Drawable d1 = new Recta();
		d1.draw();
		System.out.println(Drawable.cube(4));
	}
}
