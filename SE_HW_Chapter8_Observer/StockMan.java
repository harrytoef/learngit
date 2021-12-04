package observer;

import java.util.*;

public class StockMan {
	private String stockName;
	
	List<BrokerInterface> mb;
	
	protected StockMan(String name){
		this.stockName = new String(name);
		mb = new ArrayList<>();
	}
	
	public void register(BrokerInterface b){
		mb.add(b);
	}
	
	public void _notify(){
		for(BrokerInterface bi : mb){
			bi.update(this.getStockname());
		}
	}
	
	public String getStockname(){
		return this.stockName;
	}
	
}
