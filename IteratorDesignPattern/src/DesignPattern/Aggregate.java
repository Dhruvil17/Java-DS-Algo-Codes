package DesignPattern;

public interface Aggregate {

	public Iterator createIterator();

	public void add(Object item);
	
	public Object getAt(int index);
	
	public void remove(int index);
	
	public int size();
	
}
