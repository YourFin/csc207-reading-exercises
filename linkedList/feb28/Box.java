public class Box<TT> {
	private TT value;
	public Box (TT value) {
		this.value = value;
	}
	public TT getValue() {
		return value;
	}
	public void setValue(TT value)
	{
		this.value = value;
	}
}
