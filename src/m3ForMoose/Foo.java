package m3ForMoose;

public class Foo extends AbstractFoo {
	
	int x;
	Object o;
	
	Foo() {
		x = 1;
		o = new Object();
	}

	@Override
	public void bar() {
		int l = 10;
		System.out.println("foobar!");
		this.baz(l);
	}

	private void baz(int z) {
		x++;
	}

}
