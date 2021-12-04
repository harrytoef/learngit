package composite;

public class Grow {
	public static void main(String[] args){
		Branches component = new Branches("component0");
		Branches component001 = new Branches("component001");
		Branches component002 = new Branches("component002");

        Component Leaf001 = new Leafs("leaf001");
        Component Leaf002 = new Leafs("leaf002");
        
        component001.add(Leaf001);
        component002.add(Leaf002);
        
        component.add(component001);
        component.add(component002);
        
        component.getself();
	}
}
