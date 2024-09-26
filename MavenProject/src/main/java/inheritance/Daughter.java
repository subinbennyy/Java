package inheritance;

public class Daughter extends Father {
	public void job() {
		System.out.println("She is working as a Teacher");
	}
	

	public static void main(String[] args) {
		Daughter d=new Daughter();
		d.job();
		d.age();
		d.name();
		
		Son s=new Son();
		s.Graduation();
		s.age();
		s.name();
		
		

	}

}
