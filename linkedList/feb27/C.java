package feb27;
public class C implements I {
	public void foo() {
		System.out.println ( "C.foo");
	}
	public void bar () {
		System .  out .  println ( "C.bar");
	}
	public static void main(String[] args) {
		I cc = new C();
		cc.foo();
		cc.bar();
	}
}
