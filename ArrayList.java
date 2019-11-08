package List;

public class ArrayList<T> implements List<T> {

	T[] a;
	int i = 0;
	
	@SuppressWarnings("unchecked")
	public ArrayList(int initialSize) {
		// TODO Auto-generated constructor stub
		a = (T[]) new Object[initialSize];
	}

	@Override
	public void addFirst(T e) {
		// TODO Auto-generated method stub
		a[i] = e; //first insertion
		i--; //changed from i++ to switch the order values were added in, with i++, value is added to the end, with i-- value is added to the beginning 
		if (i < 0)
			i += a.length; // making the array appear as a ring, the first value loops around to the ending value of the array
	//	a[1] = e; //second insertion
	//	a[2] = e; //third insertion
		
	}
	
	public String toString() {
		String s = "";
		for (int j = i + 1; j != 1; j++) {
			if (j >= a.length) //if j is bigger than the arrayList
				j = 0; // if j is too big, set it to 0
			s += ((j == i + 1 ? "" : ", ") + a[j]); // when value of J is 0, use "", when value of J is not 0, use ", "
		}
		return s;
		
	}


}
