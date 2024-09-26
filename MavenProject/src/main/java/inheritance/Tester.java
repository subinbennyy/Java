package inheritance;

public class Tester extends Employee {
	String posting="QA analyst";
	public void work() {
		System.out.println("Working good");
	}
	public static void main(String[] args) {
		Developer d=new Developer();
		d.salary();
		d.designation();
		System.out.println(d.workaround);
		System.out.println(d.position);
		
		Tester t=new Tester();
		t.work();
		t.designation();
		System.out.println(t.posting);
		System.out.println(t.position);
				
		
	}

}
