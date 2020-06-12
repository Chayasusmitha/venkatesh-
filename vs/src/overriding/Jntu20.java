package overriding;

public class Jntu20 extends Jntu19 {
	int i=50;
	void add() {
		System.out.println("20");
	}
	void susmitha() {
		System.out.println(this.i+super.i);
	}

}
