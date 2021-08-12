
public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s = new Student("X", 01);
		System.out.println(s.getName());
		System.out.println(s.getId());
        s.setId(2);
        System.out.println(s.getId());
        System.out.println(s.getName());
		System.out.println(s.getId());
		System.out.println(s.toString());
        
	}

}
