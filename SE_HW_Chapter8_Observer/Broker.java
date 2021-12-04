package observer;
import java.util.*;
public class Broker implements BrokerInterface{
	
	private String brokername;
	
	List<Stock> ms;
	
	public Broker(String name){
		this.brokername = new String(name);
		ms = new ArrayList<>();
	}
	
	public void update(String stockName){
		System.out.println("brokername  "+this.brokername);
		System.out.println("stockname  "+stockName);
		for(Stock s : ms){
			if(s.getStockname().equals(stockName))
				System.out.println("new price  "+s.getValue());
		}
	}
	
	public void newStock(Stock s){
		ms.add(s);
		s.register(this);
	}
}
