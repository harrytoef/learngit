package composite;

public class Leafs implements Component{
	private String name;
	
	public Leafs(String name){
		this.name = new String(name);
	}
	
	public void operation(){
		System.out.println("Do something");
	}
	
	public String getName(){
		return this.name;
	}

	@Override
	public void getself() {
		// TODO Auto-generated method stub
		System.out.println(this.name);
	}

	@Override
	public Component returnself() {
		// TODO Auto-generated method stub
		return this;
	}
	
	@Override
	public String toString(){
		return "Leaf [name= "+name+"]";
	}
	
}
