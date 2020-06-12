package polymorphism;

public class Polyexe {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Jntu19 bo=new Jntu19();
		//over loading with different parameters//
		bo.add();
		bo.add(40, 50);
		bo.add(30, 40, 50);
		//over loading with different data types//
		bo.add(20, 10);
		bo.add(2.0f, 3.1f);
		

	}

}
