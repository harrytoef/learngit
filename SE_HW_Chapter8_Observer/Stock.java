package observer;

public class Stock extends StockMan{
	
	protected Stock(String name, int value) {
		super(name);
		this.value = value;
	}

	private int value;
	
	public int getValue(){
		return this.value;
	}
	
	public void setValue(int v){
		this.value = v;
		super._notify();
	}
}
