package Programs;

public class MainClass {

	public static void main(String[] args) {
		
		Rectangle rectangle = new Rectangle();
		rectangle.setDimension(5,6);
		rectangle.getDimension();
		rectangle.getArea();
		Box box = new Box();
		box.setDimension(10,10,5);
        box.getArea(); 
        
		rect rec = new rect();
		rec.draw();
		circ cir = new circ();
		cir.draw();
		diamond dia = new diamond();
		dia.draw();
	}
}
