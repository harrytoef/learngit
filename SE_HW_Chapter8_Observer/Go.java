package observer;

import java.util.*;

public class Go {
	public static void main(String[] args){ 
		List<Broker> bl = new ArrayList<>();
		List<Stock> sl = new ArrayList<>();
		int flag = 0;
		Scanner sc = new Scanner(System.in);
		while(flag==0){
			int i=0;
			System.out.println("����ѡ��");
			System.out.println("1�½�ȯ��");
			System.out.println("2�½���Ʊ");
			System.out.println("3ȯ��ѡ���Ʊ");
			System.out.println("4���Ĺ�Ʊ�۸�");
			System.out.println("5�˳�");
			i = sc.nextInt();
			switch(i){
			
				case 1:
					System.out.println("input name");
					String name = sc.next();
					bl.add(new Broker(name));
					System.out.println("add broker "+name+"  no. "+bl.size());
					break;
					
				case 2:
					System.out.println("input name");
					String name1 = sc.next();
					System.out.println("input value");
					int ii = sc.nextInt();
					sl.add(new Stock(name1, ii));
					System.out.println("add stock "+name1+"  no. "+sl.size());
					break;
					
				case 3:
					System.out.println("input broker no.");
					ii = sc.nextInt();
					System.out.println("input stock no.");
					int iii = sc.nextInt();
					bl.get(ii-1).newStock(sl.get(iii-1));
					break;
					
				case 4:
					System.out.println("input brokerValue");
					ii = sc.nextInt();
					System.out.println("input stock no.");
					iii = sc.nextInt();
					sl.get(iii-1).setValue(ii);
					break;
					
				case 5:
					flag = 1;
					break;
					
				default:
					break;
					
			}
		}
		sc.close();
	}
}
