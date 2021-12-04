package composite;

import java.util.*;

public class Branches implements Component{
	
	private String name;
	
	List<Component> ll;

	public Branches(String name){
		this.name = new String(name);
		ll = new ArrayList<>();
	}
	
	@Override
	public void getself() {
		// TODO Auto-generated method stub
		System.out.println(this);
	}

	@Override
	public Component returnself() {
		// TODO Auto-generated method stub
		return this;
	}
	
	public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
	
    public void prune(Component component){
    	if(ll.contains(component))
    		ll.remove(component);
    }
    
    public void add(Component com){
    	ll.add(com);
    }
	
    public List<Component> getChild(){
    	return ll;
    }
    
    public void operation(){
    	System.out.println("Do something");
    }
    
    @Override
    public String toString(){
    	return "Composite [name=" + name + ", components=" + ll + "]";
    }
}
