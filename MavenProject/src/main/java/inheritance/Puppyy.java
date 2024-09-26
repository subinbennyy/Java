package inheritance;

public class Puppyy extends Dog {
	int aggressive=22;
	public void aggression() {

		System.out.println("too aggressive");
	}

	public static void main(String[] args) {
		
		Puppyy b=new Puppyy();
		b.aggression();
		b.name();
		b.belgium();
		System.out.println(b.aggressive);
		System.out.println(b.Name);
		System.out.println(b.age);

	}

}
