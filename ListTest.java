package List;

public class ListTest {
 
	public static void main(String... args) {
		// TODO Auto-generated method stub
//		main("1", "2", "3");
		
		test(new ArrayList<String>(5));
		test(new LinkedList<String>());

	}

	//complete for now
	public static void test(List<String> l) {
		l.addFirst("1");
		l.addFirst("2");
		System.out.println(l.toString());
	}
	

}
