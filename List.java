package List;

public interface List<T> {//type parameter of the elements, could be any letter as long as consistent

	//void add(Object string); //past practice, errors when running
	void addFirst (T e); //modern practice
	
	public String toString(); 

}
