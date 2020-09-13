package Vector;
import java.util.*;

public class VectorMain {

	public static void main(String[] args) {

		// Vector has all the methods of ArrayList
		// It uses synchronized for all the methods
		// For efficient programs and good time complexity use vector over ArrayList
		
		Vector<Integer> v = new Vector<Integer>();
		v.add(28);
		v.add(45);
		System.out.println(v);

	}
}
