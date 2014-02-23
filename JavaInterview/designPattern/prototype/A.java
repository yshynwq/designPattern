package prototype;

public class A implements Prototype, Cloneable{
	private int size;
	public void setSize(int size) {
		this.size = size;
	}

	public void printSize() {
		System.out.println("size = "+size);
	}
	
	@Override
	protected A clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return (A)super.clone();
	}

}
